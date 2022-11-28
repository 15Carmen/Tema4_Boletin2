public class Ejercicio4 {
    /*
    Diseña dos funciones de nombre parseToBoolean que hagan lo siguiente:

        La primera de las funciones recibirá un argumento de tipo entero que devuelva false si el argumento
        es 0 y true si el argumento es 1.

        La segunda de las funciones recibirá un argumento de tipo String que devuelva false si la cadena es
        igual a “false” y true si la cadena es igual a “true”.

     */

    public static void main(String[] args) {

        System.out.println(parseToBoolean(1));
        System.out.println(parseToBoolean("true"));
    }

    /**
     * Precondición: solo se pueden pasar por el argumento 0 o 1, ningún otro número
     * @param numero
     * @return
     */
    public static boolean parseToBoolean(int numero){
        boolean resultado = false;
        if (numero==0){
            resultado=true;
        }else if (numero==1){
            resultado=false;
        }

        return resultado;
    }

    /**
     * Precondición: solo se puede pasar por argumento una cadena de texto "true" o "false", ninguna otra
     * @param cadena
     * @return
     */
    public static boolean parseToBoolean(String cadena){
        boolean resultado=false;
        if (cadena.equals("false")){
            resultado=false;
        }else if (cadena.equals("true")){
            resultado=true;
        }

        return resultado;
    }
}
