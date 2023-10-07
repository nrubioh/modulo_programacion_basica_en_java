package P5;
import java.util.Scanner;
public class Uvas{
 public static void main(String args[]){
 
 char Tipo;
 int kgs, Tam, Total, PrecioFin = 0, PrecioInc = 500;
 Scanner iN = new Scanner(System.in);
    
    System.out.println("Ingresar tipo de Uva: ");
    Tipo = iN.next().charAt(0);
    System.out.println("Ingresar tamaño de la Uva: ");
    Tam = iN.nextInt();
    System.out.println("Ingresar cantidad de kilos: ");
    kgs = iN.nextInt();
    
    if(Tipo == 'A' || Tipo == 'a'){
     if(Tam == 1){
      PrecioFin = PrecioInc + 20;
     } else{
      PrecioFin = PrecioInc + 30;    
     }
    } else if(Tipo == 'B' || Tipo == 'b'){
     if(Tam == 1){
      PrecioFin = PrecioInc - 30;
     } else{
      PrecioFin = PrecioInc - 50;   
     }
    }   
    Total = PrecioFin * kgs;
     System.out.println("La ganancia por " + kgs + " kilos de uva es de $: " + Total);  
 }   
}
