/*
 * Universidad Politécnica de San Luis Potosí
 * Programación III Java
 * Programación Orientada a Objetos
 */
package maquinadeturing;
import java.util.Scanner;
/**
 * @version 1.0
 * @author Rojas Rodríguez Martín Omar, 178809@upslp.edu.mx
 */
public class MaquinaDeTuring {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cadena a validar: ");
        String cadena = scanner.nextLine();
        String simboloDelta = "XXX";
        String completa = simboloDelta + cadena + simboloDelta;
        System.out.println(completa);
        char[] arregloCaracteres = completa.toCharArray();
        */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }
    
}
