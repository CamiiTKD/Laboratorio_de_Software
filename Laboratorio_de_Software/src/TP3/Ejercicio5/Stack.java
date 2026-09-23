package TP3.Ejercicio5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
public class Stack implements Iterable<String> {
    private ArrayList<String> items;

    public Stack() {
        this.items = new ArrayList<>();
    }

    public void push(String item) {
        this.items.add(item);
    }

    public String pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("La pila está vacía.");
        }
        return this.items.remove(this.items.size() - 1);
    }

    public boolean isEmpty() {
        return this.items.isEmpty();
    }

    // Metodo iterator() utilizando una Clase Anónima
    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>(){
            // Inicialización del atributo de estado para recorrido LIFO
            private int posicion = items.size() - 1;

            @Override
            public boolean hasNext() {
                return posicion >= 0;
            }

            @Override
            public String next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                return items.get(posicion--);
            }
        };
    }
}
