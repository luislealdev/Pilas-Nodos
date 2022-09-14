import java.util.Stack;

public class Exe {
    public static void main(String[] args) {
        // PRACTICA DE PILAS ESTÁTICAS, DINÁMICAS, NODOS Y STACKS

        // PILAS ESTÁTICAS
        // Creamos una pila estática con una clase propia
        PilaEstatica pe_numeros = new PilaEstatica(5);
        // Metemos números a la pila
        pe_numeros.push(1);
        pe_numeros.push(5);
        pe_numeros.push(6);
        // Confirmamos que el número a salir si hacemos un pop, será el último que entró
        System.out.println(pe_numeros.pop());
        // Al confirmarse entonces el siguiente dato a salir debería ser el penultimo en
        // entrar
        System.out.println(pe_numeros.pop());
        System.out.println(pe_numeros.pop());
        // Como solo metimos 3 valores en la pila, si ejecutamos el pop nos daría un
        // error de index, por eso el método pop de la clase va a tener una
        // comprobación de que si el tope ya fue el último elemento, regrese un error
        // Underflow con un mensaje personalizado
        System.out.println(pe_numeros.pop());

        // --------------------------------------------------------------

        // PILAS DINÁMICAS
        // Creamos un nodo (el primero que sería el inicio)
        Nodo v_nodo1 = new Nodo(5);
        // Creamos la pila dinámica y agregamos como valor inicial el nodo ya creado
        PilaDinamica v_pilaDinamica = new PilaDinamica(v_nodo1);
        // Le agregamos un nuevo valor que ahora se convertirá en el tope
        v_pilaDinamica.push(10);
        // Verificamos que el proceso haya servido viendo si el resultado que regresa
        // el pop es 10 y luego 5
        System.out.println(v_pilaDinamica.pop().info); // Se saca el atributo info
        // porque sino solo regresa el apuntador
        System.out.println(v_pilaDinamica.pop()); // Ejemplo de como solo regresa el
        // apuntador
        System.out.println(v_pilaDinamica.pop()); // Regresa un null si ya llegó al
        // final de la pila y se intenta sacar otro dato

        // --------------------------------------------------------------

        // STACKS (CLASE PILAS DE JAVA)
        // Creamos un stack de enteros
        Stack<Integer> pila = new Stack<Integer>();
        // Podemos verificar si la pila está vacía con el método peek
        if (pila.empty() == true) {
            System.out.println("La pila está vacía");
        }
        // Agregamos datos a la pila
        pila.push(5);
        pila.push(15);
        // Verificamos que la pila ya no esté vacía
        if (pila.empty() == true) {
            System.out.println("La pila está vacía");
        }
        // Podemos ver el último valor de la pila sin sacarlo con el método peek
        System.out.println("El último valor de la pila es " + pila.peek());
        // Ahora si podemos sacar los valores de la pila
        System.out.println(pila.pop());
        System.out.println(pila.pop());
        // Verificamos si la pila está vacía de nuevo
        if (pila.empty() == true) {
            System.out.println("La pila está vacía");
        }
    }
}
