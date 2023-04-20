package com.ll.exam1;

public class MyArrayList<T> {
    private Object[] data;
    int size =0;

    public MyArrayList() {
        this(2);
    }

    public MyArrayList(int dataLength) {
        data = new Object[dataLength];
    }

    public int size() {
        return size;
    }

    public boolean add(Object element) {
        spaceCheck();
        data[size] = element;
        size++;

        return true;
    }

    private void spaceCheck() {
        if (ifNotEnough()) {
            makeNewData();
        }
    }

    private boolean ifNotEnough() {
        return size >= data.length;
    }

    private void makeNewData() {
        Object[] newData = new String[data.length * 2];

        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }

        data = newData;
    }

    public Object get(int i) {
        return data[i];
    }

    public int indexOf(Object element) {
        for (int i = 0; i < data.length; i++) {
            if (element.equals(data[i])) {
                return i;
            }
        }
        return -1;
    }
}
