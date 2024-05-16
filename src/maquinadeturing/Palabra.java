/*
 * Universidad Politécnica de San Luis Potosí
 * Programación III Java
 * Programación Orientada a Objetos
 */
package maquinadeturing;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Rojas Rodríguez Martín Omar, 178809@upslp.edu.mx
 */
public class Palabra extends Thread {
    
    public JLabel flecha;
    public int posicion = 2;
    public int estado = 0;
    public char[] arregloCaracteres;
    public JTextField[] valores;
    public Palabra(JLabel flecha, JTextField[] valores, char[] arregloCaracteres)
    {
        this.flecha = flecha;
        this.arregloCaracteres = arregloCaracteres;
        this.valores = valores;
    }
    
    public void run()
    {
        
        
        
        /*System.out.println(arregloCaracteres[3]);*/
        
        while(true)
        {
            if(estado == 0)
            {
                if(arregloCaracteres[posicion] == 'a')
                {
                    valores[posicion].setBackground(new Color(186, 242, 102));
                    System.out.println("regla: (i,a) = (q1, Y, R)");
                    arregloCaracteres[posicion] = 'Y';
                    valores[posicion].setText(String.valueOf('Y'));
                    estado = 1;
                    
                    System.out.println(arregloCaracteres);
                    Movimiento a = new Movimiento(flecha , 20, 1);
                    try {
                        a.start();
                        a.join();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Palabra.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    valores[posicion].setBackground(new Color(255, 255, 255));
                    posicion += 1;
                    
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Palabra.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else
                {
                    if(arregloCaracteres[posicion] == 'b')
                    {
                        valores[posicion].setBackground(new Color(186, 242, 102));
                        System.out.println("regla: (i,b) = (q4, Y, R)");
                        arregloCaracteres[posicion] = 'Y';
                        valores[posicion].setText(String.valueOf('Y'));
                        estado = 4;
                        System.out.println(arregloCaracteres);
                        Movimiento a = new Movimiento(flecha , 20, 1);
                        try {
                            a.start();
                            a.join();
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Palabra.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        valores[posicion].setBackground(new Color(255, 255, 255));
                        posicion += 1;
                        try {
                            Thread.sleep(500);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Palabra.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else
                    {
                        if(arregloCaracteres[posicion] == 'Y')
                        {
                            valores[posicion].setBackground(new Color(186, 242, 102));
                            System.out.println("regla: (i,Y) = (t, Y, R)");
                            arregloCaracteres[posicion] = 'Y';
                            valores[posicion].setText(String.valueOf('Y'));
                            estado = 100;
                            System.out.println(arregloCaracteres);
                            System.out.println("ACEPTADO");
                            break;
                        }
                    }
                }
            }
            else
            {
                if(estado == 1)
                {
                    if(arregloCaracteres[posicion] == 'a')
                    {    
                        valores[posicion].setBackground(new Color(186, 242, 102));
                        System.out.println("regla: (q1,a) = (q1, a, R)");
                        arregloCaracteres[posicion] = 'a';
                        valores[posicion].setText(String.valueOf('a'));
                        estado = 1;
                        System.out.println(arregloCaracteres);
                        Movimiento a = new Movimiento(flecha , 20, 1);
                        try {
                            a.start();
                            a.join();
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Palabra.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        valores[posicion].setBackground(new Color(255, 255, 255));
                        posicion += 1;
                        try {
                            Thread.sleep(500);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Palabra.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else
                    {
                        
                        if(arregloCaracteres[posicion] == 'b')
                        {
                            valores[posicion].setBackground(new Color(186, 242, 102));
                            System.out.println("regla: (q1,b) = (q1, b, R)");
                            arregloCaracteres[posicion] = 'b';
                            valores[posicion].setText(String.valueOf('b'));
                            estado = 1;
                            
                            System.out.println(arregloCaracteres);
                            Movimiento a = new Movimiento(flecha , 20, 1);
                            try {
                                a.start();
                                a.join();
                            } catch (InterruptedException ex) {
                                Logger.getLogger(Palabra.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            valores[posicion].setBackground(new Color(255, 255, 255));
                            posicion += 1;
                            try {
                                Thread.sleep(500);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(Palabra.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        else
                        {
                            
                            if(arregloCaracteres[posicion] == 'X')
                            {
                                valores[posicion].setBackground(new Color(186, 242, 102));
                                System.out.println("regla: (q1,X) = (q2, X, L)");
                                arregloCaracteres[posicion] = 'X';
                                valores[posicion].setText(String.valueOf('X'));
                                estado = 2;
                                System.out.println(arregloCaracteres);
                                Movimiento a = new Movimiento(flecha , -20, 0);
                                try {
                                    a.start();
                                    a.join();
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(Palabra.class.getName()).log(Level.SEVERE, null, ex);
                                }
                                valores[posicion].setBackground(new Color(255, 255, 255));
                                posicion -= 1;
                                try {
                                    Thread.sleep(500);
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(Palabra.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                            else
                            {
                                valores[posicion].setBackground(new Color(186, 242, 102));
                                if(arregloCaracteres[posicion] == 'Y')
                                {
                                    System.out.println("regla: (q1,Y) = (q2, Y, L)");
                                    arregloCaracteres[posicion] = 'Y';
                                    valores[posicion].setText(String.valueOf('Y'));
                                    estado = 2;
                                   
                                    System.out.println(arregloCaracteres);
                                    Movimiento a = new Movimiento(flecha , -20, 0);
                                    try {
                                        a.start();
                                        a.join();
                                    } catch (InterruptedException ex) {
                                        Logger.getLogger(Palabra.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                    valores[posicion].setBackground(new Color(255, 255, 255));
                                    posicion -= 1;
                                    try {
                                        Thread.sleep(500);
                                    } catch (InterruptedException ex) {
                                        Logger.getLogger(Palabra.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                }
                            }
                        }
                        
                    }
                }
                else
                {
                    if(estado == 2)
                    {
                        if(arregloCaracteres[posicion] == 'a')
                        {    
                            valores[posicion].setBackground(new Color(186, 242, 102));
                            System.out.println("regla: (q2,a) = (q3, Y, L)");
                            arregloCaracteres[posicion] = 'Y';
                            valores[posicion].setText(String.valueOf('Y'));
                            estado = 3;
                            System.out.println(arregloCaracteres);
                            Movimiento a = new Movimiento(flecha , -20, 0);
                            try {
                                a.start();
                                a.join();
                            } catch (InterruptedException ex) {
                                Logger.getLogger(Palabra.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            valores[posicion].setBackground(new Color(255, 255, 255));
                            posicion -= 1;
                            try {
                                Thread.sleep(500);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(Palabra.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        else
                        {
                            valores[posicion].setBackground(new Color(255, 133, 133));
                            System.out.println("RECHAZADO");
                            break;
                        }
                    }
                    else
                    {
                        if(estado == 3)
                        {
                            if(arregloCaracteres[posicion] == 'a')
                            {    
                                valores[posicion].setBackground(new Color(186, 242, 102));
                                System.out.println("regla: (q3,a) = (q3, a, L)");
                                arregloCaracteres[posicion] = 'a';
                                valores[posicion].setText(String.valueOf('a'));
                                estado = 3;
                                
                                System.out.println(arregloCaracteres);
                                Movimiento a = new Movimiento(flecha , -20, 0);
                                try {
                                    a.start();
                                    a.join();
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(Palabra.class.getName()).log(Level.SEVERE, null, ex);
                                }
                                valores[posicion].setBackground(new Color(255, 255, 255));
                                    posicion -= 1;
                                try {
                                    Thread.sleep(500);
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(Palabra.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                            else
                            {
                                if(arregloCaracteres[posicion] == 'b')
                                {  
                                    valores[posicion].setBackground(new Color(186, 242, 102));
                                    System.out.println("regla: (q3,b) = (q3, b, L)");
                                    arregloCaracteres[posicion] = 'b';
                                    valores[posicion].setText(String.valueOf('b'));
                                    estado = 3;
                                    
                                    System.out.println(arregloCaracteres);
                                    Movimiento a = new Movimiento(flecha , -20, 0);
                                    try {
                                        a.start();
                                        a.join();
                                    } catch (InterruptedException ex) {
                                        Logger.getLogger(Palabra.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                    valores[posicion].setBackground(new Color(255, 255, 255));
                                    posicion -= 1;
                                    try {
                                        Thread.sleep(500);
                                    } catch (InterruptedException ex) {
                                        Logger.getLogger(Palabra.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                }
                                else
                                {
                                    if(arregloCaracteres[posicion] == 'Y')
                                    {    
                                        valores[posicion].setBackground(new Color(186, 242, 102));
                                        System.out.println("regla: (q3,Y) = (i, Y, R)");
                                        arregloCaracteres[posicion] = 'Y';
                                        valores[posicion].setText(String.valueOf('Y'));
                                        estado = 0;
                                      
                                        System.out.println(arregloCaracteres);
                                        Movimiento a = new Movimiento(flecha , 20, 1);
                                        try {
                                            a.start();
                                            a.join();
                                        } catch (InterruptedException ex) {
                                            Logger.getLogger(Palabra.class.getName()).log(Level.SEVERE, null, ex);
                                        }
                                        valores[posicion].setBackground(new Color(255, 255, 255));
                                    posicion += 1;
                                        try {
                                            Thread.sleep(500);
                                        } catch (InterruptedException ex) {
                                            Logger.getLogger(Palabra.class.getName()).log(Level.SEVERE, null, ex);
                                        }
                                    }
                                }
                            }
                            
                        }
                        else
                        {
                            if(estado == 4)
                            {
                                if(arregloCaracteres[posicion] == 'a')
                                {    
                                    valores[posicion].setBackground(new Color(186, 242, 102));
                                    System.out.println("regla: (q4,a) = (q4, a, R)");
                                    arregloCaracteres[posicion] = 'a';
                                    valores[posicion].setText(String.valueOf('a'));
                                    estado = 4;
                                    System.out.println(arregloCaracteres);
                                    Movimiento a = new Movimiento(flecha , 20,1);
                                    try {
                                        a.start();
                                        a.join();
                                    } catch (InterruptedException ex) {
                                        Logger.getLogger(Palabra.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                    valores[posicion].setBackground(new Color(255, 255, 255));
                                    posicion += 1;
                                    try {
                                        Thread.sleep(500);
                                    } catch (InterruptedException ex) {
                                        Logger.getLogger(Palabra.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                }
                                else
                                {
                                    if(arregloCaracteres[posicion] == 'b')
                                    {   
                                        valores[posicion].setBackground(new Color(186, 242, 102));
                                        System.out.println("regla: (q4,b) = (q4, b, R)");
                                        arregloCaracteres[posicion] = 'b';
                                        valores[posicion].setText(String.valueOf('b'));
                                        estado = 4;
                                        
                                        System.out.println(arregloCaracteres);
                                        Movimiento a = new Movimiento(flecha , 20, 1);
                                        try {
                                            a.start();
                                            a.join();
                                        } catch (InterruptedException ex) {
                                            Logger.getLogger(Palabra.class.getName()).log(Level.SEVERE, null, ex);
                                        }
                                        valores[posicion].setBackground(new Color(255, 255, 255));
                                    posicion += 1;
                                        try {
                                            Thread.sleep(500);
                                        } catch (InterruptedException ex) {
                                            Logger.getLogger(Palabra.class.getName()).log(Level.SEVERE, null, ex);
                                        }
                                    }
                                    else
                                    {
                                        if(arregloCaracteres[posicion] == 'Y')
                                        {    
                                            valores[posicion].setBackground(new Color(186, 242, 102));
                                            System.out.println("regla: (q4,Y) = (q5, Y, L)");
                                            arregloCaracteres[posicion] = 'Y';
                                            valores[posicion].setText(String.valueOf('Y'));
                                            estado = 5;
                                           
                                            System.out.println(arregloCaracteres);
                                            Movimiento a = new Movimiento(flecha , -20, 0);
                                            try {
                                                a.start();
                                                a.join();
                                            } catch (InterruptedException ex) {
                                                Logger.getLogger(Palabra.class.getName()).log(Level.SEVERE, null, ex);
                                            }
                                            valores[posicion].setBackground(new Color(255, 255, 255));
                                            posicion -= 1;
                                            try {
                                                Thread.sleep(500);
                                            } catch (InterruptedException ex) {
                                                Logger.getLogger(Palabra.class.getName()).log(Level.SEVERE, null, ex);
                                            }
                                        }
                                        else
                                        {
                                            if(arregloCaracteres[posicion] == 'X')
                                            {  
                                                valores[posicion].setBackground(new Color(186, 242, 102));
                                                System.out.println("regla: (q4,X) = (q5, X, L)");
                                                arregloCaracteres[posicion] = 'X';
                                                valores[posicion].setText(String.valueOf('X'));
                                                estado = 5;
                                                
                                                System.out.println(arregloCaracteres);
                                                Movimiento a = new Movimiento(flecha , -20, 0);
                                                try {
                                                    a.start();
                                                    a.join();
                                                } catch (InterruptedException ex) {
                                                    Logger.getLogger(Palabra.class.getName()).log(Level.SEVERE, null, ex);
                                                }
                                                valores[posicion].setBackground(new Color(255, 255, 255));
                                                posicion -= 1;
                                                try {
                                                    Thread.sleep(500);
                                                } catch (InterruptedException ex) {
                                                    Logger.getLogger(Palabra.class.getName()).log(Level.SEVERE, null, ex);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            else
                            {
                                if(estado == 5)
                                {
                                    if(arregloCaracteres[posicion] == 'b')
                                    {    
                                        valores[posicion].setBackground(new Color(186, 242, 102));
                                        System.out.println("regla: (q5,b) = (q5, b, L)");
                                        arregloCaracteres[posicion] = 'Y';
                                        valores[posicion].setText(String.valueOf('Y'));
                                        estado = 3;
                                        
                                        System.out.println(arregloCaracteres);
                                        Movimiento a = new Movimiento(flecha , -20, 0);
                                        try {
                                            a.start();
                                            a.join();
                                        } catch (InterruptedException ex) {
                                            Logger.getLogger(Palabra.class.getName()).log(Level.SEVERE, null, ex);
                                        }
                                        valores[posicion].setBackground(new Color(255, 255, 255));
                                        posicion -= 1;
                                        try {
                                            Thread.sleep(500);
                                        } catch (InterruptedException ex) {
                                            Logger.getLogger(Palabra.class.getName()).log(Level.SEVERE, null, ex);
                                        }
                                    }
                                    else
                                    {
                                        if(arregloCaracteres[posicion] == 'a')
                                        {  
                                           valores[posicion].setBackground(new Color(255, 133, 133));
                                           System.out.println("RECHAZADO");
                                           break;
                                        }
                                        else
                                        {
                                            if(arregloCaracteres[posicion] == 'Y')
                                            {  
                                                valores[posicion].setBackground(new Color(255, 133, 133));
                                               System.out.println("RECHAZADO");
                                               break;
                                            } 
                                        }
                                        
                                    }
                                }
                            }
                        }
                    }
                }
            }
            
        }
    }
}
