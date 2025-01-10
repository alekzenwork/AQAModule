package org.example;

public class StreetCat {
    String name;
    int age;

    static int count = 0;

    public StreetCat() {
        count++;
        this.name = "Уличный кот номер " + count;
    }

    public StreetCat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {

        StreetCat streetCat1 = new StreetCat();
        StreetCat streetCat2 = new StreetCat();
        System.out.println(streetCat1.name);
        System.out.println(streetCat2.name);
    }
}
