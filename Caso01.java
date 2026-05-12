//Importar la clase Scanner para leer la entrada del usuario
import java.util.Scanner; 

//Definir la clase principal
public class Caso01 {
    
    //Definir el método principal
    public static void main(String[] args){

        //Declarar las variables necesarias para el cálculo
        double sueldoActual, descuento, montoTotal, montoPagar;
        int añoInicio, añoFinal;

        //Crear un objeto Scanner para leer la entrada del usuario
        Scanner t = new Scanner(System.in);
        
        //Solicitar al usuario que ingrese el sueldo actual del trabajador
        System.out.println("Ingrese el sueldo actual del trabajador: ");
        sueldoActual = t.nextDouble();

        //Solicitar al usuario que ingrese el año de inicio de las labores del trabajador
        System.out.println("Ingrese el año que inicio las labores: ");
        añoInicio = t.nextInt();

        //Solicitar al usuario que ingrese el año de conclusión de las labores del trabajador
        System.out.println("Ingrese el año de conclusión: ");
        añoFinal = t.nextInt();

        //Calcular el monto total a pagar al trabajador
        montoTotal = sueldoActual * (añoFinal - añoInicio);

        //Calcular el descuento según el monto total a pagar
        if (montoTotal > 200000) {
            descuento = montoTotal * 0.15;
        } else if (montoTotal > 100000) {
            descuento = montoTotal * 0.10;
        } else if (montoTotal > 50000) {
            descuento = montoTotal * 0.05;
        } else {
            descuento = 0;
        }

        //Calcular el monto a pagar después de aplicar el descuento
        montoPagar = montoTotal - descuento;

        //Mostrar los resultados al usuario
        System.out.println("Monto total: S/ " + montoTotal);
        System.out.println("Descuento: S/ " + descuento);
        System.out.println("Monto a pagar: S/ " + montoPagar);

        t.close();
    }
}
