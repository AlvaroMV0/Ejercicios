public class Ejercicio_1 {


    public static void main(String[] args) {
        ejercicio_1_a();
        ejercicio_1_b();
        ejercicio_1_c();
    }

    private static void ejercicio_1_a() {
        String frase = "Frase de ejemplo";
        frase = frase.toLowerCase(); //para evitar que un caracter en mayúsucla no sea detectado
        char letra = 'e';
        int count = 0;

        for(int i = 0; i < frase.length(); ++i) {
            if (frase.charAt(i) == letra) {
                ++count;
            }
        }

        System.out.println("La letra \"" +letra+"\" aparece "+count+" veces en la frase.");
    }

    private static void ejercicio_1_b() {
        int num_1 = -2;
        int num_2 = 3;
        int num_3 = 2;
        int temp; //Para no perder el valor en el intercambio de valores

        boolean ordenAscendente = false; //para determinar el orden ascendente (true) o descendente(false)
        int[] arr = new int[]{num_1, num_2, num_3};
        int i;
        int j;

        if (ordenAscendente) {
            System.out.print("El orden de los números en orden ascendente es: ");
            for(i = 0; i < arr.length; ++i) {
                for(j = i + 1; j < arr.length; ++j) {
                    if (arr[i] > arr[j]) {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }

                System.out.print(arr[i]+", ");
            } System.out.println(". ");
        } else {
            System.out.print("El orden de los números en orden descendente es:");
            for(i = 0; i < arr.length; ++i) {
                for(j = i + 1; j < arr.length; ++j) {
                    if (arr[i] < arr[j]) {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }

                System.out.print(" "+arr[i]);
            }System.out.println(". ");
        }

    }

    private static void ejercicio_1_c() {
        int[] arr = new int[]{1, 3, 10, 32, 100};
        int x = 6;
        int resultado = 0;

        for (int j : arr) {
            if (j > x) {
                resultado += j;
            }
        }

        System.out.println("la sumatoria de todos los número mayores a "+x+" es: "+resultado+".");
    }
}
