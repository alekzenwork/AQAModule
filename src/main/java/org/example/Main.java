package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Car ferrari = new Car();

        int[] integers = new int[4];
        integers[0] = 1;
        integers[1] = 2;
        integers[2] = 3;
        integers[3] = 4;

        int[] numbers = {1, 2, 3, 4};

        List<String> names = new ArrayList<>();
        names.add("Pavel");
        names.add("Ivan");
        names.add("Sergey");

        checkIntegers(integers[1]);
        checNames(names.get(0));

//        int count = 10;
//        while (count >= 0){
//            System.out.println("До запуска: " + count);
//            count--;
//        }

        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] == 3){
                break;
            }
            System.out.println(numbers[i]);
        }

        for(String s : names){
            System.out.println(s);
        }

    }

    public static void checkIntegers(int test) {
        if (test == 2) {
            System.out.println("It's correct number");
        } else {
            System.out.println("It's wrong number");
        }

    }


    public static void checNames(String name) {
        switch (name) {
            case "Pavel" -> {
                System.out.println("It's Pavel");
                break;
            }
                case "Ivan" -> {
                    System.out.println("It's Ivan");
                    break;
                }
                default -> System.out.println("It's incorect name");
            }
        }
    }