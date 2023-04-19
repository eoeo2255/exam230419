package com.ll.exam1;

public class MyArrayList<T> {
    private String[] data = new String[3];
    int size =0;

    public boolean add(String element) {
        spaceCheck();
        data[size] = element;
        size++;

        return true;
    }

    public int size() {
        return size;
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
        String [] newData = new String[data.length*2];

        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }

        data = newData;
    }

    public String get(int i) {
        return data[i];
    }
}
