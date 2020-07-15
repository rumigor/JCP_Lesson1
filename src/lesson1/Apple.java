package lesson1;


public class Apple extends Fruit {
    private float fruitWeight = 1.0f;

    @Override
    public float getFruitWeight() {
        return fruitWeight;
    }

    @Override
    public void setFruitWeight(float fruitWeight) {
        this.fruitWeight = fruitWeight;
    }
}
