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

        assertThat(ageOf철수).isEqualTo(24);
        assertThat(ageOf영희).isEqualTo(17);
    }

    @Test
    @DisplayName("배열 자동 증가")
    void t04() {
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

    @Test
    @DisplayName("put, replace")
    void t05() {
        MyHashMap<String, Integer> map = new MyHashMap<>();

        map.put("철수", 22);
        map.put("영희", 23);

        assertThat(
                map.put("영희", 24)
        ).isEqualTo(23);

        assertThat(map.size()).isEqualTo(2);
    }

    @Test
    @DisplayName("remove()")
    void t06() {
        MyHashMap<String, Integer> map = new MyHashMap<>();

        map.put("철수", 22);
        map.put("영희", 23);
        map.put("울트론", 183118797);

        assertThat(map.remove("울트론")).isEqualTo(183118797);
        assertThat(map.remove("영숙")).isEqualTo(null);
    }

    @Test
    @DisplayName("containsKey")
    void t07() {
        MyHashMap<String, Integer> map = new MyHashMap<>();

        map.put("철수", 22);
        map.put("영희", 23);

        assertThat(map.containsKey("영숙")).isEqualTo(false);
        assertThat(map.containsKey("영희")).isEqualTo(true);
    }

    @Test
    @DisplayName("containsValue")
    void t08() {
        MyHashMap<String, Integer> map = new MyHashMap<>();

        map.put("철수", 22);
        map.put("영희", 23);

        assertThat(map.containsValue(183118797)).isEqualTo(false);
        assertThat(map.containsValue(23)).isEqualTo(true);
    }

    @Test
    @DisplayName("clear")
    void t09() {
        MyHashMap<String, Integer> map = new MyHashMap<>();

        map.put("철수", 22);
        map.put("영희", 23);
        map.clear();

        assertThat(map.size()).isEqualTo(0);
    }
}
