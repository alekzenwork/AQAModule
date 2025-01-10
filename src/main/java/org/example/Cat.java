package org.example;

public class Cat {
        String name;
        int age;


        public Cat(String name, int age) {
            this.name = name;
            this.age = age;
        }


        public Cat() {
        }

        public static void main(String[] args) {

            Cat barsik = new Cat("Barsik", 5);
            Cat streetCat = new Cat();
        }
}
