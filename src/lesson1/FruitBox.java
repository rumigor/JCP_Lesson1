package lesson1;

import java.util.ArrayList;

public class FruitBox <T extends Fruit>  {
    private ArrayList<T> box = new ArrayList<>();
    public ArrayList<T> getBox() {
        return box;
    }

    public float getWeight() { //узнаем вес коробки
        float weight = 0f;
        for (Fruit t : box) {
            weight+= t.getFruitWeight();
        }
        return weight;
    }

    public boolean compare(FruitBox<?>  o) { //сравниваем коробки
        return Math.abs(this.getWeight() - o.getWeight()) < 0.0001;
    }

    public void addFruit(T o){ //добавляем фрукт в коробку
        box.add(o);
    }

    public void boxPouring (FruitBox<T>  o){ //пересыпаем из коробки в другую коробку
        o.box.addAll(this.box);
        this.box.clear();
    }
}
