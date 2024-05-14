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
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cadena a validar: ");
        String cadena = scanner.nextLine();
        String simboloDelta = "XXX";
        String completa = simboloDelta + cadena + simboloDelta;
        System.out.println(completa);
        char[] arregloCaracteres = completa.toCharArray();
        int posicion = 3;
        int estado = 0; 
        System.out.println(arregloCaracteres[3]);
        while(true)
        {
            if(estado == 0)
            {
                if(arregloCaracteres[posicion] == 'a')
                {
                    System.out.println("regla: (i,a) = (q1, Y, R)");
                    arregloCaracteres[posicion] = 'Y';
                    estado = 1;
                    posicion += 1;
                    System.out.println(arregloCaracteres);
                }
                else
                {
                    if(arregloCaracteres[posicion] == 'b')
                    {
                        System.out.println("regla: (i,b) = (q4, Y, R)");
                        arregloCaracteres[posicion] = 'Y';
                        estado = 4;
                        posicion += 1;
                        System.out.println(arregloCaracteres);
                    }
                    else
                    {
                        if(arregloCaracteres[posicion] == 'Y')
                        {
                            System.out.println("regla: (i,Y) = (t, Y, R)");
                            arregloCaracteres[posicion] = 'Y';
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
                        System.out.println("regla: (q1,a) = (q1, a, R)");
                        arregloCaracteres[posicion] = 'a';
                        estado = 1;
                        posicion +=1;
                        System.out.println(arregloCaracteres);
                    }
                    else
                    {
                        if(arregloCaracteres[posicion] == 'b')
                        {
                            System.out.println("regla: (q1,b) = (q1, b, R)");
                            arregloCaracteres[posicion] = 'b';
                            estado = 1;
                            posicion +=1;
                            System.out.println(arregloCaracteres);
                        }
                        else
                        {
                            if(arregloCaracteres[posicion] == 'X')
                            {
                                System.out.println("regla: (q1,X) = (q2, X, L)");
                                arregloCaracteres[posicion] = 'X';
                                estado = 2;
                                posicion -=1;
                                System.out.println(arregloCaracteres);
                            }
                            else
                            {
                                if(arregloCaracteres[posicion] == 'Y')
                                {
                                    System.out.println("regla: (q1,Y) = (q2, Y, L)");
                                    arregloCaracteres[posicion] = 'Y';
                                    estado = 2;
                                    posicion-=1;
                                    System.out.println(arregloCaracteres);
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
                            System.out.println("regla: (q2,a) = (q3, Y, L)");
                            arregloCaracteres[posicion] = 'Y';
                            estado = 3;
                            posicion -=1;
                            System.out.println(arregloCaracteres);
                        }
                        else
                        {
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
                                System.out.println("regla: (q3,a) = (q3, a, L)");
                                arregloCaracteres[posicion] = 'a';
                                estado = 3;
                                posicion -=1;
                                System.out.println(arregloCaracteres);
                            }
                            else
                            {
                                if(arregloCaracteres[posicion] == 'b')
                                {    
                                    System.out.println("regla: (q3,b) = (q3, b, L)");
                                    arregloCaracteres[posicion] = 'b';
                                    estado = 3;
                                    posicion -=1;
                                    System.out.println(arregloCaracteres);
                                }
                                else
                                {
                                    if(arregloCaracteres[posicion] == 'Y')
                                    {    
                                        System.out.println("regla: (q3,Y) = (i, Y, R)");
                                        arregloCaracteres[posicion] = 'Y';
                                        estado = 0;
                                        posicion +=1;
                                        System.out.println(arregloCaracteres);
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
                                    System.out.println("regla: (q4,a) = (q4, a, R)");
                                    arregloCaracteres[posicion] = 'a';
                                    estado = 4;
                                    posicion +=1;
                                    System.out.println(arregloCaracteres);
                                }
                                else
                                {
                                    if(arregloCaracteres[posicion] == 'b')
                                    {    
                                        System.out.println("regla: (q4,b) = (q4, b, R)");
                                        arregloCaracteres[posicion] = 'b';
                                        estado = 4;
                                        posicion +=1;
                                        System.out.println(arregloCaracteres);
                                    }
                                    else
                                    {
                                        if(arregloCaracteres[posicion] == 'Y')
                                        {    
                                            System.out.println("regla: (q4,Y) = (q5, Y, L)");
                                            arregloCaracteres[posicion] = 'Y';
                                            estado = 5;
                                            posicion -=1;
                                            System.out.println(arregloCaracteres);
                                        }
                                        else
                                        {
                                            if(arregloCaracteres[posicion] == 'X')
                                            {    
                                                System.out.println("regla: (q4,X) = (q5, X, L)");
                                                arregloCaracteres[posicion] = 'X';
                                                estado = 5;
                                                posicion -=1;
                                                System.out.println(arregloCaracteres);
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
                                        System.out.println("regla: (q5,b) = (q5, b, L)");
                                        arregloCaracteres[posicion] = 'Y';
                                        estado = 3;
                                        posicion -=1;
                                        System.out.println(arregloCaracteres);
                                    }
                                    else
                                    {
                                        if(arregloCaracteres[posicion] == 'a')
                                        {    
                                           System.out.println("RECHAZADO");
                                           break;
                                        }
                                        else
                                        {
                                            if(arregloCaracteres[posicion] == 'Y')
                                            {    
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
