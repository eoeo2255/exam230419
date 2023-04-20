package com.ll.exam1;

import com.ll.TestUt;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

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
    }

    @Test
    @DisplayName("배열의 크기 자동 증가")
    void t04() {
        MyArrayList<String> list = new MyArrayList<>();

        int dataLength1 = ((Object[]) TestUt.getFieldValue(list, "data", null)).length;

        // 데이터 사이즈+1 만큼의 데이터를 넣음, 배열 길이 초과로 이사가야 됨
        IntStream.range(0, dataLength1 + 1)
                .forEach(index -> list.add("Element2 %d".formatted(index)));

        int dataLength2 = ((Object[]) TestUt.getFieldValue(list, "data", null)).length;
        assertThat(dataLength2).isGreaterThan(dataLength1);
    }

    @Test
    @DisplayName("MyArrayList 초기화 시 생성자 인자로 배열의 사이즈 지정")
    void t05() {
        MyArrayList<String> list = new MyArrayList<>(200);

        int dataLength = ((Object[]) TestUt.getFieldValue(list, "data", null)).length;

        assertThat(dataLength).isEqualTo(200);
    }

    @Test
    @DisplayName("indexOf()")
    void t06() {
        MyArrayList<String> list = new MyArrayList<>(200);

        IntStream.range(0, 100)
                .forEach(index -> list.add("사과 %d".formatted(index)));

        assertThat(list.indexOf("사과 0")).isEqualTo(0);
        assertThat(list.indexOf("사과 1")).isEqualTo(1);
        assertThat(list.indexOf("사과 5")).isEqualTo(5);
        assertThat(list.indexOf("사과 99")).isEqualTo(99);
        assertThat(list.indexOf("사과 100")).isEqualTo(-1);
    }

    @Test
    @DisplayName("add(true)")   // String 뿐만 아니라 Boolean 타입도 받을 수 있음
    void t07() {
        MyArrayList<Boolean> list = new MyArrayList<>(200);

        list.add(true);
        list.add(false);

        assertThat(list.size()).isEqualTo(2);
    }

    @Test
    @DisplayName("get(1)")  // String 뿐만 아니라 Boolean 타입의 값도 반환할 수 있음
    void t08() {
        MyArrayList<Boolean> list = new MyArrayList<>();

        list.add(true);
        list.add(false);

        boolean e0 = list.get(0);
        boolean e1 = list.get(1);

        assertThat(e0).isEqualTo(true);
        assertThat(e1).isEqualTo(false);
    }
}
