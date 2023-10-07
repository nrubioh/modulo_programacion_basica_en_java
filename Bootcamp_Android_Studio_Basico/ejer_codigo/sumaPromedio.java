package P1;
import java.util.Scanner;

public class sumaPromedio{
 public static void main(String args[]){
       
  int num1=12345, num2=54321, suma, resta, mult, divs;
    
  suma=num1+num2;
  resta=num1-num2;
  mult=num1*num2;
  divs=num2/num1;
     
    System.out.println("la suma es: " + suma);
    System.out.println("la resta es: " + resta);
    System.out.println("la mult es: " + mult);
    System.out.println("la div es: " + divs); 
    
     Scanner iN = new Scanner(System.in);
     int num3;
        System.out.println("Ingresar valor para la variable: ");
    num3 = iN.nextInt();
        System.out.println("la variable escrita fue: " + num3);
        
    
    Scanner Nota = new Scanner(System.in);
    float prom, nota1, nota2 , nota3, nota4;
    System.out.println ("Ingresar 4 numeros ");
    nota1 = Nota.nextFloat();
    nota2= Nota.nextFloat();
    nota3= Nota.nextFloat();
    nota4= Nota.nextFloat();
    prom=(nota1+nota2+nota3+nota4)/4;
    System.out.println (" El promedio de nota es :" + prom);
 }  
}