package mbn;

import java.util.*;

public class MapImpl<K, V> implements Map<K, V> {

    private List<Pair<K, V>> values = new ArrayList<>();

    public List<Pair<K, V>> getValues() {
        return values;
    }

    // TODO: handle duplicate and null keys
    @Override
    public void put(K key, V value) {
        Pair<K, V> pair = new Pair<>(key, value);
        values.add(pair);
    }

    @Override
    public V get(K key) {
        return values.stream()
                .filter(pair -> pair.getKey().equals(key))
                .findFirst()
                .map(pair -> pair.getValue())
                .orElse(null);
    }

    @Override
    public V remove(K key) {
        Iterator<Pair<K, V>> iterator = values.listIterator();
        while (iterator.hasNext()) {
            Pair<K, V> currentPair = iterator.next();
            if (currentPair.getKey().equals(key)) {
                values.remove(currentPair);
                return currentPair.getValue();
            }
        }
        return null;
    }

    public int size() {
        return values.size();
    }
}
