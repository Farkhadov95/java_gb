import java.util.Locale;

public class Animal {
    String type;
    String name;
    int maxRun;
    int maxSwim;
    double maxJump;

    public Animal(String type, String name, int maxRun, int maxSwim, double maxJump) {
        this.type = type.toLowerCase(Locale.ROOT);
        this.name = name;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
        this.maxJump = maxJump;

        if(type == "cat") {
            System.out.println("Кличка кота/кошки: " + name);
        } else if(type == "dog") {
            System.out.println("Кличка собаки: " + name);
        } else {
            return;
        }

        System.out.println("Максимальная дальность бега: " + maxRun + " метров");
        System.out.println("Максимальная дальность плавания: " + maxSwim + " метров");
        System.out.println("Максимальная высота прыжка: " + maxJump + " метров");
    }


    public void run(int distance){
        if((distance <= maxRun) && (distance >= 0)) {
            System.out.println(name + " бежит " + distance + " метров");
        } else {
            System.out.println(name +   " не бегает на эту дистанцию");
        }
    }

    public void jump(double height){
        if((height <= maxJump) && (height >= 0)){
            System.out.println(name + " прыгает на высоту " + height + " метров");
        } else {
            System.out.println(name + " не прыгает на эту высоту");
        }
    }

    public void swim(int distance){
        if((distance <= maxSwim) && (distance >= 0)) {
            System.out.println(name + " плывет " + distance + " метров");
        } else {
            System.out.println(name + " не плавает на эту дистанцию");
        }
    }
}
