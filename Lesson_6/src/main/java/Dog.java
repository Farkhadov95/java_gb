public class Dog extends Animal{
    public Dog(String name, int maxRun, int maxSwim, double maxJump) {
        super(name, maxRun, maxSwim, maxJump);
        System.out.println("Кличка собаки: " + name);
        System.out.println("Максимальная дальность бега: " + maxRun + " метров");
        System.out.println("Максимальная дальность плавания: " + maxSwim + " метров");
        System.out.println("Максимальная высота прыжка: " + maxJump + " метров");
    }
}
