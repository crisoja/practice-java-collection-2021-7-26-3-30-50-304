package com.thoughtworks.collection;

import org.apache.commons.lang3.NotImplementedException;

import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {

    public List<Integer> filterEven(List<Integer> numbers) {
        return numbers
                .stream()
                .filter(a -> a % 2 == 0)
                .collect(Collectors.toList());

    }
    
    public List<String> filterEndWithS(List<String> words) {
        return words
                .stream()
                .filter(a -> a.charAt(a.length()-1) == 's')
                .collect(Collectors.toList());
    }

    public List<Integer> getCommonElements(List<Integer> numbers, List<Integer> anotherNumbers) {
        return numbers
                .stream()
                .filter(anotherNumbers::contains)
                .collect(Collectors.toList());
    }


}
