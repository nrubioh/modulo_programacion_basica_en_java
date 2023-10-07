/*Los siguientes números perfectos después del 6 son 28, 8128, 33550336, 8589869056.
Realizar un programa que pida por teclado un número y muestre si es perfecto o no.
 */ 
package P_16;
import java.util.Scanner;
public class numPerfectos{
 public static void main(String[] args){
    long num;
    long suma = 0;

    Scanner leer = new Scanner(System.in);

    System.out.print("Ingrese un número: ");
    num = Long.parseLong(leer.nextLine());

    for (long i = 1; i <= num / 2; i++){
        if (num % i == 0){
        suma += i;
        System.out.println(i);
        }
    }

    if (suma == num){
            System.out.println( num + " es un número perfecto.");
    } else{
            System.out.println( num + " no es un número perfecto.");
    }
 }
}
