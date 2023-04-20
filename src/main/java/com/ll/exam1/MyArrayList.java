package com.ll.exam1;

public class MyArrayList<T> {                   //모든 타입의 리스트를 만들기 위해 제네릭 사용
    int size = 0;
    private Object[] data;                      // 데이터를 받는 것은 제네릭의 형변환이 일어나기 전이기 때문에 오브젝트 타입으로 받음

    public MyArrayList() {                      // 기본 생성자, 배열의 길이가 2
        this(2);
    }

    public MyArrayList(int dataLength) {        // 데이터를 넣을 배열의 길이를 매개변수로 받는 생성자
        data = new Object[dataLength];
    }

    public int size() {
        return size;
    }           // 배열의 길이 반환

    public boolean add(T element) {             // 제네릭의 타입이 정해졌기 때문에 element 를 T 로 받음
        spaceCheck();
        data[size] = element;
        size++;

        return true;
    }

    public boolean add(int index, T element) {
        spaceCheck();
        makeEmptySpace(index);

        data[index] = element;

        size++;
        return true;
    }

    private void spaceCheck() {
        if (ifNotEnough()) {
            makeNewData();
        }
    }

    private void makeEmptySpace(int index) {
        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }
    }

    private boolean ifNotEnough() {
        return size >= data.length;
    }

    private void makeNewData() {
        Object[] newData = new Object[data.length * 2];

        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }

        data = newData;
    }

    public T get(int i) {                           // 제네릭의 타입이 정해졌기 때문에 element 를 T 로 받음
        return (T) data[i];
    }

    public int indexOf(T element) {
        for (int i = 0; i < data.length; i++) {
            if (element.equals(data[i])) {
                return i;
            }
        }
        return -1;
    }

    public T remove(int index) {
        T old = (T) data[index];

        for (int i = index + 1; i < size; i++) {
            data[i -1] = data[i];
        }

        size--;
        return old;
    }

    public boolean contains(T element) {
        return indexOf(element) != -1;
    }

    public T set(int index, T element) {
        T old = (T) data[index];

        data[index] = element;

        return old;
    }
}
