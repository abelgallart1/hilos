/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

/**
 *
 * @author abel
 */
public class NewJDialog1 extends javax.swing.JDialog {

    /**
     * Creates new form NewJDialog1
     */
    public NewApplication frame;
    public NewJDialog1(NewApplication frame, boolean modal) {
        super(frame, modal);
        initComponents();
         femenino.setSelected(true);
        this.frame=frame;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton12 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        femenino = new javax.swing.JRadioButton();
        masculino = new javax.swing.JRadioButton();

        jButton12.setText("jButton12");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.GridLayout(4, 4, 3, 3));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ave3.gif"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ave1.gif"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ave2.gif"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ave4.gif"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ave5.gif"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/canibal.gif"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/elefanteP.gif"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7);

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/hormiga.gif"))); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton9);

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/leonbebe.png"))); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton8);

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mariposaazul.gif"))); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton10);

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mariposarosa.gif"))); // NOI18N
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton11);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 340, 330));

        jLabel1.setText("Selecciona Jugador");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 210, 30));
        jPanel1.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 100, 110));

        femenino.setText("Femenino");
        femenino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femeninoActionPerformed(evt);
            }
        });
        jPanel1.add(femenino, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, -1, -1));

        masculino.setText("Masculino");
        masculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masculinoActionPerformed(evt);
            }
        });
        jPanel1.add(masculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, -1, -1));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public Jugador jugador=null;
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        frame.tierra.removeAll();
       if (jugador!=null) frame.colonia.remove(jugador);
        jugador=
        new Jugador("colibriverde","/audios/colibri.wav",new javax.swing.ImageIcon(getClass().getResource("/imagenes/ave3.gif")),
                                new javax.swing.ImageIcon(getClass().getResource("/imagenes/ave3.gif")),
                                new javax.swing.ImageIcon(getClass().getResource("/imagenes/ave3der.gif")),
                                sexo,frame.tierra, frame.colonia, 4000, 4000, 1000, 0, 0, 1);
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ave3.gif")));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        frame.tierra.removeAll();
       if (jugador!=null) frame.colonia.remove(jugador);
        jugador =
                  new Jugador("colibri","/audios/colibri.wav",new javax.swing.ImageIcon(getClass().getResource("/imagenes/ave1.gif")),
                                new javax.swing.ImageIcon(getClass().getResource("/imagenes/ave1.gif")),
                          new javax.swing.ImageIcon(getClass().getResource("/imagenes/ave1der.gif")),      
                          sexo,frame.tierra, frame.colonia, 4000, 4000, 1000, 0, 0, 1);
        
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ave1.gif")));
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
 frame.tierra.removeAll();
       if (jugador!=null) frame.colonia.remove(jugador);
  jugador=
           new Jugador("cotorra","/audios/cotorra.wav",new javax.swing.ImageIcon(getClass().getResource("/imagenes/ave2.gif")),
                                new javax.swing.ImageIcon(getClass().getResource("/imagenes/ave2.gif")),
                   new javax.swing.ImageIcon(getClass().getResource("/imagenes/ave2der.gif")),
                                sexo,frame.tierra, frame.colonia, 4000, 4000, 1000, 0, 0, 1);
        
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ave2.gif")));

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
   frame.tierra.removeAll();
       if (jugador!=null) frame.colonia.remove(jugador);
    jugador=new Jugador("aguila","/audios/aguila.wav",new javax.swing.ImageIcon(getClass().getResource("/imagenes/ave4.gif")),
                                new javax.swing.ImageIcon(getClass().getResource("/imagenes/ave4.gif")),
                                new javax.swing.ImageIcon(getClass().getResource("/imagenes/ave4der.gif")),
                                sexo,frame.tierra, frame.colonia, 4000, 4000, 1000, 0, 0, 1);
        
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ave4.gif")));

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
     frame.tierra.removeAll();
       if (jugador!=null) frame.colonia.remove(jugador);
      jugador=new Jugador("lechuza","/audios/lechuza.wav",new javax.swing.ImageIcon(getClass().getResource("/imagenes/ave5.gif")),
                                new javax.swing.ImageIcon(getClass().getResource("/imagenes/ave5.gif")),
                                new javax.swing.ImageIcon(getClass().getResource("/imagenes/ave5der.gif")), 
                                sexo,frame.tierra, frame.colonia, 4000, 4000, 1000, 0, 0,1);
        
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ave5.gif")));
        
// TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
    frame.tierra.removeAll();
       if (jugador!=null) frame.colonia.remove(jugador);   
    frame.tierra.removeAll();
        jugador=new Jugador("canibal","/audios/tamborflauta.wav",new javax.swing.ImageIcon(getClass().getResource("/imagenes/canibalP.gif")),
                                new javax.swing.ImageIcon(getClass().getResource("/imagenes/canibal.gif")),
                                new javax.swing.ImageIcon(getClass().getResource("/imagenes/canibalder.gif")),
                                sexo,frame.tierra, frame.colonia, 10000, 10000, 1000, 0, 0,1);
    
    jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/canibal.gif")));

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
    frame.tierra.removeAll();
       if (jugador!=null) frame.colonia.remove(jugador);
    jugador=new Jugador("elefante","/audios/elefante.wav",new javax.swing.ImageIcon(getClass().getResource("/imagenes/elefanteP.gif")),
                                new javax.swing.ImageIcon(getClass().getResource("/imagenes/elefante.gif")),
                                new javax.swing.ImageIcon(getClass().getResource("/imagenes/elefanteder.gif")), 
                                sexo,frame.tierra, frame.colonia, 10000, 10000, 2000, 0, 0, 1);
       jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/elefanteP.gif")));

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
   frame.tierra.removeAll();
       if (jugador!=null) frame.colonia.remove(jugador);
   jugador=new Jugador("hormiga","/audios/blanco.wav",new javax.swing.ImageIcon(getClass().getResource("/imagenes/hormiga.gif")),
                                new javax.swing.ImageIcon(getClass().getResource("/imagenes/hormiga.gif")),
                                new javax.swing.ImageIcon(getClass().getResource("/imagenes/hormiga.gif")),                     
           sexo,frame.tierra, frame.colonia, 4000, 4000, 1000, 0, 0, 1);
        
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/hormiga.gif")));

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
 frame.tierra.removeAll();
       if (jugador!=null) frame.colonia.remove(jugador);
 jugador=new Jugador("leon","/audios/leon.wav",new javax.swing.ImageIcon(getClass().getResource("/imagenes/leonbebe.png")),
                                new javax.swing.ImageIcon(getClass().getResource("/imagenes/leon.gif")),
                                 new javax.swing.ImageIcon(getClass().getResource("/imagenes/leonder.gif")),
                                sexo,frame.tierra, frame.colonia, 4000, 4000, 1000, 0, 0, 1);
        
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/leonbebe.png")));

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        frame.tierra.removeAll();
       if (jugador!=null) frame.colonia.remove(jugador);
        jugador= new Jugador("mariposa",null,new javax.swing.ImageIcon(getClass().getResource("/imagenes/mariposaazul.gif")),
                                new javax.swing.ImageIcon(getClass().getResource("/imagenes/mariposaazul.gif")),
                                new javax.swing.ImageIcon(getClass().getResource("/imagenes/mariposaazul.gif")),
                                sexo,frame.tierra, frame.colonia, 4000, 1000, 1000, 0, 0, 1);
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mariposaazul.gif")));

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
  frame.tierra.removeAll();
       if (jugador!=null) frame.colonia.remove(jugador);
jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mariposarosa.gif")));
jugador=new Jugador("mariposa",null,new javax.swing.ImageIcon(getClass().getResource("/imagenes/mariposarosa.gif")),
                                new javax.swing.ImageIcon(getClass().getResource("/imagenes/mariposarosa.gif")),
                                new javax.swing.ImageIcon(getClass().getResource("/imagenes/mariposarosa.gif")),
                                sexo,frame.tierra, frame.colonia, 4000, 1000, 1000, 5, 5, 700);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void femeninoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femeninoActionPerformed
         sexo=true;
        masculino.setSelected(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_femeninoActionPerformed

    boolean sexo=true;      
    private void masculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masculinoActionPerformed
    sexo=false;
        femenino.setSelected(false);
// TODO add your handling code here:
    }//GEN-LAST:event_masculinoActionPerformed

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
            java.util.logging.Logger.getLogger(NewJDialog1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJDialog1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJDialog1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJDialog1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NewJDialog1 dialog = new NewJDialog1(new NewApplication(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton femenino;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton masculino;
    // End of variables declaration//GEN-END:variables
}
