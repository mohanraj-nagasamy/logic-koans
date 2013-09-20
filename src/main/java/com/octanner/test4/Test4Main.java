package com.octanner.test4;

import java.util.*;

public class Test4Main {
    public static void main(String[] args) {

        //Reverse sort
        List<Integer> integerList = new ArrayList<Integer>();
        integerList.add(10);
        integerList.add(11);
        integerList.add(3);
        integerList.add(3010);
        integerList.add(3);
        integerList.add(30);



        List<Person> persons = new ArrayList<Person>();
        persons.add(new Person("joe", 33));
        persons.add(new Person("john", 23));
        persons.add(new Person("joel", 57));
        persons.add(new Person("brody", 25));

    }

    static class Person {
        private String name;
        private int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        String getName() {
            return name;
        }

        void setName(String name) {
            this.name = name;
        }

        int getAge() {
            return age;
        }

        void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }

    }
}
