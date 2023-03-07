import java.util.Scanner;
public class Ejercicio_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean seguir;

        do{
        System.out.println("¿Qué ejercicio desea revisar? (Responder en mínisculas a/b/c/d");
        System.out.println("Ejercicio a - \"a\"");
        System.out.println("Ejercicio b - \"b\"");
        System.out.println("Ejercicio c - \"c\"");
        System.out.println("Ejercicio d - \"d\"");
        char ejercicio = sc.next().charAt(0); //introducir respuesta


        System.out.println("Ejercicio "+ejercicio);
        System.out.println("Por favor introduzca las variables"); //Introducir variables
        System.out.print("Primer variable: ");
        int a = sc.nextInt();
        System.out.print("Segunda variable: ");
        int b = sc.nextInt();

        if (b < a) {  //Si el usuario ingresa las variables de mayor a menor, este condicional los invierte utilziando temp
            int temp = a;
            a = b;
            b = temp;
        }


        switch (ejercicio){
            case 'a': //--------------------------------------------- Ejercicio 1.a ---------------------------------------------

                System.out.print("Los números son: ");
                while (a < b) {

                    System.out.print(a + ", "); // 4, 5, ...
                    a++;
                }
                System.out.println(b + "."); //7.
                break;




            case 'b'://--------------------------------------------- Ejercicio 1.b ---------------------------------------------

                System.out.println("Los números pares son: ");
                while (a < b) {
                    if (a % 2 == 0) { //selecciona a los pares
                        System.out.print(a + " ");

                    }
                    a++;
                }System.out.println(b+".");
                break;




            case 'c'://--------------------------------------------- Ejercicio 1.c ---------------------------------------------

                System.out.println("Los números son: ");
                System.out.println("¿Mostrar todos los números o solo los pares?"); //seleccionares pares o impares con true false
                System.out.println("\"true\" - Mostrar todos los números");
                System.out.println("\"false\" - Mostrar solo los pares");
                boolean nOrden = sc.nextBoolean();
                if (nOrden){

                    while (a < b) {

                        System.out.print(a + ", ");
                        a++;
                    }
                    System.out.println(b + ".");
                } else {
                    for (int i = b; i-1f > a; i--) {
                        if (i % 2 == 0) {
                            System.out.print(i + ", ");
                        }
                    }
                    if (a % 2 == 0) {
                        System.out.println(a + ".");
                    } else {
                        System.out.println(a+1+".");
                    }

            }
                break;



            case 'd'://--------------------------------------------- Ejercicio 1.d ---------------------------------------------

                System.out.println("Los números son: ");
                for (int i = b; i > a; i--) {
                    if (i % 2 == 0) {
                        System.out.print(i + ", ");
                    }
                }
                if (a % 2 == 0) {
                    System.out.println(a + ".");
                } else {
                    System.out.println(a+1+".");
                }
                break;


        }




        System.out.println("¿Desea revisar más ejercicios? (true/false)"); //revisar más ejercicios o finalizar el programa
         seguir = sc.nextBoolean();

        } while (seguir);  //Loop do-while del programa
    }
}