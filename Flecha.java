/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.Icon;
import javax.swing.JPanel;

/**
 *
 * @author abel
 */
public class Flecha extends Ser{
    
    public Flecha(String especie,String audio,Icon imagenCria,Icon imagenAdulto,boolean hembra,JPanel panel,ArrayList colonia,
                  int esperanzadevida,int limiteedadreproduccion,int edadadulta,int limitedescendientes,
                  int traslacion,int hambre
                  )
    
    {   super( especie,audio,imagenCria,imagenAdulto,hembra,panel,colonia,
                  esperanzadevida,limiteedadreproduccion,edadadulta,limitedescendientes,traslacion,hambre);
     
   
    }
    
    
    
public Object clone(){
Flecha hor= new Flecha(especie,audio,imagenCria,imagenAdulto,hembra,panel,colonia,
               esperanzadevida,limiteedadreproduccion,edadadulta,limitedescendientes,traslacion,hambre);
       hor.x+=10-(int)random.nextFloat()*20;
       hor.y+=10-(int)random.nextFloat()*20; 
return hor;
}

public void alimentate(Ser otro){
     
      if ((otro instanceof Herbivoro
              ||
          otro instanceof Carnivoro
              ||
          otro instanceof Omnivoro)    
           )
         
     {   otro.muere();  muere();
       panel.validate();
     
       try{ 
          AudioInputStream audio2 = AudioSystem.getAudioInputStream(getClass().getResourceAsStream("/audios/flecha.wav"));
          Clip clip = AudioSystem.getClip();
     
            clip.open(audio2);
             clip.start();
           }catch(Exception ex){ex.printStackTrace();} 
       
       for(int i=0;i<colonia.size();i++)
       {if (colonia.get(i) instanceof Jugador)
       {((Jugador)colonia.get(i)).caza=((Jugador)colonia.get(i)).caza+1;
         ((Jugador)colonia.get(i)).puntos=((Jugador)colonia.get(i)).puntos+20;
       }
       }
    }
      
           
}
public void reproducete(Ser otro){;}

 public void arrastre(java.awt.event.MouseEvent evt){;}

public void inicializar(){;}



public void camina(){
   
    if (timer!=null) timer.cancel();
    
    timer=new Timer();
    
    if (timer1!=null) timer1.cancel();
    
    timer1=new Timer();
    
    if (direccion!=null) direccion.cancel();
    
    direccion=new Timer();
     
    
    
    
    
  TimerTask timerTask = new TimerTask() {public void run() {try {
      desarrollo();
      } catch (InterruptedException ex) {
          Logger.getLogger(Ser.class.getName()).log(Level.SEVERE, null, ex);
      }
}
                        
                                                           // Aquí el código que queremos ejecutar. 
                                        }; 
TimerTask timerTask1 = new TimerTask() {public void run() {HAMBRE=true;}


                        
                                                           // Aquí el código que queremos ejecutar. 
                                      };

TimerTask timerTask2 = new TimerTask() {public void run() {;}


                        
                                                           // Aquí el código que queremos ejecutar. 
                                      };

     
 
timer.scheduleAtFixedRate(timerTask, 0,10);
timer1.scheduleAtFixedRate(timerTask1, 0,1);
direccion.scheduleAtFixedRate(timerTask2, 0,500+(int)random.nextFloat()*500);

}

public boolean esAdulto(){return(true) ;}
public boolean esHembra(){return(true) ;}

public boolean especie(Ser otro){return false;}

public void muere() {
   
                
         colonia.remove(this);
         panel.remove(label);
         label.setVisible(false);
         if (timer!=null)timer.cancel();
         if (timer1!=null) timer1.cancel();
         if(direccion!=null) direccion.cancel();
         
               
         panel.validate();
         
         
     try {
         finalize();
     } catch (Throwable ex) {
         Logger.getLogger(Ser.class.getName()).log(Level.SEVERE, null, ex);
     }
    
   
    
}

public boolean hacinado(){
 if (colonia.size()>0&&panel.getWidth()/colonia.size()<30)
 { return true; }

 else return false;
}
 

public void desarrollo() throws InterruptedException{
        
        
           int rx=(int)(random.nextFloat()*traslacion);
           int ry=(int)(random.nextFloat()*traslacion);
             
           x+=rx*fx;
           y+=ry*fy;
           
          
           
           for(int i=0;i<colonia.size();i++)
           {Ser aux=(Ser)colonia.get(i);
            if (Math.abs(x-aux.x)<40&& Math.abs(y-aux.y)<40
                             
                    ){  
                        rx=traslacion;
                       // ry=traslacion; 
                        fx=(hembra)?1:-1;
                        
                        x+=rx*fx;
                        //y+=ry*fy;
                                         
                   alimentate(aux);
                   
                  }
           
            }
            
             
            if (x>panel.getWidth()-label.getWidth()) {muere();}
                
            if  (x<0 ) {muere();} 
           
           
           
           if (y>panel.getHeight()-label.getHeight())  {muere(); }
                   
           if (y<0) {muere();} 
            
           
           
            panel.add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(x,y,-1,-1));
            panel.repaint();
            panel.validate();
                    
       

}

    
    
    
}
