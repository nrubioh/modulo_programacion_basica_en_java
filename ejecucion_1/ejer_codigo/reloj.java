package P_14;
import java.util.*;
public class reloj{
    public static void main(String[] args) {                                                                      
        int H,M,S;
        Scanner sc = new Scanner(System.in);
        System.out.print("introduzca hra: ");
        H =  sc.nextInt();
        System.out.print("introduzca min: ");
        M =  sc.nextInt();
        System.out.print("introduzca sg: ");
        S =  sc.nextInt();
        if(H>=0 && H<24 && M>=0 && M<60 && S>=0 && S<60){                                                          
           System.out.println("La hora es: " +H+ ":" +M+ ":"+S+ ".");
        } else{
           System.out.println("Hora incorrecta");
        }
    }
}