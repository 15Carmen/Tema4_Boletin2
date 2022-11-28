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

    /**
     * Metodo que calculará la suma de los numeros desde 1 hasta
     * @param numero que es un entero introducido por parámetros. Se devolverá
     * @return la suma de los numeros
     */
    public static int sumaEnteros(int numero){
        //Declaramos las variables
        int suma=0; //Variable donde guardaremos la suma de los numeros enteros
        for (int i = 1; i <= numero ; i++) {    //Inicializamos el bucle en 1, lo finalizamos en el numero introducido por prametros, y lo incrementamos en 1
             suma+=i;                           //Le vamos sumando a la varaible suma los numeros que van pasando
        }
        return suma;                            //Devolvemos la variable suma
    }

    /**
     * Metodo que calculará la suma de los numeros desde
     * @param num1 hasta
     * @param num2 que son enteros introducidos por parámetros. Se devolverá
     * @return la suma de los numeros
     */
    public static int sumaEnteros(int num1, int num2){
        //Declaramos las variables
        int suma=0; //Variable donde guardaremos la suma de los numeros enteros
        for (int i = num1; i <=num2 ; i++) {   //Inicializamos el bucle en 1, lo finalizamos en el numero introducido por prametros, y lo incrementamos en 1
            suma+=i;                           //Le vamos sumando a la varaible suma los numeros que van pasando
        }
        return suma;                           //Devolvemos la variable suma
    }
}
