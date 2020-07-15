package lesson1;

public class MainBoxClass {
    public static void main(String[] args) {
        FruitBox <Apple> appleBox = new FruitBox<>(); //создаем коробку для яблок
        FruitBox <Orange> orangeBox = new FruitBox<>(); //создаем коробку для апельсин
        for (int i = 0; i < 15; i++) { //добавляем яблоки в коробку
            appleBox.addFruit(new Apple());
        }
        System.out.println("Вес коробки с яблоками: " + appleBox.getWeight());
        for (int i = 0; i < 10; i++) { //добавляем апельсины в коробку
            orangeBox.addFruit(new Orange());
        }
        System.out.println("Вес коробки с апельсинами: " + orangeBox.getWeight());
        System.out.println(appleBox.compare(orangeBox));
        System.out.println("В первой коробе осталось яблок: " + appleBox.getBox().size());
        FruitBox <Apple> appleBox2 = new FruitBox<>();
        appleBox.boxPouring(appleBox2); //пересыпка фруктов в новую коробку
        System.out.println("В первой коробе осталось яблок: " + appleBox.getBox().size());
        System.out.println("Во второй коробе яблок: " + appleBox2.getBox().size());
    }
}
