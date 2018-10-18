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
public class Planta extends Ser{
   
    public Planta(String especie,Icon imagenCria,Icon imagenAdulto,boolean hembra,JPanel panel,ArrayList colonia,
                  int esperanzadevida,int limiteedadreproduccion,int edadadulta,int limitedescendientes,
                  int traslacion,int hambre
                  ){
        
        
        super(  especie,null,imagenCria,imagenAdulto,hembra,panel,colonia,
                  esperanzadevida,limiteedadreproduccion,edadadulta,limitedescendientes,0,hambre);
        

}

private  boolean sexo=true;

public Object clone(){
Planta p= new Planta(especie,imagenCria,imagenAdulto,hembra,panel,colonia,
               esperanzadevida,limiteedadreproduccion,edadadulta,limitedescendientes,traslacion,hambre);
        p.x+=10-(int)random.nextFloat()*20;
        p.y+=10-(int)random.nextFloat()*20;
return p;

}


public void reproducete(Ser otro){
      
    if (hacinado()) return;
     
      if (relojbiologico>limiteedadreproduccion) return;
    
    if (esAdulto()&& totalhijos<limitedescendientes)
            {
            sexo=!(sexo);
                
            Planta des=new Planta(especie,imagenCria,imagenAdulto,hembra,panel,colonia,
               esperanzadevida,limiteedadreproduccion,edadadulta,limitedescendientes,traslacion,hambre);
               des.x+=10-(int)random.nextFloat()*20;
               des.y+=10-(int)random.nextFloat()*20;
               des.sexo=sexo;   
                     
               totalhijos++;
                 
            }
    
      
    panel.validate();
}
 
public void alimentate(Ser otro){
   
      if (otro instanceof Agua
              &&
          otro.esAdulto()
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
   
      if (otro instanceof Tierra
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



}
