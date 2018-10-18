/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;
import com.sun.glass.events.KeyEvent;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.Color;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import org.netbeans.lib.awtextra.*;


/**
 *
 * @author abel
 */
public class NewApplication extends javax.swing.JFrame {

    /**
     * Creates new form NewApplication
     */
    
Jugador Jugador;
TimerTask timerTask3,timerTask2,timerTask1,timerTask ;

    public NewApplication() {
        initComponents();
        colonia=new ArrayList();
        
         NewJDialog1 jDialog1=new NewJDialog1(this,true);
         jDialog1.setLocationRelativeTo(null);
         while(jDialog1.jugador==null){jDialog1.setVisible(true);}
         Jugador=jDialog1.jugador;
         cargararcaKeyPressed(new java.awt.event.KeyEvent(cargararca,0,0,0,0));
         tierra.setSize(getWidth(),tierra.getHeight());
    
        timer=new Timer();
         timeragua=new Timer();
        timercielo=new Timer();
        timeranimales=new Timer();
                
     timerTask1 = new TimerTask() {@Override 
     public void run(){ 
                                       JLabel jLabel1=new JLabel();     
                                       JLabel jLabel2=new JLabel();
                                       JLabel jLabel3=new JLabel();
                                       JLabel jLabel4=new JLabel();
                                       JLabel jLabel5=new JLabel();
                                       JLabel jLabel6=new JLabel();
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hilos/lluvia.gif"))); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hilos/lluvia.gif"))); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hilos/lluvia.gif"))); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hilos/lluvia.gif"))); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hilos/lluvia.gif"))); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hilos/lluvia.gif"))); // NOI18N
            
         
         
         tierra.add(jLabel6, new AbsoluteConstraints(490, 0, 510, 210));
         tierra.add(jLabel1, new AbsoluteConstraints(-20, 280, 510, 220));
         tierra.add(jLabel2, new AbsoluteConstraints(10, 110, 510, 220));
         tierra.add(jLabel3, new AbsoluteConstraints(0, 0, 510, 210));
         tierra.add(jLabel4, new AbsoluteConstraints(510, 280, 510, 220));
         tierra.add(jLabel5, new AbsoluteConstraints(500, 110, 510, 220));

                                   
                                       jLabel1.setVisible(true);
                                       jLabel2.setVisible(true);
                                       jLabel3.setVisible(true);
                                       jLabel4.setVisible(true);
                                       jLabel5.setVisible(true);
                                       jLabel6.setVisible(true);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
                Logger.getLogger(NewApplication.class.getName()).log(Level.SEVERE, null, ex);
            }
           jLabel1.setVisible(false);
           jLabel2.setVisible(false);  
           jLabel3.setVisible(false);                           
           jLabel4.setVisible(false);                           
           jLabel5.setVisible(false);                            
           jLabel6.setVisible(false); 
            
           
            for(int i=1;i<5;i++)
           new Agua("agua",null,new javax.swing.ImageIcon(getClass().getResource("/imagenes/agua.gif")),
                                new javax.swing.ImageIcon(getClass().getResource("/imagenes/agua.gif")),
                                true,tierra, colonia, 100000, 100000, 1, 0, 5, 100000);
                
          
           
              }};   
    
    Tiempo=0;
    
    lunax=getWidth()*2;int soly=0;
     solx=getWidth();lunay=0;
     nubex1=nubex2=nubex3=getWidth();
    
     timerTask2 = new TimerTask() {public void run(){
            boolean vivo=false;
        for(int i=0;i<colonia.size();i++)
        if (colonia.get(i) instanceof Jugador)vivo=true;
        
                
        if (!vivo)   {
            caza.setValue(0);
            nivel.setValue(0);
            flechas.setValue(0);

            javax.swing.JOptionPane.showMessageDialog
            (null,"Te has quedado sin vidas\n"
                +"Genesis para comenzar\n"
                + "otra vez.","Fin del juego",javax.swing.JOptionPane.OK_OPTION);
            timercielo.cancel();
            timer.cancel();
            timeranimales.cancel();
            timeragua.cancel();
            tierra.removeAll();
                 dispose();
                 NewApplication n= new NewApplication();
        
         
        try{
        
        java.awt.EventQueue.invokeLater(() -> {
         n.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
            n.setLocationRelativeTo(null);
            
            
            n.setVisible(true);
        });
        }catch(Exception ex){;}
                 
                 
                 
                 
                 
        }
                                                
                                                  tierra.setSize(getWidth(),430);
                                                  agua.setSize(getWidth()-10,80);
                                                  cielo.setSize(getWidth()-10, 130);
                                                  Total.setText(colonia.size()+"");
                                                    tiempo.setText(Tiempo+"");Tiempo++;
                                                    
                                                      
                                                    if (colonia.size()>0)
                                                     indice.setText((tierra.getWidth()/colonia.size())+"");
                                                     else indice.setText(0+"");
                                                    
                                                    cielo.add(sol, new AbsoluteConstraints(solx,0,-1,-1));                                                      
                                                   cielo.add(luna, new AbsoluteConstraints(lunax,0,-1,-1));                                                      
                                                   
                                                  cielo.add(nube1, new AbsoluteConstraints(nubex1-100,0,-1,-1));                                                      
                                                 cielo.add(nube2, new AbsoluteConstraints(nubex2-200,0,-1,-1));                                                      
                                                  cielo.add(nube3, new AbsoluteConstraints(nubex3-300,0,-1,-1));                                                      
                                                   
                                                   if (lunax<getWidth()&&lunax>0){
                                                   cielo.add(estrellas2, new AbsoluteConstraints(getWidth()/3, 0, 330, 110));
                                                   cielo.add(estrellas1, new AbsoluteConstraints(0, 0, 350, 110));
                                                  cielo.add(estrellas3, new AbsoluteConstraints(getWidth()*2/3, 0, 330, 110));
                                                   estrellas1.setVisible(true); estrellas2.setVisible(true); estrellas3.setVisible(true);
                                                   }
                                                   else{estrellas1.setVisible(false); estrellas2.setVisible(false); estrellas3.setVisible(false);}
                                                   
                                                  int x=(int)(random.nextFloat()*getWidth());
                                                  int y=(int)(random.nextFloat()*40);
                                                  agua.add(ola1, new org.netbeans.lib.awtextra.AbsoluteConstraints(x, y, 110, 30));
                                                   
                                                  x=(int)(random.nextFloat()*getWidth());
                                                  y=(int)(random.nextFloat()*40);
                                                  agua.add(ola2, new org.netbeans.lib.awtextra.AbsoluteConstraints(x, y, 110, 30));
                                                  
                                                  x=(int)(random.nextFloat()*getWidth());
                                                  y=(int)(random.nextFloat()*40);
                                                  agua.add(ola3, new AbsoluteConstraints(x, y, 110, 30));

                                                                                                    
                                                  if (solx<1) solx=getWidth()*2;
                                                   if (lunax<1) {lunax=getWidth()*2;}  
                                                   if (nubex1<1) nubex1=getWidth();
                                                   if (nubex2<1) nubex2=getWidth();
                                                   if (nubex3<1) nubex3=getWidth();
                                                   
                                                  Color c=new Color(255,255,255);
                                                  Color c1=new Color(255,255,255);
                                                  Color c2=new Color(255,255,255);
                                                  
                                                  if (solx<getWidth()&&solx>0) 
                                                 {c=new Color(125+solx/16,125+solx/16,255);                                            
                                                  }
                                                  
                                                  if (lunax<getWidth()&&lunax>255)
                                                  {c=new Color(lunax/16,lunax/16,lunax/16);
                                                   
                                                  }
                                                  
                                                 if (lunax<255&&lunax>0)
                                                 {c=new Color(0,0,255-lunax);
                                                  
                                                  }
                                                  
                                                  if (lunax<255&&lunax>0){
                                                  c1=new Color(0,255-lunax,0);
                                                 }
                                                  
                                                 else c1=new Color(0,lunax/16,lunax/32);
                                                   
                                                 if (lunax<getWidth()&&lunax>255){
                                                  c2=new Color(0,0,lunax/8);
                                                }
                                                   
                                                 else if (lunax<255) c2=new Color(0,0,255-lunax);
                                                 else  c2=new Color(0,0,150+solx/32);
                                                  
                                                  jPanel6.setBackground(c1);
                                                  tierra.setBackground(c1);
                                                 agua.setBackground(c2);
                                                  cielo.setBackground(c);
                                                  
                                                  solx-=1*Dias;
                                                  lunax-=1*Dias;
                                                  nubex1-=10*Dias; 
                                                  nubex2-=5*Dias;
                                                  nubex3-=2*Dias;
                                                  
                                                  
            
            
            
            
        }};
    
     
     
    timerTask3 = new TimerTask() {@Override
    public void run(){  
                         
                            
        
                                                    int contanimales=0;
                                                    int contplanta=0;
                                                    int contagua=0;
                                                    int contpiedra=0;
                                                    
                                                    
                                                    
                                                    
                                                    
                                                   for(int i=0;i<colonia.size();i++) 
                                                   {Ser in=(Ser)colonia.get(i);
                                                     
                                                   if (in instanceof Herbivoro
                                                           ||
                                                       in instanceof Carnivoro
                                                           ||
                                                       in instanceof Omnivoro) contanimales++;
                                                   
                                                   if (in instanceof Planta) contplanta++;
                                                   if (in instanceof Agua)   contagua++;
                                                   if (in instanceof Piedra)   contpiedra++;
                                                  
                                                   }
                                                if (contagua<Jugador.nivel())
                                                    
                                                    new Agua("agua","/audios/agua.wav",new javax.swing.ImageIcon(getClass().getResource("/imagenes/agua.gif")),
                                new javax.swing.ImageIcon(getClass().getResource("/imagenes/agua.gif")),
                                true,tierra, colonia, 100000, 100000, 1, 0, 5, 100000);
                                                   
                                                   
                                                   
                                                   if (contanimales<Jugador.nivel()){
                                                      
                                                      int t=(int)(random.nextFloat()*10);
                                                   if (t==0){    
                                                       Herbivoro colibri=new Herbivoro("colibri","/audios/colibri.wav",new javax.swing.ImageIcon(getClass().getResource("/imagenes/ave1.gif")),
                                new javax.swing.ImageIcon(getClass().getResource("/imagenes/ave1.gif")),
                                true,tierra, colonia, 4000, 4000, 1000, 2, 3, 500);
                                                       Herbivoro colibrim=new Herbivoro("colibri","/audios/colibri.wav",new javax.swing.ImageIcon(getClass().getResource("/imagenes/ave1.gif")),
                                new javax.swing.ImageIcon(getClass().getResource("/imagenes/ave1.gif")),
                                false,tierra, colonia, 4000, 4000, 1000, 2, 3, 500);
                                                   }
                                                   if (t==1){ 
                                                   Herbivoro cotorra=new Herbivoro("cotorra","/audios/cotorra.wav",new javax.swing.ImageIcon(getClass().getResource("/imagenes/ave2.gif")),
                                new javax.swing.ImageIcon(getClass().getResource("/imagenes/ave2.gif")),
                                true,tierra, colonia, 4000, 4000, 1000, 2, 3, 500);
                                                   
                                                      Herbivoro cotorram=new Herbivoro("cotorra","/audios/cotorra.wav",new javax.swing.ImageIcon(getClass().getResource("/imagenes/ave2.gif")),
                                new javax.swing.ImageIcon(getClass().getResource("/imagenes/ave2.gif")),
                                false,tierra, colonia, 4000, 4000, 1000, 2, 3, 500);
                                                   }
                                                   if (t==2){
                                                      Herbivoro colibriV=new Herbivoro("colibriverde","/audios/colibri.wav",new javax.swing.ImageIcon(getClass().getResource("/imagenes/ave3.gif")),
                                new javax.swing.ImageIcon(getClass().getResource("/imagenes/ave3.gif")),
                                true,tierra, colonia, 4000, 4000, 1000, 2, 3, 500);
                                       
                                                      Herbivoro colibriVm=new Herbivoro("colibriverde","/audios/colibri.wav",new javax.swing.ImageIcon(getClass().getResource("/imagenes/ave3.gif")),
                                new javax.swing.ImageIcon(getClass().getResource("/imagenes/ave3.gif")),
                                false,tierra, colonia, 4000, 4000, 1000, 2, 3, 500);
                                                   }
                                                   if (t==3){
                                                     Carnivoro aguila=new Carnivoro("aguila","/audios/aguila.wav",new javax.swing.ImageIcon(getClass().getResource("/imagenes/ave4.gif")),
                                new javax.swing.ImageIcon(getClass().getResource("/imagenes/ave4.gif")),
                                true,tierra, colonia, 4000, 4000, 1000, 2, 3, 500);
                                                 
                                                     Carnivoro aguilam=new Carnivoro("aguila","/audios/aguila.wav",new javax.swing.ImageIcon(getClass().getResource("/imagenes/ave4.gif")),
                                new javax.swing.ImageIcon(getClass().getResource("/imagenes/ave4.gif")),
                                false,tierra, colonia, 4000, 4000, 1000, 2, 3, 500);
                                                   }
                                                   if (t==4){
                                                     Carnivoro lechuza=new Carnivoro("lechuza","/audios/lechuza.wav",new javax.swing.ImageIcon(getClass().getResource("/imagenes/ave5.gif")),
                                new javax.swing.ImageIcon(getClass().getResource("/imagenes/ave5.gif")),
                                true,tierra, colonia, 4000, 4000, 1000, 2, 3, 500);
                                                
                                                      Herbivoro lechuzam=new Herbivoro("lechuza","/audios/lechuza.wav",new javax.swing.ImageIcon(getClass().getResource("/imagenes/ave5.gif")),
                                new javax.swing.ImageIcon(getClass().getResource("/imagenes/ave5.gif")),
                                false,tierra, colonia, 4000, 4000, 1000, 2, 3, 500);
                                                   }
                                                   if (t==5){
                                                      Omnivoro canibal=new Omnivoro("canibal","/audios/tamborflauta.wav",new javax.swing.ImageIcon(getClass().getResource("/imagenes/canibalP.gif")),
                                new javax.swing.ImageIcon(getClass().getResource("/imagenes/canibal.gif")),
                                true,tierra, colonia, 10000, 10000, 1000, 2, 5, 100);
                                                 
                                                      Omnivoro canibalm=new Omnivoro("canibal","/audios/tamborflauta.wav",new javax.swing.ImageIcon(getClass().getResource("/imagenes/canibalP.gif")),
                                new javax.swing.ImageIcon(getClass().getResource("/imagenes/canibal.gif")),
                                false,tierra, colonia, 10000, 10000, 1000, 2, 5, 100);
                                                   }
                                                   if (t==6){
                                                      Herbivoro elefante=new Herbivoro("elefante","/audios/elefante.wav",new javax.swing.ImageIcon(getClass().getResource("/imagenes/elefanteP.gif")),
                                new javax.swing.ImageIcon(getClass().getResource("/imagenes/elefante.gif")),
                                true,tierra, colonia, 10000, 10000, 2000, 2, 5, 1000);
                                             
                                                      Herbivoro elefantem=new  Herbivoro("elefante","/audios/elefante.wav",new javax.swing.ImageIcon(getClass().getResource("/imagenes/elefanteP.gif")),
                                new javax.swing.ImageIcon(getClass().getResource("/imagenes/elefante.gif")),
                                false,tierra, colonia, 10000, 10000, 2000, 2, 5, 1000);
                                                   }
                                                   if (t==7){
                                                      Herbivoro hormiga=new Herbivoro("hormiga","/audios/blanco.wav",new javax.swing.ImageIcon(getClass().getResource("/imagenes/hormiga.gif")),
                                new javax.swing.ImageIcon(getClass().getResource("/imagenes/hormiga.gif")),
                                true,tierra, colonia, 4000, 1000, 1000, 5, 5, 700);
                                         
                                                     Herbivoro hormigam=new  Herbivoro("hormiga","/audios/blanco.wav",new javax.swing.ImageIcon(getClass().getResource("/imagenes/hormiga.gif")),
                                new javax.swing.ImageIcon(getClass().getResource("/imagenes/hormiga.gif")),
                                false,tierra, colonia, 4000, 1000, 1000, 5, 5, 700);
                                                   }
                                                 if (t==8){
                                                    Carnivoro leon=new Carnivoro("leon","/audios/leon.wav",new javax.swing.ImageIcon(getClass().getResource("/imagenes/leonbebe.png")),
                                new javax.swing.ImageIcon(getClass().getResource("/imagenes/leon.gif")),
                                true,tierra, colonia, 4000, 4000, 1000, 2, 5, 500);
                                                 
                                                    Carnivoro leonm=new Carnivoro("leon","/audios/leon.wav",new javax.swing.ImageIcon(getClass().getResource("/imagenes/leonbebe.png")),
                                new javax.swing.ImageIcon(getClass().getResource("/imagenes/leon.gif")),
                                false,tierra, colonia, 4000, 4000, 1000, 2, 3, 500);
                                                   }
                                                   if (t==9){
                                                    Herbivoro mariposaA=new Herbivoro("mariposa",null,new javax.swing.ImageIcon(getClass().getResource("/imagenes/mariposaazul.gif")),
                                new javax.swing.ImageIcon(getClass().getResource("/imagenes/mariposaazul.gif")),
                                true,tierra, colonia, 4000, 1000, 1000, 5, 5, 700);
                                                 
                                                    Herbivoro mariposaAm=new  Herbivoro("mariposa",null,new javax.swing.ImageIcon(getClass().getResource("/imagenes/mariposaazul.gif")),
                                new javax.swing.ImageIcon(getClass().getResource("/imagenes/mariposaazul.gif")),
                                false,tierra, colonia, 4000, 1000, 1000, 5, 5, 700);
                                                   }
                                                   if (t==10){
                                                    Herbivoro mariposaR=new Herbivoro("mariposa",null,new javax.swing.ImageIcon(getClass().getResource("/imagenes/mariposarosa.gif")),
                                new javax.swing.ImageIcon(getClass().getResource("/imagenes/mariposarosa.gif")),
                                true,tierra, colonia, 4000, 1000, 1000, 5, 5, 700);
                                              
                                                    Herbivoro mariposaRm=new  Herbivoro("mariposa",null,new javax.swing.ImageIcon(getClass().getResource("/imagenes/mariposarosa.gif")),
                                new javax.swing.ImageIcon(getClass().getResource("/imagenes/mariposarosa.gif")),
                                false,tierra, colonia, 4000, 1000, 1000, 5, 5, 700);
                                                   }
                                                     }
                                                   
                                                   
                                                   if (contpiedra<Jugador.nivel())
                                                       new Piedra("piedra",new javax.swing.ImageIcon(getClass().getResource("/imagenes/piedra"
                                                               +(int)(1+random.nextFloat()*6)+".gif")),
                                                                           new javax.swing.ImageIcon(getClass().getResource("/imagenes/piedra"
                                                                +(int)(1+random.nextFloat()*6)+".gif")),
                                                              true,tierra, colonia, 10000, 10000, 1000, 0, 0, 1000);
                                                   
                                                   
                                                   
                                                   if (contplanta<Jugador.nivel()){
                                                       new Planta("rosaroja",new javax.swing.ImageIcon(getClass().getResource("/imagenes/plantaCria.png")),
                                new javax.swing.ImageIcon(getClass().getResource("/imagenes/rosaroja.png")),
                                true,tierra, colonia, 4000, 4000, 1000, 4, 0, 4000);
                                                       new Planta("girasol",new javax.swing.ImageIcon(getClass().getResource("/imagenes/plantaCria.png")),
                                new javax.swing.ImageIcon(getClass().getResource("/imagenes/girasol.png")),
                                true,tierra, colonia, 4000, 4000, 1000, 4, 0, 4000);
                                                       new Planta("arbol",new javax.swing.ImageIcon(getClass().getResource("/imagenes/planta.png")),
                                new javax.swing.ImageIcon(getClass().getResource("/imagenes/arbol.gif")),
                                true,tierra, colonia, 100000, 100000, 1000, 4, 0, 100000);
                                                           }
                                                     
                                                                 
                                                       
                                           
                                     }
            
            
            
            };
    
    timerTask = new TimerTask() {public void run(){
                                                               
            
                                                 for(int i=0;i<colonia.size();i++)
                                                   {Ser in=(Ser)colonia.get(i);
                                                   
                                                   in.label.validate();                                                       

                                                   in.camina();
                                                  
                                                   tierra.repaint();
                                                  tierra.validate();
                                                   }
                                                 
                                                  
                                                       
                                                                }};
    
    
        
        timer.scheduleAtFixedRate(timerTask, 0, 1000); 
       timeragua.scheduleAtFixedRate(timerTask1, 0, 30000); 
       timercielo.scheduleAtFixedRate(timerTask2, 0, (200));
      timeranimales.scheduleAtFixedRate(timerTask3,0, 5000);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        agua = new javax.swing.JPanel();
        ola1 = new javax.swing.JLabel();
        ola2 = new javax.swing.JLabel();
        ola3 = new javax.swing.JLabel();
        cielo = new javax.swing.JPanel();
        luna = new javax.swing.JLabel();
        sol = new javax.swing.JLabel();
        nube3 = new javax.swing.JLabel();
        nube2 = new javax.swing.JLabel();
        estrellas1 = new javax.swing.JLabel();
        estrellas3 = new javax.swing.JLabel();
        estrellas2 = new javax.swing.JLabel();
        nube1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Total = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tiempo = new javax.swing.JLabel();
        indice = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Creador = new javax.swing.JButton();
        cargararca = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        puntos = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        flechas = new javax.swing.JProgressBar();
        jLabel4 = new javax.swing.JLabel();
        caza = new javax.swing.JProgressBar();
        jLabel3 = new javax.swing.JLabel();
        nivel = new javax.swing.JProgressBar();
        tierra = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1050, 1000));
        setSize(new java.awt.Dimension(1050, 1000));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jPanel6.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        agua.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ola1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hilos/aguaNueva.png"))); // NOI18N
        agua.add(ola1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 110, 30));

        ola2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hilos/aguaNueva.png"))); // NOI18N
        agua.add(ola2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 110, 30));

        ola3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hilos/aguaNueva.png"))); // NOI18N
        agua.add(ola3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 110, 30));

        jPanel6.add(agua, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 126, 1030, 80));

        cielo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        luna.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        luna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hilos/luna.png"))); // NOI18N
        cielo.add(luna, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 10, 80, 70));

        sol.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hilos/sol.png"))); // NOI18N
        cielo.add(sol, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 60, 60));

        nube3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hilos/nuveG.png"))); // NOI18N
        cielo.add(nube3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 100, 110));

        nube2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hilos/nube.png"))); // NOI18N
        cielo.add(nube2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 60, 60));

        estrellas1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estrellas1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hilos/estrellas.gif"))); // NOI18N
        cielo.add(estrellas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 350, 110));

        estrellas3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estrellas3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hilos/estrellas.gif"))); // NOI18N
        cielo.add(estrellas3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 330, 110));

        estrellas2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estrellas2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hilos/estrellas.gif"))); // NOI18N
        cielo.add(estrellas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 330, 110));

        nube1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hilos/nuveG.png"))); // NOI18N
        cielo.add(nube1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 110, 90));

        jPanel6.add(cielo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 130));

        jPanel3.setPreferredSize(new java.awt.Dimension(915, 120));

        jLabel2.setText("Total de Individuos en la colonia");

        jLabel7.setText("Indice de Individuos X m2");

        jLabel9.setText("Linea Temporal en milisegundos");

        Creador.setText("Creador");
        Creador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreadorActionPerformed(evt);
            }
        });
        Creador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CreadorKeyPressed(evt);
            }
        });

        cargararca.setText("Carga rArca");
        cargararca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargararcaActionPerformed(evt);
            }
        });
        cargararca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cargararcaKeyPressed(evt);
            }
        });

        jLabel5.setText("Puntos:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(Creador, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(puntos, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                .addComponent(cargararca, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cargararca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Creador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(puntos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.setLayout(new java.awt.GridLayout(3, 2, 3, 3));

        jLabel1.setText("Flechas");
        jPanel1.add(jLabel1);

        flechas.setToolTipText("");
        flechas.setValue(1);
        flechas.setStringPainted(true);
        jPanel1.add(flechas);

        jLabel4.setText("Caza");
        jPanel1.add(jLabel4);

        caza.setStringPainted(true);
        jPanel1.add(caza);

        jLabel3.setText("Nivel");
        jPanel1.add(jLabel3);

        nivel.setValue(1);
        nivel.setStringPainted(true);
        jPanel1.add(nivel);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(indice, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Total, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Total, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(indice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tiempo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 650, 1030, 100));

        tierra.setBackground(new java.awt.Color(255, 235, 215));
        tierra.setAutoscrolls(true);
        tierra.setVerifyInputWhenFocusTarget(false);
        tierra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel6.add(tierra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 1030, 450));

        getContentPane().add(jPanel6, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    

   
  int solx,soly,lunax,lunay,nubex1,nubex2,nubex3;
  int Tiempo;
  int Dias=5;  
  Timer timer,timeragua,timercielo,timeranimales;
  int colortierra=20;
  Random random=new Random();
  ArrayList colonia;
  
  
  
   
    
    
    
    private void CreadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreadorActionPerformed
     
        Creador creador=new Creador(this,true,tierra,colonia);
        
        creador.setLocationRelativeTo(null);
       creador.setVisible(true);
     

        // TODO add your handling code here:
    }//GEN-LAST:event_CreadorActionPerformed

    private void cargararcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargararcaActionPerformed
        try{
              
               NewJDialog d=new NewJDialog(this,true,tierra,colonia);
               d.setVisible(true);
              cargararcaKeyPressed(new java.awt.event.KeyEvent(cargararca,0,0,0,0));
        }catch(Exception ex){ex.printStackTrace();}

        // TODO add your handling code here:
    }//GEN-LAST:event_cargararcaActionPerformed


boolean derecha=true;
int cantflechas=100;
    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
             tierra.setSize(getWidth(),tierra.getHeight());
             jPanel6.add(tierra, new AbsoluteConstraints(0, 210, getWidth(), 500));
             jPanel6.add(agua, new AbsoluteConstraints(0, 130, getWidth(), 80));
             jPanel6.add(cielo, new AbsoluteConstraints(0, 0, getWidth(), 130));
             jPanel6.add(jPanel3, new AbsoluteConstraints(0, 710,getWidth(), 100));
             jPanel6.validate();
             jPanel1.validate();
             
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentResized

   
    
    
    
    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        cargararcaKeyPressed(evt);        // TODO add your handling code here:
    }//GEN-LAST:event_formKeyPressed

    private void CreadorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CreadorKeyPressed
        cargararcaKeyPressed(evt);
        // TODO add your handling code here:
    }//GEN-LAST:event_CreadorKeyPressed

    
    
    private void cargararcaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cargararcaKeyPressed
         if (caza.getValue()==100) caza.setValue(0);
        puntos.setText(Jugador.puntos+"");
        caza.setValue(Jugador.caza);
        nivel.setValue(Jugador.nivel());
        flechas.setValue(cantflechas);

       
        if (evt.getKeyCode()==KeyEvent.VK_UP
            ||
            evt.getKeyCode()==KeyEvent.VK_DOWN
            ||
            evt.getKeyCode()==KeyEvent.VK_RIGHT
            ||
            evt.getKeyCode()==KeyEvent.VK_LEFT
            ||
            evt.getKeyCode()==KeyEvent.VK_CONTROL
        )
        {

            if (Jugador.label.getLocation().x<0) Jugador.x=0;
            if (Jugador.label.getLocation().y<0) Jugador.y=0;
            if (Jugador.label.getLocation().x>tierra.getWidth()-Jugador.label.getWidth()) Jugador.x=tierra.getWidth()-Jugador.label.getWidth();

            if (Jugador.label.getLocation().y>tierra.getHeight()-Jugador.label.getHeight()) Jugador.y=tierra.getHeight()-Jugador.label.getHeight();

            if (evt.getKeyCode()==KeyEvent.VK_CONTROL&&
                flechas.getValue()>0              ){
                cantflechas--;

                if (derecha){Flecha f= new Flecha("derecha",null,new javax.swing.ImageIcon(getClass().getResource("/imagenes/flechader.png")),
                    new javax.swing.ImageIcon(getClass().getResource("/imagenes/flechader.png")),
                    true,tierra, colonia, 4000, 4000, 1, 0, 10, 1);

                f.x=Jugador.x;f.y=Jugador.y;

            }
            else {Flecha f= new Flecha("derecha",null,new javax.swing.ImageIcon(getClass().getResource("/imagenes/flechaizq.png")),
                new javax.swing.ImageIcon(getClass().getResource("/imagenes/flechaizq.png")),
                false,tierra, colonia, 4000, 4000, 1, 0, 10, 1);

            f.x=Jugador.x;f.y=Jugador.y;

        }
        }

        if (evt.getKeyCode()==KeyEvent.VK_RIGHT)
        {  Jugador.imagenDer();
            Jugador.x=Jugador.x+20;

            derecha=true;
        }

        if (evt.getKeyCode()==KeyEvent.VK_LEFT)
        {  Jugador.imagenIzq();
            Jugador.x=Jugador.x-20;
            derecha=false;

        }
        if (evt.getKeyCode()==KeyEvent.VK_UP)
        Jugador.y=Jugador.y-20;

        if (evt.getKeyCode()==KeyEvent.VK_DOWN)
        Jugador.y=Jugador.y+20;

        for(int i=0;i<colonia.size();i++)
        {Ser s=(Ser)colonia.get(i);
            if (Math.abs(Jugador.label.getLocation().x-s.x)<20
                &&
                Math.abs(Jugador.label.getLocation().y-s.y)<20)
            { if (s instanceof Piedra) {Jugador.puntos+=10;}
                if (s instanceof Agua){Jugador.puntos+=1;}
                if (s instanceof Planta) {
                    if (((Planta) s).especie.equals("arbol")) {Jugador.puntos+=10;cantflechas=100;}
                    else  Jugador.puntos+=5;

                    Jugador.caza+=1;}

                if (s instanceof Tierra) {Jugador.puntos+=1;Jugador.caza+=1;}

                if (s instanceof Carnivoro
                    ||
                    s instanceof Herbivoro
                    ||
                    s instanceof Omnivoro) {Jugador.puntos+=20;Jugador.caza+=5;
                }

                Jugador.alimentate(s);

            }
        }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_cargararcaKeyPressed
    
    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        final NewApplication n= new NewApplication();
        
         
        try{
        
        java.awt.EventQueue.invokeLater(() -> {
         n.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
            n.setLocationRelativeTo(null);
            
            
            n.setVisible(true);
        });
        }catch(Exception ex){ 
                            
  
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Creador;
    public javax.swing.JLabel Total;
    private javax.swing.JPanel agua;
    private javax.swing.JButton cargararca;
    private javax.swing.JProgressBar caza;
    private javax.swing.JPanel cielo;
    private javax.swing.JLabel estrellas1;
    private javax.swing.JLabel estrellas2;
    private javax.swing.JLabel estrellas3;
    private javax.swing.JProgressBar flechas;
    private javax.swing.JLabel indice;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel luna;
    private javax.swing.JProgressBar nivel;
    private javax.swing.JLabel nube1;
    private javax.swing.JLabel nube2;
    private javax.swing.JLabel nube3;
    private javax.swing.JLabel ola1;
    private javax.swing.JLabel ola2;
    private javax.swing.JLabel ola3;
    private javax.swing.JLabel puntos;
    private javax.swing.JLabel sol;
    private javax.swing.JLabel tiempo;
    public static javax.swing.JPanel tierra;
    // End of variables declaration//GEN-END:variables

}
