package com.ll.exam;

import com.ll.exam2.MyHashMap;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.in;

public class MyHashMapTest {

    @Test
    @DisplayName("size()")
    void t01() {
        MyHashMap<String, Integer> map = new MyHashMap<>();
        assertThat(map.size()).isEqualTo(0);
    }

    @Test
    @DisplayName("put()")
    void t02() {
        MyHashMap<String, Integer> map = new MyHashMap<>();

        map.put("철수", 24);
        map.put("영희", 17);

        assertThat(map.size()).isEqualTo(2);
    }

    @Test
    @DisplayName("get()")
    void t03() {
        MyHashMap<String, Integer> map = new MyHashMap<>();

        map.put("철수", 24);
        map.put("영희", 17);
        map.put("울트론", 183118797);

        int ageOf철수 = map.get("철수");
        int ageOf영희 = map.get("영희");
        int ageOf울트론 = map.get("울트론");

        assertThat(ageOf철수).isEqualTo(24);
        assertThat(ageOf영희).isEqualTo(17);
        assertThat(ageOf울트론).isEqualTo(183118797);
    }
}
