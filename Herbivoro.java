/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.JPanel;
import java.io.File;
/**
 *
 * @author abel
 */
public class Herbivoro extends Ser{
    
    public Herbivoro(String especie,String audio,Icon imagenCria,Icon imagenAdulto,boolean hembra,JPanel panel,ArrayList colonia,
                  int esperanzadevida,int limiteedadreproduccion,int edadadulta,int limitedescendientes,
                  int traslacion,int hambre
                  )
    
    {super( especie,audio,imagenCria,imagenAdulto,hembra,panel,colonia,
                  esperanzadevida,limiteedadreproduccion,edadadulta,limitedescendientes,traslacion,hambre);
     
    }
    
    
    
public Object clone(){
Herbivoro hor= new Herbivoro(especie,audio,imagenCria,imagenAdulto,hembra,panel,colonia,
               esperanzadevida,limiteedadreproduccion,edadadulta,limitedescendientes,traslacion,hambre);
       hor.x+=10-(int)random.nextFloat()*20;
       hor.y+=10-(int)random.nextFloat()*20; 
return hor;
}

public void alimentate(Ser otro){
   
      if ((otro instanceof Agua
              ||
          otro instanceof Planta
              ||
          otro instanceof Tierra)    
           ///////////
               &&
             otro.esAdulto()
              &&
             !especie(otro)
              &&
              HAMBRE)
         
     {   if(otro.timer!=null) otro.timer.cancel();
        if (otro.timer1!=null) otro.timer1.cancel();
        if (otro.direccion!=null) otro.direccion.cancel();
        colonia.remove(otro);
       panel.remove(otro.label);
       otro.label.setVisible(false);
       panel.validate();
     HAMBRE=false;
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
                            totalhijos<limitedescendientes
                                 &&
                            otro.totalhijos<otro.limitedescendientes
                              
            )
            {
                int sex=(int)(random.nextFloat()*10);
                boolean sexo=(sex==1||sex==2||sex==3||sex==4||sex==5)?true:false;
                
          Herbivoro indi=new Herbivoro(especie,audio,imagenCria,imagenAdulto,hembra,panel,colonia,
               esperanzadevida,limiteedadreproduccion,edadadulta,limitedescendientes,traslacion,hambre);
              
              indi.x+=10-(int)random.nextFloat()*20;
              indi.y+=10-(int)random.nextFloat()*20;
              
              indi.hembra=sexo;
                   
            totalhijos++;otro.totalhijos++;
                 
            }
    
    
    panel.validate();


}


    



}

