package com.ll.exam2;

public class MyHashMap<K, V> {
    private int size = 0;
    private final Object[] keys;
    private final Object[] values;

    public MyHashMap() {
        this(3);
    }

    public MyHashMap(int arrayLength) {
        keys = new Object[arrayLength];
        values = new Object[arrayLength];
    }

    public int size() {
        return size;
    }

    public V put(K key, V value) {  // map >> put을 했을 때 덮어쓰기가 되면 덮어씌워지기 이전 값을 반환한다.
        keys[size] = key;
        values[size] = value;

        size++;
        return null;
    }

    public V get(K key) {
        int indexOfKey = indexOfKey(key);

        if (indexOfKey == -1) {return null;}

        return (V) values[indexOfKey];
    }

    private int indexOfKey(K key) {
        for (int i = 0; i < size; i++) {
            if(key.equals(keys[i])) {
                return i;
            }
        }
        return -1;
    }
}
