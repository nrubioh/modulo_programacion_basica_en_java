package P7;
import java.util.Scanner;
public class telefono {
 public static void main(String args[]){
 
 int min, error;
 String turno, dia ="";
 float total, precioMin = 0;
 
 Scanner iN = new Scanner(System.in);
 
 System.out.println("Ingresar los minutos: ");
 min = iN.nextInt();
 System.out.println("La cantidad de minutos son: " + min);
    if(min <= 5){
     precioMin = min * 100;
    } else if(min > 5 && min <= 8){
     precioMin = (min - 5)*80 + 500;
    } else if(min > 8 && min <= 10){
     precioMin = (min - 8)*70 + 740; 
    } else if(min > 10){
     precioMin = (min - 10)*50 + 880; 
    }
    
 System.out.println("Ingrese el dia: ");
 dia = iN.nextLine();
 System.out.println("El dia que llamo fue: " + dia);
    if(dia == "Domingo"){
     total = precioMin*1.03F;   
    } else if(dia == "Sabado"){
     total = precioMin;
    } else{
       System.out.println("La llamada fue diurna o vespertina");
       turno = iN.nextLine();
       System.out.println("Su llamada fue: " + turno);
        if(turno == "Vespertino"){
        total = precioMin * 1.15F;            
        } else{
        total = precioMin * 1.1F;
        }  
    }
  System.out.println("El valor final de la llamada es: " + total);
 }
}

 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 