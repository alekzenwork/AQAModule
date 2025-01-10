package org.example;


/*
Твоя задача — спроектировать класс Artifact.

Артефакты, которые хранятся в музее, бывают трех видов.

Первый — о которых неизвестно ничего, кроме порядкового номера, присвоенному музеем (например: 212121).
Второй — о которых известен порядковый номер и культура, которой он был создан (например: 212121, "Ацтеки").
Третий вид — о которых известен порядковый номер, культура, которой он был создан, и точный век его создания
(например: 212121, "Ацтеки", 12).


Создай класс Artifact, описывающий хранящиеся в музее древности, и напиши необходимое количество
конструкторов для него. В методе main() создай по одному артефакту каждого вида.
 */
public class Artifact {
    int number;
    String culture;
    String century;

    public Artifact(int number) {
        this.number = number;
    }

    public Artifact(int number, String culture) {
        this.number = number;
        this.culture = culture;
    }

    public Artifact(int number, String culture, String century) {
        this.number = number;
        this.culture = culture;
        this.century = century;
    }



    public static void main(String[] args) {
        Artifact SwordOfTheSolarTiger = new Artifact(2121);
        Artifact AmuletOfThePamirWinds = new Artifact(9892, "Среднеазатские кочевники");
        Artifact CrownOfTheEvergreenOak = new Artifact(8725, "Кельты", "1 век до н.э");
    }
}
