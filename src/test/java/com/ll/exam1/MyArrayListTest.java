package com.ll.exam1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


class MyArrayListTest {
    @Test
    @DisplayName("Size(2)")
    void t01() {
        MyArrayList<String> list = new MyArrayList<>();

        list.add("Element1");
        list.add("Element2");

        assertThat(list.size()).isEqualTo(2);
    }
    @Test
    @DisplayName("Size(4)")
    void t01_2() {
        MyArrayList<String> list = new MyArrayList<>();

        list.add("Element1");
        list.add("Element2");
        list.add("Element3");
        list.add("Element4");

        assertThat(list.size()).isEqualTo(4);
    }

    @Test
    @DisplayName("Add()")
    void t02() {
        MyArrayList<String> list = new MyArrayList<>();

        list.add("Element1");

        assertThat(list.size()).isEqualTo(1);
    }

    @Test
    @DisplayName("Get()")
    void t03() {
        MyArrayList<String> list = new MyArrayList<>();

        list.add("Element1");

        assertThat(list.size()).isEqualTo(1);
        assertThat(list.get(0)).isEqualTo("Element1");
    }

    @Test
    @DisplayName("Size(4)")
    void t01_3() {
        MyArrayList<String> list = new MyArrayList<>();

        list.add("Element1");
        list.add("Element2");
        list.add("Element3");
        list.add("Element4");

        assertThat(list.size()).isEqualTo(4);
        assertThat(list.get(0)).isEqualTo("Element1");
    }
}
