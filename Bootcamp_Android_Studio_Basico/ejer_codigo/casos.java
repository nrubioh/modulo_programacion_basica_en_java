package P_15;
import javax.swing.JOptionPane;
public class casos{
  public static void main(String args[]){
  
  int mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numericamente el mes"));
    if (mes<1||mes>12){
        System.out.println("No corresponde al mes");
    } else{
        switch(mes){
        case 1:
            System.out.println("Enero");
        break;
        case 2:
            System.out.println("Febrero");
        break;
        case 3:
            System.out.println("Marzo");
        break;
        case 4:
            System.out.println("Abril");
        break;
        case 5:
            System.out.println("Mayo");
        break;
        case 6:
            System.out.println("Junio");
        break;
        case 7:
            System.out.println("Julio");
        break;
        case 8:
            System.out.println("Agosto");
        break;
        case 9:
            System.out.println("Septiembre");
        break;
        case 10:
            System.out.println("Octubre");
        break;
        case 11:
            System.out.println("Noviembre");
        break;
        case 12:
            System.out.println("Diciembre");
        break;
            default:
        break;
        }
       }
    if (mes==1||mes==3||mes==5||mes==7||mes==8||mes==10||mes==12){
        System.out.println("El mes es de 31 dias");
    }else if (mes==4||mes==6||mes==9||mes==11) {
        System.out.println("El mes es de 30 dias");
    }else if(mes==2){
        System.out.println("El mes es de 28 dias");
    }else {
        System.out.println("se selecciono un mes invalido");
    }
 }  
}
