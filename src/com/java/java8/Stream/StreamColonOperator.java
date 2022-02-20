package com.java.java8.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class StreamColonOperator {
    public static void main(String[] args) {
        List<String> alphaNumerics = Arrays.asList("A11","A44","a22","a49","G66");
        List<String> strList = alphaNumerics.stream().map(String::toUpperCase).filter(e -> e.startsWith("A")).collect(Collectors.toList());
        System.out.println(strList);

    }
}
