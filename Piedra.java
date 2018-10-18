/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.JPanel;
/**
 *
 * @author abel
 */
public class Piedra extends Ser{
    
public Piedra(String especie,Icon imagenCria,Icon imagenAdulto,boolean hembra,JPanel panel,ArrayList colonia,
                  int esperanzadevida,int limiteedadreproduccion,int edadadulta,int limitedescendientes,
                  int traslacion,int hambre
                  ){
        
        
        super( especie,null,imagenCria,imagenAdulto,hembra,panel,colonia,
                  esperanzadevida,limiteedadreproduccion,edadadulta,limitedescendientes,traslacion,hambre);
        
}

public Object clone(){
Piedra piedra=new Piedra(especie,imagenCria,imagenAdulto,hembra,panel,colonia,
               esperanzadevida,limiteedadreproduccion,edadadulta,limitedescendientes,traslacion,hambre);
 piedra.x+=10-(int)random.nextFloat()*20;
 piedra.y+=10-(int)random.nextFloat()*20;
 return piedra;
}


    public void reproducete(Ser otro){
            
if (hacinado()) return;
     
      if (relojbiologico>limiteedadreproduccion) return;
    
    if (esAdulto()&& totalhijos<limitedescendientes)
            {
                        
            Piedra des=new Piedra(especie,imagenCria,imagenAdulto,hembra,panel,colonia,
               esperanzadevida,limiteedadreproduccion,edadadulta,limitedescendientes,traslacion,hambre);
            des.x=x+(-10+(int)random.nextFloat()*20);
            des.y=y+(-10+(int)random.nextFloat()*20);
                                  
            totalhijos++;
                 
            }
    
      
    panel.validate();


}
    
    
    

public void alimentate(Ser otro){
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
