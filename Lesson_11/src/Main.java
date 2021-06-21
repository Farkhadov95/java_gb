import Fruits.Apple;
import Fruits.Box;
import Fruits.Fruits;
import Fruits.Orange;

public class Main {
    public static void main(String[] args) {
        // Задание 1
        GenericSwap<Integer> intSwap = new GenericSwap();
        Integer[] intArr = {0, 1, 2, 3, 4, 5};
        intSwap.swapMachine(intArr, 2,4);


        // Задание 2
        String[] words = {"ace", "boom", "crew", "dog"};
        Integer[] nums = {1, 2, 3, 4};

        ArrayTransformer<String> stringArrayTransformer = new ArrayTransformer();
        ArrayTransformer<Integer> integerArrayTransformer = new ArrayTransformer();
        stringArrayTransformer.arrayToList(words);
        integerArrayTransformer.arrayToList(nums);

        // Задание 3
        Apple apple = new Apple();
        Orange orange = new Orange();
        Box<Orange> orangeBox = new Box<Orange>();
        Box<Apple> appleBox = new Box<Apple>();
        Box<Apple> appleBox2 = new Box<Apple>();


        orangeBox.addFruit(orange);
        orangeBox.addFruit(orange);
        orangeBox.addFruit(orange);

        orangeBox.getWeight(orange);

        appleBox.addFruit(apple);
        appleBox.addFruit(apple);
        appleBox.addFruit(apple);

        appleBox.getWeight(apple);

        appleBox2.addFruit(apple);
        appleBox2.addFruit(apple);
        appleBox2.addFruit(apple);

        appleBox2.getWeight(apple);

        // Немного по деревенски вышло, просто уже сделать изящнее голова не работает
        appleBox.compare(appleBox2, apple, apple);
    }
}
