package com.ll.exam;

import com.ll.exam2.MyHashMap;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MyHashMapTest {

    @Test
    @DisplayName("size()")
    void t01() {
        MyHashMap<String, Integer> map = new MyHashMap<>();
        assertThat(map.size()).isEqualTo(0);
    }

    @Test
    @DisplayName("put()")
    void t0() {
        MyHashMap<String, Integer> map = new MyHashMap<>();

        map.put("철수", 24);
        map.put("영희", 17);

        assertThat(map.size()).isEqualTo(2);
    }
}
