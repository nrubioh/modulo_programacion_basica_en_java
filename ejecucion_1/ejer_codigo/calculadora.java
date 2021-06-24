
package P_15;

import java.util.Scanner;
public class calculadora {
 public static void main(String args[]){
 
     int num_uno, num_dos, resultado, op;
        Scanner iN = new Scanner(System.in);
        
     
        System.out.println("que operacion quieres hacer?: ");
        System.out.println("1 - sumar ");
        System.out.println("2 - restar ");
        System.out.println("3 - multiplicar ");
        System.out.println("4 - dividir ");
        op = iN.nextInt();
        
        System.out.print("introduzca primer n°: ");
        num_uno =  iN.nextInt();
        System.out.print("introduzca segundo n°: ");
        num_dos = iN.nextInt();
        
     switch (op){
         case 1:
             resultado = num_uno + num_dos;
             System.out.println("El resultado de la suma es: " + resultado);
             break;
         case 2:
             resultado = num_uno - num_dos;
             System.out.println("El resultado de la resta es: " + resultado);
             break;
         case 3:
             resultado = num_uno * num_dos;
             System.out.println("El resultado de la multiplicacion es: " + resultado);
             break;
         case 4:
             resultado = num_uno / num_dos;
             System.out.println("El resultado de la division es: " + resultado);
             break;
         default:
             System.out.println("La opcion que elegiste no existe");
             break;
             
     }
 }
}