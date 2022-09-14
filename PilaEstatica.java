public class PilaEstatica {
    int datos[];
    int tope;

    PilaEstatica(int cuantos) {
        tope = 0;
        datos = new int[cuantos];
    }

    void push(int cual) {
        if (tope < datos.length) {
            datos[tope++] = cual;
        } else {
            System.out.println("Se ha llenado la pila");
        }
    }

    int pop() {
        if (tope > 0)
            return datos[--tope];
        else
            throw new Error(
                    "Error: Underflow - Has llegado al final de la pila, no se pueden sacar más datos de los que existen");
    }
}
