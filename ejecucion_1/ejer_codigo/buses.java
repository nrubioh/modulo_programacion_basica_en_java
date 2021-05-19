package P6;
import java.util.Scanner;
public class buses {  
 public static void main(String args[]){   
 
 int cantAlum, rango = 0, total = 0;
 int cost1 = 6500;
 int cost2 = 7000;
 int cost3 = 9000;
 int cost4 = 400000;
 Scanner iN = new Scanner(System.in);
 
  System.out.println("Ingresar cantidad de alumnos: ");
  cantAlum= iN.nextInt();
  
  if(cantAlum>100){rango=1;}
  if(cantAlum>50&&cantAlum<99){rango=2;}
  if(cantAlum>30&&cantAlum<49){rango=3;}
  if(cantAlum<30){rango=4;}
 
  switch(rango){
      case 1: System.out.println("La cant de alumnos seleccionado es: " + cantAlum);
              System.out.println("el costo por alumno es " + cost1);
      total=cantAlum*cost1;
      break;    
      case 2: System.out.println("La cant de alumnos seleccionado es: " + cantAlum);
              System.out.println("el costo por alumno es " + cost2);
      total=cantAlum*cost2;
      break;
      case 3: System.out.println("La cant de alumnos seleccionado es: " + cantAlum);
              System.out.println("el costo por alumno es " + cost3);
      total=cantAlum*cost3;
      break;
      case 4: System.out.println("La cant de alumnos seleccionado es: " + cantAlum);
              System.out.println("el costo por alumno es " + cost4/cantAlum);
      total=cost4;
      break;
        default: System.out.println("Opcion no valida");
      break;
  }
  System.out.println("el costo por total es " + total);
 }
}
