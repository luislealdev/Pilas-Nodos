public class PilaDinamica {
    Nodo Inicio;

    PilaDinamica(Nodo p_inicio) {
        Inicio = p_inicio;
    }

    // Agregar un dato a la pila
    void push(int p_datoNuevo) {
        Nodo temp;
        temp = new Nodo(p_datoNuevo);
        if (Inicio == null) {
            Inicio = temp;
        }
        // El else significa que por lo menos ya hay una caja apilada
        else {
            temp.siguiente = Inicio;
            Inicio = temp;
        }
    }

    // Eliminar un dato de la pila
    Nodo pop() {
        Nodo aux = Inicio;
        if (Inicio != null)
            Inicio = Inicio.siguiente;
        return aux;
    }
}