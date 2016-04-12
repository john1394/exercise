package com.somecompany.exercise;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SampleTest {
    @Test
    public void test1() {
        SampleArg a = new SampleArg();
        //
        List<String> b = new ArrayList<String>();
        b.add("aa");
        b.stream().forEach(System.out::println);
        System.out.println(a);

    }
}
