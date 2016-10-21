/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema12;
import java.util.*;
/**
 *
 * @author Miguel
 */
public class PP2Problema12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
 
        int [] vec = new int [10];
        System.out.println(vec.length);
        vec=llenarVector(vec);
        mostrarVector(vec);
    }
    public static int[]  llenarVector(int [] a){
        Scanner entrada = new Scanner(System.in);
        for(int i=0; i<10;++i){
            
                System.out.println("Introduce la posicion ["+i+"]");
                a[i]= entrada.nextInt();
        }
    return a;
    }
    public static void mostrarVector(int[]a){
        int suma=0,promedio=0;
        for(int i=1; i<10;++i){
            if(i%2==0) {
                suma= suma+a[i];
                promedio= suma/(10/2);
                //System.out.print("["+a[i]+"]");
            }
            }
        
        System.out.println("El promedio de los datos que se encuentran en las posiciones pares del arreglo es: "+promedio);
        }
    }