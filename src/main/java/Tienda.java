
import java.util.Scanner;


public class Tienda {
    public static void main(String []args){
        double ventas[] = new double [10]; //indicamos que es un arreglo
        Scanner sc=new Scanner (System.in);
        System.out.println("Ingrese las 10 ventas del mes; ");
        for(int i= 0; i < ventas.length; i++){  //Se va a estar repitiendo mientras i sea menor que el arreglo (10)
        
            System.out.println("Venta " + (i+1));
            ventas[i] = sc.nextDouble();
        }
        int k = 0;
        int total = 0;
        while (k < 10)  {
            if(ventas[k]>=2000){
                System.out.println(ventas[k]);
                total++;
            }
            k++;
        }
        System.out.println("El total de ventas mayores a 2000 euros es "+ total);
    } 
}


