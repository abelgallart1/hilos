/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

import java.util.Random;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.util.Timer;
import java.util.TimerTask;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.Serializable;
import javax.swing.Icon;
import javax.sound.sampled.*;

/**
 *
 * @author abel
 */
public abstract class Ser extends Thread implements Serializable {

    public JButton label;
    public JPanel panel;
    int x = 10;
    int fx = 1;
    int y = 10;
    int fy = -1;
    Random random = new Random();
    Timer timer, timer1, direccion;
    ArrayList colonia;
    Icon imagenCria;
    Icon imagenAdulto;
    int relojbiologico;
    boolean hembra = true;
    int totalhijos = 0;
    int esperanzadevida, limiteedadreproduccion, edadadulta, limitedescendientes, traslacion;
    boolean HAMBRE = false;
    int hambre;
    String especie;
    String audio;
    Clip clip;
    AudioInputStream audio2;

    public Ser(String especie, String audio, Icon imagenCria, Icon imagenAdulto, boolean hembra, JPanel panel, ArrayList colonia,
            int esperanzadevida, int limiteedadreproduccion, int edadadulta, int limitedescendientes,
            int traslacion, int hambre
    ) {
        super();
        this.especie = especie;
        HAMBRE = false;
        this.hambre = hambre;
        this.colonia = colonia;
        this.audio = audio;
        this.panel = panel;
        relojbiologico = 0;
        totalhijos = 0;
        x = (int) (random.nextFloat() * panel.getWidth());
        y = (int) (random.nextFloat() * panel.getHeight());
        this.label = new JButton();
        this.label.setContentAreaFilled(false);
        this.imagenCria = imagenCria;
        this.imagenAdulto = imagenAdulto;
        this.hembra = hembra;
        this.esperanzadevida = esperanzadevida;
        this.limiteedadreproduccion = limiteedadreproduccion;
        this.edadadulta = edadadulta;
        this.limitedescendientes = limitedescendientes;
        this.traslacion = traslacion;
        label.setIcon(imagenCria);

        label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                inicializar();
            }
        });

        label.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                arrastre(evt);
            }

            public void mouseMoved(java.awt.event.MouseEvent evt) {
            }
        });

        if (audio != null) {
            try {
                audio2 = AudioSystem.getAudioInputStream(getClass().getResourceAsStream(audio));
                clip = AudioSystem.getClip();
                clip.open(audio2);
                clip.start();

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        panel.add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(x, y, -1, -1));
        colonia.add(this);
        timer = new Timer();
        timer1 = new Timer();
        direccion = new Timer();

        TimerTask timerTask = new TimerTask() {
            public void run() {
                try {
                    desarrollo();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        };
        TimerTask timerTask1 = new TimerTask() {
            public void run() {
                HAMBRE = true;
            }
        };
        TimerTask timerTask2 = new TimerTask() {
            public void run() {
                fy = fy * (-1 + ((int) random.nextFloat() * 2));
            }
        };
  start();
    }

  
    public void run(){
            if (relojbiologico > esperanzadevida) {
            muere();
        }

    }
    
    public void arrastre(java.awt.event.MouseEvent evt) {
        if (timer != null) {
            timer.cancel();
        }
        if (timer1 != null) {
            timer1.cancel();
        }
        if (direccion != null) {
            direccion.cancel();
        }

        x = x + evt.getX() - label.getWidth() / 2;
        y = y + evt.getY() - label.getHeight() / 2;

        panel.add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(x, y, -1, -1));
        panel.repaint();
        panel.validate();

    }

    public void inicializar() {

        Creador creador = new Creador(new javax.swing.JFrame(), true, panel, colonia);
        creador.setLocationRelativeTo(null);

        creador.jLabel3.setText("");
        creador.jLabel4.setText("");

        creador.jLabel3.setIcon(imagenCria);
        creador.jLabel4.setIcon(imagenAdulto);
        creador.IMAGENADULTO = imagenAdulto.toString();
        creador.IMAGENCRIA = imagenCria.toString();

        if (this instanceof Carnivoro) {
            creador.animal.setSelected(true);
            creador.Carnívoro.setSelected(true);
            creador.Herbívoro.setSelected(false);
            creador.Omnívoro.setSelected(false);

            creador.mineral.setSelected(false);
            creador.agua.setSelected(false);
            creador.vegetal.setSelected(false);
        }
        if (this instanceof Herbivoro) {
            creador.animal.setSelected(true);
            creador.Herbívoro.setSelected(true);
            creador.Carnívoro.setSelected(false);
            creador.Omnívoro.setSelected(false);

            creador.mineral.setSelected(false);
            creador.agua.setSelected(false);
            creador.vegetal.setSelected(false);
        }
        if (this instanceof Omnivoro) {
            creador.animal.setSelected(true);
            creador.Omnívoro.setSelected(true);
            creador.Carnívoro.setSelected(false);
            creador.Herbívoro.setSelected(false);

            creador.mineral.setSelected(false);
            creador.agua.setSelected(false);
            creador.vegetal.setSelected(false);
        }

        if (this instanceof Piedra) {
            creador.animal.setSelected(false);
            creador.mineral.setSelected(true);
            creador.agua.setSelected(false);
            creador.vegetal.setSelected(false);
        }
        if (this instanceof Agua) {
            creador.animal.setSelected(false);
            creador.mineral.setSelected(false);
            creador.agua.setSelected(true);
            creador.vegetal.setSelected(false);
        }
        if (this instanceof Planta) {
            creador.animal.setSelected(false);
            creador.mineral.setSelected(false);
            creador.agua.setSelected(false);
            creador.vegetal.setSelected(true);
        }

        creador.EDV.setValue(esperanzadevida);
        creador.EA.setValue(edadadulta);
        creador.LEF.setValue(limiteedadreproduccion);
        creador.LD.setValue(limitedescendientes);
        if (esHembra()) {
            creador.F.setSelected(true);
            creador.M.setSelected(false);
        } else {
            creador.M.setSelected(true);
            creador.F.setSelected(false);
        }
        creador.velocidad.setValue(traslacion);
        creador.H.setValue(hambre);
        creador.especie.setText(especie);
        creador.jLabel12.setText(esperanzadevida + "");
        creador.jLabel13.setText(edadadulta + "");
        creador.jLabel14.setText(limiteedadreproduccion + "");
        creador.jLabel15.setText(limitedescendientes + "");
        creador.jLabel16.setText(traslacion + "");
        creador.jLabel17.setText(hambre + "");
        creador.jLabel20.setText(audio.toString());
        creador.audio = audio;
        if (this instanceof Omnivoro) {
            creador.animal.setSelected(true);
            creador.Omnívoro.setSelected(true);
        }
        if (this instanceof Carnivoro) {
            creador.animal.setSelected(true);
            creador.Carnívoro.setSelected(true);
        }
        if (this instanceof Herbivoro) {
            creador.animal.setSelected(true);
            creador.Herbívoro.setSelected(true);
        }

        creador.setVisible(true);

    }

    public void camina() {

        if (timer != null) {
            timer.cancel();
        }

        timer = new Timer();

        if (timer1 != null) {
            timer1.cancel();
        }

        timer1 = new Timer();

        if (direccion != null) {
            direccion.cancel();
        }

        direccion = new Timer();

        TimerTask timerTask = new TimerTask() {
            public void run() {
                try {
                    desarrollo();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Ser.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            // Aquí el código que queremos ejecutar. 
        };
        TimerTask timerTask1 = new TimerTask() {
            public void run() {
                HAMBRE = true;
            }

            // Aquí el código que queremos ejecutar. 
        };

        TimerTask timerTask2 = new TimerTask() {
            public void run() {
                fy = fy * (-1 + ((int) random.nextFloat() * 2));
            }

            // Aquí el código que queremos ejecutar. 
        };

        timer.scheduleAtFixedRate(timerTask, 0, 10);
        timer1.scheduleAtFixedRate(timerTask1, 0, hambre);
        direccion.scheduleAtFixedRate(timerTask2, 0, 500 + (int) random.nextFloat() * 500);

    }

    public boolean esAdulto() {
        return (relojbiologico > edadadulta);
    }

    public boolean esHembra() {
        return (hembra);
    }

    public boolean especie(Ser otro) {
        return (especie.equals(otro.especie));
    }

    public void muere() {

        colonia.remove(this);
        panel.remove(label);
        label.setVisible(false);
        if (timer != null) {
            timer.cancel();
        }
        if (timer1 != null) {
            timer1.cancel();
        }
        if (direccion != null) {
            direccion.cancel();
        }

        Tierra t = new Tierra("tierra", new javax.swing.ImageIcon(getClass().getResource("/hilos/tierra.png")),
                new javax.swing.ImageIcon(getClass().getResource("/hilos/tierra.png")),
                hembra, panel, colonia, 1000000, 1000000, 1, 0, 0, 1000000);
        Agua a = new Agua("agua", null,
                 new javax.swing.ImageIcon(getClass().getResource("/hilos/agua.gif")),
                new javax.swing.ImageIcon(getClass().getResource("/hilos/agua.gif")),
                hembra, panel, colonia, 1000000, 1000000, 1, 0, 5, 1000000);

        t.x = x + (-5 + (int) random.nextFloat() * 10);
        t.y = y + (-5 + (int) random.nextFloat() * 10);
        a.x = x + (-5 + (int) random.nextFloat() * 10);
        a.y = y + (-5 + (int) random.nextFloat() * 10);
        panel.validate();

        try {
            finalize();
        } catch (Throwable ex) {
            Logger.getLogger(Ser.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public abstract Object clone();

    public boolean hacinado() {
        if (colonia.size() > 0 && panel.getWidth() / colonia.size() < 30) {//panel.setSize(colonia.size()*35,430);
            return true;
        } else {
            return false;
        }
    }

    public abstract void reproducete(Ser otro);

    public abstract void alimentate(Ser otro);

    public void desarrollo() throws InterruptedException {
        relojbiologico++;
        if (clip != null && !clip.isRunning()) {
            clip.close();
        }

        if (esAdulto()) {
            label.removeAll();
            label.setIcon(imagenAdulto);
            label.validate();
        }

        int rx = (int) (random.nextFloat() * traslacion);
        int ry = (int) (random.nextFloat() * traslacion);

        x += rx * fx;
        y += ry * fy;

        for (int i = 0; i < colonia.size(); i++) {
            Ser aux = (Ser) colonia.get(i);
            if (Math.abs(x - aux.x) < 40 && Math.abs(y - aux.y) < 40
                    && !aux.equals(this)) {
                if (especie(aux)) {
                    Thread.sleep(500);
                }
                rx = traslacion;
                ry = traslacion;
                fx = fx * (-1 + ((int) random.nextFloat() * 2));
                fy = fy * (-1 + ((int) random.nextFloat() * 2));
                x += rx * fx;
                y += ry * fy;

                reproducete(aux);
                alimentate(aux);

            }

        }

        if (x > panel.getWidth() - label.getWidth()) {
            fx = fx * (-1 + ((int) random.nextFloat() * 2));
            fy = fy * (-1 + ((int) random.nextFloat() * 2));
            x = panel.getWidth() - label.getWidth();
        }

        if (x < 0) {
            fx = fx * (-1 + ((int) random.nextFloat() * 2));
            fy = fy * (-1 + ((int) random.nextFloat() * 2));
            x = 0;
        }

        if (y > panel.getHeight() - label.getHeight()) {
            fx = fx * (-1 + ((int) random.nextFloat() * 2));
            fy = fy * (-1 + ((int) random.nextFloat() * 2));
            y = panel.getHeight() - label.getHeight();
        }

        if (y < 0) {
            fx = fx * (-1 + ((int) random.nextFloat() * 2));
            fy = fy * (-1 + ((int) random.nextFloat() * 2));
            y = 0;
        }

        panel.add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(x, y, -1, -1));
        panel.repaint();
        panel.validate();

    }

}
