package P2;

import java.util.Scanner;

public class ifelse{
 public static void main(String args[]){
 
 Scanner iN = new Scanner(System.in);
 int n; 
 System.out.print("ingrese un valor: ");
 n = iN.nextInt();
  if(n>0){
     System.out.println("numero es +!");
  }else{
     System.out.println("numero es -!");
  }
  
System.out.println("ingrese un numero: ");
Scanner lector=new Scanner(System.in);
int numero=lector.nextInt();
  if(numero%2==0){
    System.out.println("el numero ingresado es par ");
  }else{
    System.out.println("el numero ingresado es impar ");
  } 
 }
}
