package P_16;
import java.util.Scanner;
public class BubbleSort {
  public static void main(String[] args) {

        int nn;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca longitud del array: ");
        nn = sc.nextInt();
        /* Creamos el array del tamaño nn (lo que pongamos por teclado) */
        int ArrayN[] = new int[nn];
       
        for (int i = 0; i < ArrayN.length; i++){ //aca va pidiendo n°...
            System.out.println("Introduzca número para el elemento " + (i + 1) + ": ");
            ArrayN[i] = sc.nextInt(); 
        }
            System.out.println("-SIN ORDENAR-");
        
    
            /* Llamada al método */
        mostrarN(ArrayN);
        System.out.println("¿Desea ordenar los números? S/N");
        Scanner sc2 = new Scanner(System.in);
        String res = sc2.nextLine();
        
        if (res.equalsIgnoreCase("S")) {
            /* Muestra el array ordenado */
            System.out.println("-ORDENADO-");
            /*Llama al método para ordenar */
            ordenaBurbuja(ArrayN);
        }
    }
    
    /* Método de ordenación mediante algoritmo de burbuja */
    static void ordenaBurbuja(int ArrayN[]) {
        for (int i = 0; i < ArrayN.length - 1; i++) {
            // Bucle anidado 
            for (int j = 0; j < ArrayN.length - 1; j++) { 
/* Si el número almacenado en la posición j es mayor que el de la posición j+1 (el siguiente del array) */ 
                if (ArrayN[j] > ArrayN[j + 1]) {
/* guardamos el número de la posicion j+1 en una variable (el menor) */
                    int temp = ArrayN[j + 1];
/* Lo intercambiamos de posición */
                    ArrayN[j + 1] = ArrayN[j];
                    ArrayN[j] = temp;
/* y volvemos al inicio para comparar los siguientes hasta que todos se hayan comparado*/
/* de esta forma vamos dejando los números mayores al final del array en orden*/
                }
            }
        }
/* Llama al método mostrarN, si ordena damos por hecho que lo quiere mostrar */
        mostrarN(ArrayN);
    }
/* Método para mostrar el array */
    static void mostrarN(int ArrayN[]) {
        System.out.println("|-----------------------|");
/* Bucle para mostrar el array desde la posicion 0 hasta la longitud del array */
        for (int i = 0; i < ArrayN.length; i++){
            System.out.print(" Elemento " + (i + 1) + " -----> " + ArrayN[i] + "\n");
        }
        System.out.println("|-----------------------|");
    }
}


