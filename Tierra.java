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
public class Tierra extends Ser {
  
    public Tierra(String especie,Icon imagenCria,Icon imagenAdulto,boolean hembra,JPanel panel,ArrayList colonia,
                  int esperanzadevida,int limiteedadreproduccion,int edadadulta,int limitedescendientes,
                  int traslacion,int hambre
                  )
    
    {super( especie,null,imagenCria,imagenAdulto,hembra,panel,colonia,
                  esperanzadevida,limiteedadreproduccion,edadadulta,0,0,esperanzadevida);
                
            
    
    }
    
    
            
    
    public Object clone(){
Tierra tierra= new Tierra(especie,imagenCria,imagenAdulto,hembra,panel,colonia,
               esperanzadevida,limiteedadreproduccion,edadadulta,limitedescendientes,traslacion,hambre);
        
         tierra.x+=10-(int)random.nextFloat()*20;
         tierra.y+=10-(int)random.nextFloat()*20;
return tierra;
    }   


public void reproducete(Ser otro){;}
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
