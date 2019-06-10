package com.crazy.springboot_demo;

import java.util.Arrays;
import java.util.List;

/**
 * TODO
 *
 * @author jaclon
 * @date 2019/6/10 20:50
 */
public class TestDemo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        String[] strs = {"1", "2", "3"};
        List list = Arrays.asList(arr);
        final List<int[]> ints = Arrays.asList(arr);
        final List<String> strings = Arrays.asList(strs);

    }

}
