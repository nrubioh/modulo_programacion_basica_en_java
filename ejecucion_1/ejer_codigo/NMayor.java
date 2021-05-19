
/*Utilizando los ciclos iterativos, crear un programa que permita 
determinar el mayor de N números ingresados por el usuario.*/
package P_13;
import java.util.Scanner;

public class NMayor {
  public static void main(String args[]){
   
     int num, mayor = 0;
     Scanner iN = new Scanner(System.in);
     
       System.out.print("Agrega el n° de numeros: ");
       num = iN.nextInt();
       int a[] = new int[num];
       
       System.out.println("Agrega los numeros: ");
       for(int i=0; i<a.length; i++){
        a[i] = iN.nextInt();
        if(a[i]>mayor){
           mayor = a[i];
        }   
       }
       System.out.println("El numero mayor es: " + mayor);
       
     int i = 0; //Ciclo While
     System.out.println("");
     System.out.println("Ciclo While");  
       
       System.out.print("Agrega el n° de numeros a ingresar: ");
       num = iN.nextInt();
       System.out.println("Agrega los numeros: ");
        while(i <a.length){
         a[i] = iN.nextInt();
         if(a[i]>mayor){
          mayor = a[i];  
         }
         i++;
        }
      System.out.println("El numero mayor es: " + mayor);
 }
}
  