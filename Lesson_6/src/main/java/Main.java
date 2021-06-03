public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("The Rock", 200, 10, 1);
        dog1.run(100);
        dog1.swim(10);
        dog1.jump(0.5);
        System.out.println();

        Cat cat1 = new Cat("Kiki", 100, 0, 4);
        cat1.run(12);
        cat1.jump(5);
        cat1.swim(1);
        System.out.println();

        Dog dog2 = new Dog("Persik", 100, 10, 2);
        dog2.run(100);
        dog2.swim(10);
        dog2.jump(0.5);
    }

}
