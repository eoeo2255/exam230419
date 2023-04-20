package com.ll.exam2;

public class MyHashMap<K, V> {
    private int size = 0;
    private Entry[] entries; // Entry 는 key 와 value 로 구성되어 있음

    private static class Entry<K, V> {
        K key;
        V value;
        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    public MyHashMap() {
        this(3);
    }

    public MyHashMap(int arrayLength) {
        entries = new Entry[arrayLength];
    }

    public int size() {
        return size;
    }

    public V put(K key, V value) {  // map >> put을 했을 때 덮어쓰기가 되면 덮어씌워지기 이전 값을 반환한다.
        int indexOfKey = indexOfKey(key);

        if (indexOfKey != -1) {
            V old = (V) entries[indexOfKey].value;
            entries[indexOfKey].value = value;
            return old;
        }

        isSpaceEnough();
        entries[size] = new Entry<>(key, value);

        size++;
        return null;
    }

    private void isSpaceEnough() {
        if (isNotEnough()) {
            makeNewArray();
        }
    }

    private void makeNewArray() {
        Entry[] newEntries = new Entry[entries.length * 2];

        for (int i = 0; i < entries.length; i++) {
            newEntries[i] = entries[i];
        }

        entries = newEntries;
    }

    private boolean isNotEnough() {
        return size >= entries.length;
    }

    public V get(K key) {
        int indexOfKey = indexOfKey(key);

        if (indexOfKey == -1) {return null;}

        return (V) entries[indexOfKey].value;
    }

    private int indexOfKey(K key) {
        for (int i = 0; i < size; i++) {
            if(key.equals(entries[i].key)) {
                return i;
            }
        }
        return -1;
    }

    public V remove(K key) {
        int index = indexOfKey(key);

        if (index == -1) {
            return null;
        }
        V old = (V) entries[index].value;

        for (int i = index + 1; i < size; i++) {
            entries[i -1] = entries[i];
        }

        size--;
        return old;
    }

    public boolean containsKey(K key) {
        return indexOfKey(key) != -1;
    }

    public boolean containsValue(V value) {
        return indexOfValue(value) != -1;
    }

    private int indexOfValue(V value) {
        for (int i = 0; i < size; i++) {
            if (value.equals(entries[i].value)) return i;
        }
        return -1;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            entries[i] = null;
        }

        size = 0;
    }

}
