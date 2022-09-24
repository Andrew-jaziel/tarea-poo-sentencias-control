/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sentenciascontrol;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author andre_86xv1vl
 */
public class Class {
int n,i=1,suma,numero;
String resp ="";

 /**int NumeroN(int n){
       int i = 0; 
       int promedio;
       int numero=0;
       int suma=0;
       do{
           System.out.println("digite : "+n);
           numero=numero+i;
       }
       a+b
    while(i<=n);
       promedio=suma+n;
        
    return promedio;
}*/
    public int sacarPromedio(int n,int prom){
  
        
        do {
      
        numero =numero+i;
        i++;
        
    }while (i<=n);
        
        
   prom=numero/n;
        System.out.println("el promedio es: "+prom);
    return prom;
}
    public int sacaPromedioab(int a,int b){
        int promedio;
  do {
      
        numero =numero+a;
        a++;
        
    }while (a<=b);
        
  
   promedio=numero/b;
        System.out.println("el promedio es: "+promedio);
    return promedio;
    }
    
    public boolean verificarComp(int numero){

        int contador=2;
    while(contador<numero){
        if (numero%contador==0)
        contador++;
        return true;
    }
     
    return false;
    }
    public Boolean verificarContraseña(String cadena){
        int cont=0;
        cadena="abc.123";
  
    
        do{
            if(cadena=="abc.123"){
            return true;
                
            }else{
            return false;
                
            }
        }while(cont==3);
    }
    static boolean validarPerfecto(int n)
    {
        int sumatoria=0;
        for (int i=1; i<n; i++){
        if(n%1==0)
            sumatoria=sumatoria+1;
        }
        if (sumatoria==n)
            return true;
        return false;
    }

    String validarPerfecto(String n) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
        } 

        
    
   



