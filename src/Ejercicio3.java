public class Ejercicio3 {

    /*
    Diseña dos funciones de nombre sumaEnteros que hagan lo siguiente:

        La primera de las funciones recibirá un argumento (numero) de tipo entero y devolverá la suma de
        todos los números desde 1 hasta numero. El valor a devolver debe ser entero.

        La segunda de las funciones recibirá dos argumentos (num1 y num2) de tipo entero y devolverá la
        suma de todos los números comprendidos entre los dos números (num1 y num2). El tipo a devolver debe
        ser entero.

     */
    public static void main(String[] args) {
        System.out.println("El resultado de la suma de los numeros de 1 a 8 es: "+sumaEnteros(8));
        System.out.println("El resultado de la suma de los numeros de 3 a 9 es: "+ sumaEnteros(3, 9));
    }

    public static int sumaEnteros(int numero){
        int suma=0;
        for (int i = 1; i <= numero ; i++) {
             suma+=i;
        }
        return suma;
    }

    public static int sumaEnteros(int num1, int num2){
        int suma=0;
        for (int i = num1; i <=num2 ; i++) {
            suma+=i;
        }
        return suma;
    }
}
