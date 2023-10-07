package P_16;
import java.util.Scanner;
public class arreglo {
 public static void main(String args[]){
 
  int large = 0;
  Scanner iN = new Scanner(System.in);
 
  System.out.print("Cuantos n° deseas ingresar ");
  large = iN.nextInt();

  int number[] = new int[large];
 	
  for(int i = 0; i < number.length; i++){
   System.out.println("Dame el valor del # " + (i+1));
   number[i] = iN.nextInt();
  }
  for(int i = 0; i < number.length; i++){
   System.out.print("[" + number[i] + "]");
  }
 }
}

