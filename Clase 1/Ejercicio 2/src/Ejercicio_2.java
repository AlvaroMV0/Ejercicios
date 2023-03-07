import java.util.Scanner;
public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ----------------------------------- Ingresar valores -----------------------------------

        System.out.println("Por favor ingrese la totalidad de sus ingresos sin comas ni puntos");
        int ingresos = sc.nextInt();
        System.out.println("Por favor ingrese la cantidad de vehículos en su posesión");
        int vehiculos = sc.nextInt();
        System.out.println("Por favor ingrese la totalidad de inmuebles que posee");
        int inmuebles = sc.nextInt();
        System.out.println("Posee usted una (o más) embarcación, aeronave de lujo o es titular\r\n de activos societarios que demuestren capacidad económica plena?");
        System.out.println("\"true\" - Si poseo");
        System.out.println("\"false\" - No poseo");



        // ----------------------------------- Comparar valores -----------------------------------

        boolean propiedad_lujosa = sc.nextBoolean();
        if (ingresos >= 489083 || vehiculos >= 3 || inmuebles >= 3 || propiedad_lujosa == true) {
            System.out.println("PERTENECE a la categoría de ingresos altos");
        } else {
            System.out.println("NO PERTENECE a la categoría de ingresos altos");
        }


    }
}