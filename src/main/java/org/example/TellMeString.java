package org.example;

public class TellMeString {
    public static void main(String[] args) {
        String name = "Java"; // Ссылочный тип
        String anotherName = name; // Ссылка на тот же объект "Java"

        anotherName = "Python"; // Создается новый объект, "anotherName" теперь ссылается на "Python"
        System.out.println(name); // Выведет "Java", так как "name" остался связан с исходным объектом.
        System.out.println(anotherName);
    }
}
