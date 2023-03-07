public class Ejercicio_2 {
    public static void main(String[] args) {

        String ejemplo = "Hola ¿Esta es una frase de PrUeBa? .yz,Yz";
        for(int i = 0; i < ejemplo.length(); ++i) {

            int x = ejemplo.charAt(i);
            if( (x>64 && x<89) || (x>96 && x<121)){ // Esto es para que solo se modifiquen letras (máysuculas y mínúsculas)
                x += 2;
                System.out.print((char) x);
            } else if (x == 90 || x == 122 ||x == 89 || x == 121   ) {
                x -= 24;
                System.out.print((char) x);
            } else {
                System.out.print(ejemplo.charAt(i));
            }
        }

    }


}