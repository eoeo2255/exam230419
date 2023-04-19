package com.ll.exam1;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


class MyArrayListTest {
    @Test
    void testSize() {
        MyArrayList<String> list = new MyArrayList<>();

        list.add("Element1");
        list.add("Element2");
        list.add("Element3");

        assertThat(list.size()).isEqualTo(3);
    }

    @Test
    void testAdd() {
        MyArrayList<String> list = new MyArrayList<>();

        list.add("Element1");

        assertThat(list.size()).isEqualTo(1);
        assertThat(list.get(0)).isEqualTo("Element1");
    }

}
