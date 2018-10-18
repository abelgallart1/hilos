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
public class Jugador extends Ser{
  Icon imagenAdultoDer;
  int puntos,caza,nivel;
  
    public Jugador(String especie,String audio,Icon imagenCria,Icon imagenAdulto,Icon imagenAdultoDer,
             boolean hembra,JPanel panel,ArrayList colonia,
                  int esperanzadevida,int limiteedadreproduccion,int edadadulta,int limitedescendientes,
                  int traslacion,int hambre
                  )
    
    {super( especie,audio,imagenCria,imagenAdulto,hembra,panel,colonia,
                  esperanzadevida,limiteedadreproduccion,edadadulta,limitedescendientes,0,hambre);
     this.imagenAdultoDer=imagenAdultoDer;
    
    puntos=1;
    nivel=1;
    caza=0;
    }
    
    public int puntos(){return puntos;}
    
    public int nivel(){
        if (caza>100) {nivel++;caza=0;puntos+=100;}        
        return nivel;
        }
    
    public int caza(){return caza;}
    
    public void imagenDer(){
    
    label.setIcon(imagenAdultoDer);
    
    }
    
    public void imagenIzq(){
    label.setIcon(imagenAdulto);
    }
    
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
timer1.scheduleAtFixedRate(timerTask1, 0,hambre);
direccion.scheduleAtFixedRate(timerTask2, 0,500+(int)random.nextFloat()*500);

}





public void muere() {
   try {  
          if (clip!=null) clip.close();
         if (audio2!=null) audio2.close();
                
         colonia.remove(this);
         panel.remove(label);
         label.setVisible(false);
         if (timer!=null)timer.cancel();
         if (timer1!=null) timer1.cancel();
         if(direccion!=null) direccion.cancel();
         
         
         
         Tierra t=new Tierra("tierra",new javax.swing.ImageIcon(getClass().getResource("/hilos/tierra.png")),
                 new javax.swing.ImageIcon(getClass().getResource("/hilos/tierra.png")),
                 hembra, panel, colonia, 1000000, 1000000, 1, 0, 0, 1000000);
         Agua a=new Agua("agua","/audios/agua.wav"
           ,new javax.swing.ImageIcon(getClass().getResource("/hilos/agua.gif")),
                 new javax.swing.ImageIcon(getClass().getResource("/hilos/agua.gif")),
                 hembra, panel, colonia, 1000000, 1000000, 1, 0, 5, 1000000);
         
         t.x=x+(-5+(int)random.nextFloat()*10);t.y=y+(-5+(int)random.nextFloat()*10);
         a.x=x+(-5+(int)random.nextFloat()*10);a.y=y+(-5+(int)random.nextFloat()*10);
         panel.validate();
          
        
         
         finalize();
   
    
   } catch (Throwable ex) {ex.printStackTrace();
     }
    
}


public void desarrollo() throws InterruptedException{
      relojbiologico++;
      
             
           
          
           
           for(int i=0;i<colonia.size();i++)
           {Ser aux=(Ser)colonia.get(i);
            if (Math.abs(x-aux.x)<40&& Math.abs(y-aux.y)<40
                             &&               
                    !aux.equals(this)
                    ){  
                   reproducete(aux);
                   alimentate(aux);
             
                  }
           
            }
               
           
           
            panel.add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(x,y,-1,-1));
            panel.repaint();
            panel.validate();
                    
       

}

   
public Object clone(){

    Jugador hor= new Jugador(especie,audio,imagenCria,imagenAdulto,imagenAdultoDer,hembra,panel,colonia,
               esperanzadevida,limiteedadreproduccion,edadadulta,limitedescendientes,traslacion,hambre);
       hor.x+=10-(int)random.nextFloat()*20;
       hor.y+=10-(int)random.nextFloat()*20; 
return hor;
}

public void alimentate(Ser otro){
   
      if ((otro instanceof Agua
              ||
          otro instanceof Herbivoro
              ||
          otro instanceof Carnivoro
              ||
          otro instanceof Omnivoro
              ||
          otro instanceof Planta
               ||
          otro instanceof Tierra)
              /////////
              &&
          otro.esAdulto()
              &&
          !especie(otro)
             )
         
     {   
         try{ 
          AudioInputStream audio2 = AudioSystem.getAudioInputStream(getClass().getResourceAsStream("/audios/puntos.wav"));
          Clip clip = AudioSystem.getClip();
     
            clip.open(audio2);
             clip.start();
           }catch(Exception ex){ex.printStackTrace();}   
        otro.muere();
       panel.validate();
    
     if (relojbiologico>0) relojbiologico--;
     
     
    }
      
     
}
   
public void reproducete(Ser otro){
    if (!especie(otro)) return;
     
    if (hacinado()) return;
    
    if (relojbiologico>limiteedadreproduccion) return;
    
    if (
         ((esAdulto()&&esHembra()&&otro.esAdulto()&&!otro.esHembra())
                                 || 
        (esAdulto()&&!esHembra()&&otro.esAdulto()&&otro.esHembra()))
                                 &&
                           otro.totalhijos<otro.limitedescendientes
                              
            )
            {
                int sex=(int)(random.nextFloat()*10);
                boolean sexo=(sex==1||sex==2||sex==3||sex==4||sex==5)?true:false;
                
              Ser indi=(Ser)otro.clone();
              
              indi.x+=10-(int)random.nextFloat()*20;
              indi.y+=10-(int)random.nextFloat()*20;
              colonia.add(indi);
              indi.hembra=sexo;
              panel.add(indi.label, new org.netbeans.lib.awtextra.AbsoluteConstraints(indi.x,indi.y,-1,-1));
            totalhijos++;otro.totalhijos++;
                 
            }
    
    
    panel.validate();


}


 
}
