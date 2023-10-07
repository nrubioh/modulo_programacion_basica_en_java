package P_15;
import java.util.Scanner;
public class CajeroBancario {
 public static void main(String args[]){
 
     Scanner iN = new Scanner(System.in);
     int min = 1_000;
     int max = 2_000;
     int saldo_inicial = (int)Math.floor(Math.random()*(max-min+1)+min);
         
      //valor generado de forma automatica entre 1 y 2 palos
      System.out.println("Valor random entre "+min+" y "+max+ ":");
      System.out.println(saldo_inicial);
      System.out.println("");
      
        System.out.println("Que desea hacer? "
            + " 1=Deposito "
            + " 2=Giro "
            + " 3=Consulta de saldo "
            + " 4=Salir" + "\n");
        int operacion = iN.nextInt();

      do{
        switch(operacion){
          case 1:
                  System.out.println("Ingrese el monto del depósito:");
                  int deposito = iN.nextInt();
                  // Evita depósitos negativos
                   if(deposito<0){ 
                        System.err.println("El depósito no puede ser un depósito negativo");
                   } else{
                        System.out.println("deposito con exito");
                    saldo_inicial=saldo_inicial+deposito;
                        System.out.println("Su deposito fue de: " + deposito);
                        System.out.println("Su saldo actual es de: " + saldo_inicial);
                  }
                  break;
          case 2:
                  System.out.println("Ingrese el monto del giro");
                  int giro=iN.nextInt();
                  // Cada retiro no puede exceder el maximo de saldo inicial
                  if(giro > saldo_inicial|| giro < 0){  
                      System.err.println("Cada retiro no puede exceder el maximo de saldo inicial ni ser negativo");
                  } else{
                  System.out.println("el giro fue realizado ");
                  saldo_inicial=saldo_inicial-giro;
                      System.out.println("Su giro fue de: " + giro);
                      System.out.println("Su saldo actual es de: " + saldo_inicial);
                  }
                  break;
          case 3:
                 System.out.println("Su saldo actual es: "+saldo_inicial);
                 break;
          case 4:
                 System.exit(0);
                 break;
        }
      }while(operacion != 4);
 }
}
