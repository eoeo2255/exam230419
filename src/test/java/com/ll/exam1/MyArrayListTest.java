package com.ll.exam1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MyArrayListTest {

    private MyArrayList<String> list;

    @BeforeEach
    void setUp() {
        list = new MyArrayList<>();
    }

    @Test
    void testSize() {
        list.add("Element1");
        list.add("Element2");
        list.add("Element3");
        assertEquals(3, list.size());
    }

}
