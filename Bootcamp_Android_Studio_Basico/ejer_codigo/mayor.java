package P3;
import java.util.Scanner;
public class mayor{
 public static void main(String args[]){
    Scanner mayor = new Scanner(System.in);
    int a, b, c; 
    
    System.out.print("introduzca valor de a: ");
    a = mayor.nextInt();
    System.out.print("introduzca valor de b: ");
    b = mayor.nextInt();
    System.out.print("valores iniciales de a: " + a + "b: " + b );
    c = a;
    a = b;
    b = c;
    System.out.println("valores intercambiado: a = " + a + " b = " + b);
 }
}
