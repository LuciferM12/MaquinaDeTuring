/*
 * Universidad Politécnica de San Luis Potosí
 * Programación III Java
 * Programación Orientada a Objetos
 */
package maquinadeturing;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author Rojas Rodríguez Martín Omar, 178809@upslp.edu.mx
 */
public class Movimiento extends Thread {
    JLabel flecha;
    public int x;
    public int pos;
    public Movimiento(JLabel flecha, int suma, int pos)
    {
        this.flecha = flecha;
        x = flecha.getX() + suma;
        this.pos = pos;
        
    }
    
    public void run()
    {
        while(flecha.getX() != x)
        {
            if(pos == 1)
                flecha.setLocation(flecha.getX() + 1, flecha.getY());
            else
                flecha.setLocation(flecha.getX() -1, flecha.getY());
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
                Logger.getLogger(Movimiento.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
    
    
    
    
}
