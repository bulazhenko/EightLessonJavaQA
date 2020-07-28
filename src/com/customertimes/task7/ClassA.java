package com.customertimes.task7;

import java.util.HashSet;
import java.util.Set;

//7. In the Example class, implement a couple of equals / hashCode methods in accordance with the rules for implementing
// these methods (check details with your favorite search engine).
//Both the first and last strings should participate in the comparison using the equals method and the hashcode calculation.
//public class Example {
//    private final String first, last;
//
//    public Example(String first, String last) {
//        this.first = first;
//        this.last = last;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        return false;
//    }
//
//    @Override
//    public int hashCode() {
//        return 0;
//    }
//
//    public static void main(String[] args) {
//        Set<Example> s = new HashSet<>();
//        s.add(new Example(""Donald"", ""Duck""));
//        System.out.println(s.contains(new Example(""Donald"", ""Duck"")));
//    }
//}

public class ClassA {
    public String first;
    public String last;

    public ClassA(String first, String last) {
        this.first = first;
        this.last = last;
    }

    @Override
    public boolean equals(Object o) { return this.hashCode() == o.hashCode() && this.getClass().equals(o.getClass());
    }

    @Override
    public int hashCode() {
        int hash = 19;
        hash = hash * 13 + first.hashCode();
        hash = hash * 13 + last.hashCode();
        return hash;
    }

    public static void main(String[] args) {
        Set<ClassA> s = new HashSet<>();
        s.add(new ClassA("Donald", "Duck"));
        System.out.println(s.contains(new ClassA("Donald", "Duck")));
    }
}
