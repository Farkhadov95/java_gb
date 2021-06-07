public class Main {
    public static void main(String[] args) {
        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Bob", 10);
        cats[1] = new Cat("Boris", 20);
        cats[2] = new Cat("Batman", 30);
        cats[3] = new Cat("Robin", 40);
        cats[4] = new Cat("Jack", 50);
        Plate plate = new Plate(120);
        plate.info();

        for (int i = 0; i < cats.length; i++) {
            cats[i].isFoodEnough(plate);
        }
        System.out.println();
        plate.increaseFood(30);
    }
}
