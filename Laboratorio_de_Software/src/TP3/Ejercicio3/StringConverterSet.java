package TP3.Ejercicio3;

import java.util.AbstractSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class StringConverterSet<E> extends AbstractSet<String> {
    private final Set<E> set;

    // Constructor que recibe el conjunto subyacente a adaptar
    public StringConverterSet(Set<E> set){
        this.set = Objects.requireNonNull(set, "El conjunto subyacente no puede ser nulo.");
    }

    // Constructor por defecto
    public StringConverterSet() {
        this(new HashSet<>());
    }

    @Override
    public int size() {
        return set.size();
    }

    @Override
    public boolean isEmpty() {
        return set.isEmpty();
    }

    @Override
    public void clear() {
        set.clear();
    }

    @Override public Iterator<String> iterator() {
        return new IteratorStringAdapter(set.iterator());
    }

    // =========================================================================
    // Clase Anidada / Adapter: Adapta Iterator<E> a Iterator<String>
    // =========================================================================
    public class IteratorStringAdapter implements Iterator<String>{
        private final Iterator<E> iterator;

        public IteratorStringAdapter(Iterator<E> iterator) {
            this.iterator = iterator;
        }

        public IteratorStringAdapter() {
            this.iterator = set.iterator();
        }

        @Override
        public boolean hasNext() {
            return iterator.hasNext();
        }

        @Override
        public String next() {
            E elemento = iterator.next();
            return (elemento != null) ? elemento.toString() : null;
        }

        @Override
        public void remove() {
            iterator.remove();
        }
    }
}
