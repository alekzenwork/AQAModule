package org.example;

/*
Сайт знакомств
    Вы создаете базу данных пользователей для сайта знакомств.

    Да вот беда — вы подзабыли в каком порядке их нужно указывать, а технического задания под рукой нет.

    Спроектируйте класс User,  у которого будут поля — имя (String) возраст (short) и рост (int).

    Создайте для него необходимое количество конструкторов, чтобы имя, возраст и рост можно было указывать в любом порядке.

 */





public class User {

        String name;
        short age;
        int height;

    //Имя возраст рост
        public User(String name, short age, int height) {
            this.name = name;
            this.age = age;
            this.height = height;
        }

    //Имя рост возраст
        public User(String name, int height, short age) {
            this.name = name;
            this.height = height;
            this.age = age;
        }
    //возраст Имя рост
        public User(short age, String name, int height) {
            this.age = age;
            this.name = name;
            this.height = height;
        }
    //возраст рост Имя
        public User(short age, int height, String name) {
            this.age = age;
            this.height = height;
            this.name = name;
        }

    //рост Имя возраст
        public User(int height, String name, short age) {
            this.height = height;
            this.name = name;
            this.age = age;
        }

    //рост возраст Имя
        public User(int height, short age, String name) {
            this.height = height;
            this.age = age;
            this.name = name;
        }

        public static void main(String[] args) {
            User me = new User("Баранов Александр", 177, (short)24);
    }
}
