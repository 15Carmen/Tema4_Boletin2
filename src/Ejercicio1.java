public class Ejercicio1 {
    /*
    Diseña dos funciones de nombre suma que hagan lo siguiente:

        La primera de las funciones recibirá dos argumentos de tipo entero y devolverá la suma de ambos. El
        valor a devolver también será entero.

        La segunda de las funciones recibirá dos argumentos de tipo double y devolverá la suma de ambos. El
        tipo a devolver debe ser también double.

     */

    public static void main(String[] args) {

        //Imprimimos por pantalla el resultado de los dos métodos
        System.out.println("El resultado de la suma de los enteros 5 y 7 es: "+suma(5, 7));
        System.out.println("El resultado de la suma de los double 4.5 y 9.2 es: "+suma(4.5, 9.2));
    }

    /**
     * Metodo que suma los booleanos
     * @param a y
     * @param b que son introducidos por parámetros y se devuelve
     * @return el resultado de la suma de ambos
     */
    public static double suma(double a, double b){
        return a+b;
    }

    /**
     * Metodo que suma los enteros
     * @param a y
     * @param b que son introducidos por parámetros y se devuelve
     * @return el resultado de la suma de ambos
     */
    public static int suma(int a, int b){
        return a+b;
    }
}
