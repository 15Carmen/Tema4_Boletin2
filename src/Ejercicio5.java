public class Ejercicio5 {
    /*
    Diseña tres funciones de nombre numerosAleatorios que hagan lo siguiente:

        La primera de las funciones recibirá un argumento de tipo entero que indicará la cantidad de números
        aleatorios a generar. Esta función generará números aleatorios comprendidos entre 0 y 1 y los mostrará
        por pantalla.

        La segunda de las funciones recibirá dos argumentos de tipo entero:
        El primero indica la cantidad de números aleatorios a generar
        El segundo indica el valor máximo que tomará el número aleatorio.
        Los números aleatorios generados deben estar entre 0 y el valor máximo introducido por parámetro. En este
        caso los números aleatorios deben ser enteros. Los números aleatorios generados deben mostrarse por pantalla.

        La tercera de las funciones recibirá tres argumentos de tipo entero:
        El primero indica la cantidad de números aleatorios a generar
        El segundo indica el valor mínimo que tomará el número aleatorio.
        El tercero indica el valor máximo que tomará el número aleatorio.
        Los números aleatorios generados deben estar entre el valor mínimo y el valor máximo introducidos por
        parámetro. En este caso los números aleatorios deben ser enteros. Los números aleatorios generados deben
        mostrarse por pantalla.

     */

    public static void main(String[] args) {

        numerosAleatorios(6);
        System.out.println();
        numerosAleatorios(3, 20);
        System.out.println();
        numerosAleatorios(5,20, 50);
    }

    public static void numerosAleatorios(int cantidad){

        int numRandom=0;
        for (int i = 0; i < cantidad; i++) {
            System.out.println(numRandom = (int) (Math.random()*2));
        }
    }

    public static void numerosAleatorios(int cantidad, int max){

        int numRandom=0;
        for (int i = 0; i < cantidad; i++) {
            System.out.println(numRandom = (int) (Math.random()*max));
        }
    }

    public static void numerosAleatorios(int cantidad, int min, int max){
        int numRandom=0;
        for (int i = 0; i < cantidad; i++) {
            System.out.println(numRandom = (int) (Math.random() * (max - min) + min));
        }
    }
}
