package TP3.Ejercicio1;

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

    // c) Metodo para retornar una nueva instancia del iterador
    @Override public Iterator<String> iterator(){
        return new StackIterator();
    }

    // b) Clase anidada interna (no estática);
    // e) la hago private para evitar instanciar desde fuera de la clase
    private class StackIterator implements Iterator<String>{
        private int posicion = items.size() - 1;

        // Recorrido LIFO (desde el tope hacia la base)
        @Override
        public boolean hasNext() {
            return posicion >= 0;
        }

        @Override public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return items.get(posicion--);
        }
    }
}