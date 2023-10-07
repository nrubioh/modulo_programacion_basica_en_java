package P_13;
import java.util.Scanner;
public class NmayorWhile {
  public static void main(String args[]) {

    int num, mayor = 0;
     Scanner iN = new Scanner(System.in);
    
     System.out.println("");
     System.out.println("Ciclo While");  
       
       System.out.print("Agrega el n° de numeros: ");
       num = iN.nextInt();
       int a[] = new int[num];
       System.out.println("Agrega los numeros: ");
        int i = 0;
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
