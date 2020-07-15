package lesson1;

public class Orange extends Fruit {
    private float fruitWeight = 1.5f;

    @Override
    public float getFruitWeight() {
        return fruitWeight;
    }

    @Override
    public void setFruitWeight(float fruitWeight) {
        this.fruitWeight = fruitWeight;
    }
}
