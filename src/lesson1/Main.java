package lesson1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {

    public static void main(String[] args) {
	// Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);
        Integer [] items = {2, 4, 1232, 2, 123, 3, 4, 44};
        int i = 3;
        int j = 6;
        transposition(items, i, j);
        System.out.println(Arrays.toString(items));
    //Написать метод, который преобразует массив в ArrayList
        List<Integer> numbers = arrayToList(items);
        System.out.println(numbers.toString());
    }

    private static <T> void transposition(T[] array, int i, int j) { //метод, меняющий элементы массива местами
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static <T> List<T> arrayToList(T[] array) { //метод, преобразующий массив в список
        return new ArrayList<>(Arrays.asList(array));
    }
}
