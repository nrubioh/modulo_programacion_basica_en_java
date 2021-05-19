package P8;
import java.util.Scanner;
public class PromNotas{
 public static void main(String args[]){
 
  int i = 0;   
  double suma = 0;
  double nota;
  double prom;		
  Scanner iN = new Scanner(System.in);
		
    do{
        System.out.print("Ingrese nota sobre 0: ");
        nota = Double.parseDouble(iN.nextLine());
     if (nota >= 1){
        ++i;
        suma += nota;
     } 
    } while(nota >= 1);
    prom = suma / i;
    System.out.println("El promedio es: " + prom);
 }
}
 
 
 
 
 
 
 
 
 
 
 
 
 