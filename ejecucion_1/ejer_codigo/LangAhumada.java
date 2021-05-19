package P4;
import java.util.Scanner;
public class LangAhumada{
 public static void main(String[] args){
 
 int numPersonas, costoFinalPlato;
 Scanner iN = new Scanner(System.in);
 
    System.out.println("Ingresar num de personas: ");
    numPersonas = iN.nextInt();
     if(numPersonas <= 300 && numPersonas > 200){
        costoFinalPlato = numPersonas * 8500;
            System.out.println("El costo individual del plato es de: $8.500");
     } else if(numPersonas > 300){
        costoFinalPlato = numPersonas * 7500;
            System.out.println("El costo individual del plato es de: $7.500");
     } else{
        costoFinalPlato = numPersonas * 9500;
            System.out.println("El costo individual del plato es de: $9.500");
     }
    System.out.println("");
    System.out.println("El precio final es de $: " + costoFinalPlato + " para: " + numPersonas);
 }
}
