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
     *
     * Metodo que devolverá false si
     * @param numero es igual a 1 y true si es igual a 0
     * @return verdadero o falso segun el numero introducido
     */
    public static boolean parseToBoolean(int numero){
        //Declaramos las variables
        boolean resultado = false;  //Variable que usaremos para devolver el resultado segun lo introducido por parametros

        if (numero==0){         //Si el numero introducido por parámetros es igual a 0
            resultado=true;     //La varaible resultado es igual a true
        }else if (numero==1){   //Si el numero introducido por parámetros es igual a 1
            resultado=false;    //La varaible resultado es igual a false
        }

        return resultado;       //Devolvemos la variable resultado
    }

    /**
     * Precondición: solo se puede pasar por argumento una cadena de texto "true" o "false", ninguna otra
     *
     * Metodo que devolverá false si
     * @param cadena es igual a "false" y true si es igual a "true"
     * @return verdadero o falso segun la cadena de texto introducida
     */
    public static boolean parseToBoolean(String cadena){
        //Declaramos las variables
        boolean resultado = false;  //Variable que usaremos para devolver el resultado segun lo introducido por parametros

        if (cadena.equals("false")){        //Si la cadena introducida por parámetros es igual a "false"
            resultado=false;                //La variable resultado es igual a false
        }else if (cadena.equals("true")){   //Si la cadena introducida por parámetros es igual a "true"
            resultado=true;                 //La variable resultado es igual a true
        }

        return resultado;                   //Devolvemos la variable resultado
    }
}
