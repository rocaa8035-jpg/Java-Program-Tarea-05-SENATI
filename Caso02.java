//Importamos la clase Scanner para leer la entrada del usuario
import java.util.Scanner;
//Importamos la clase Math para utilizar funciones matemáticas como max y min
import java.lang.Math;

//Definimos la clase principal del programa
public class Caso02 {
    
    public static void main(String[] args) {

        //Creamos un objeto Scanner para leer la entrada del usuario
        Scanner t = new Scanner(System.in);

        //Declaramos las variables necesarias para almacenar las notas, el promedio, la nota mínima, la nota máxima, el estado y la calificación
        double nota1, nota2, nota3, nota4, promedio, minNota, maxNota;
        String estado, calificacion;

        //Solicitamos al usuario que ingrese las cuatro notas y las almacenamos en las variables correspondientes
        System.out.println("Ingrese la primera nota: ");
        nota1 = t.nextDouble();

        System.out.println("Ingrese la segunda nota: ");
        nota2 = t.nextDouble();

        System.out.println("Ingrese la tercera nota: ");
        nota3 = t.nextDouble();

        System.out.println("Ingrese la cuarta nota: ");
        nota4 = t.nextDouble();

        t.close();

        //Calculamos la nota máxima utilizando la función Math.max para comparar las cuatro notas
        maxNota = Math.max(Math.max(nota1, nota2), Math.max(nota3, nota4));
        //Calculamos la nota mínima utilizando la función Math.min para comparar las cuatro notas
        minNota = Math.min(Math.min(nota1, nota2), Math.min(nota3, nota4));
        //Calculamos el promedio sumando las cuatro notas, restando la nota mínima y la nota máxima, y dividiendo el resultado entre 4
        promedio = (nota1 + nota2 + nota3 + nota4 - minNota + maxNota) / 4;

        //Determinamos el estado del alumno en función del promedio: "Aprobado" o "Desaprobado"
        if (promedio >= 11) {
            estado = "Aprobado";
        } else {
            estado = "Desaprobado";
        }
    
        //Determinamos la calificación del alumno en función del promedio utilizando una estructura de control if-else
        if (promedio >= 18) {
            calificacion = "Excelente";
        } else if (promedio >= 16) {
            calificacion = "Muy Bueno";
        } else if (promedio >= 14) {
            calificacion = "Bueno";
        } else if (promedio >= 11) {
            calificacion = "Regular";
        } else {
            calificacion = "En Progreso";
        }

        //Mostramos el promedio, el estado y la calificación del alumno
        System.out.println("Promedio: " + promedio);
        System.out.println("Estado: " + estado);
        System.out.println("Calificación: " + calificacion);
    }
}
