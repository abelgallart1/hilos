/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;


import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.Icon;
import java.io.File;
/**
 *
 * @author abel
 */
public class Agua extends Ser {
         
        
         
    public Agua(String especie,String audio,Icon imagenCria,Icon imagenAdulto,boolean hembra,JPanel panel,ArrayList colonia,
                  int esperanzadevida,int limiteedadreproduccion,int edadadulta,int limitedescendientes,
                  int traslacion,int hambre
                  )
    
    {super(especie,audio,imagenCria,imagenAdulto,hembra,panel,colonia,
                  esperanzadevida,limiteedadreproduccion,edadadulta,limitedescendientes,traslacion,hambre);
                
       
    
    }
    
    
            
  public boolean hacinado(){
 if (colonia.size()>0) return (panel.getWidth()/colonia.size()<1);
 else return false;
}
    
    
    public Object clone(){
Agua agua= new Agua(especie,audio,imagenCria,imagenAdulto,hembra,panel,colonia,
               esperanzadevida,limiteedadreproduccion,edadadulta,limitedescendientes,traslacion,hambre);
  
agua.x+=10-(int)random.nextFloat()*20;
agua.y+=10-(int)random.nextFloat()*20;
return agua;
}

 
public void reproducete(Ser otro){
     if (!especie(otro)) return;
     
    if (hacinado()) return;
     
      if (relojbiologico>limiteedadreproduccion) return;
    
    if (esAdulto()&&totalhijos<limitedescendientes)
            {
                        
            Agua des=new Agua(especie,audio,imagenCria,imagenAdulto,hembra,panel,colonia,
               esperanzadevida,limiteedadreproduccion,edadadulta,limitedescendientes,traslacion,hambre);
            des.x=x+(-10+(int)random.nextFloat()*20);
            des.y=y+(-10+(int)random.nextFloat()*20);
                                  
            totalhijos++;
            otro.totalhijos++;     
            }
    
      
    panel.validate();


}

public void alimentate(Ser otro){;}
 

public void muere() {
   try {
         colonia.remove(this);
         panel.remove(label);
         label.setVisible(false);
         if (timer!=null)timer.cancel();
         if (timer1!=null) timer1.cancel();
                
        
         panel.validate();
          finalize();
   } catch (Throwable ex) {ex.printStackTrace();
     }
    
}
 
    
}
