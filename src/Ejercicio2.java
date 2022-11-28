public class Ejercicio2 {
    /*
    Diseña dos funciones de nombre media que hagan lo siguiente:

        La primera de las funciones recibirá dos argumentos de tipo entero y devolverá la media de ambos.
        El valor a devolver debe ser double.

        La segunda de las funciones recibirá tres argumentos de tipo entero y devolverá la media de los
        tres. El tipo a devolver debe ser double.

     */

    public static void main(String[] args) {
        System.out.println("El resultado de la media de los enteros 8 y 7 es: "+media(8, 7));
        System.out.println("El resultado de la media de los double 4.5 y 9.2 es: "+media(4.5, 9.2));
    }

    /**
     * Metodo que calcula la media de
     * @param a y
     * @param b que son enteros introducidos por parámetros y se devuelve
     * @return
     */
    public static double media(int a, int b){
        double suma=a+b;
        return suma/2;
    }

    public static double media(double a, double b){
        return (a+b)/2;
    }
}
