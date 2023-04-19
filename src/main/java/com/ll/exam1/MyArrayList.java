package com.ll.exam1;

public class MyArrayList<T> {
    private String[] data = new String[3];
    int size =0;

    public boolean add(String element) {
        data[size] = element;
        size++;

        return true;
    }

    public int size() {
        return size;
    }

    public String get(int i) {
        return data[i];
    }
}
