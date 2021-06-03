public class Animal {
    String name;
    int maxRun;
    int maxSwim;
    double maxJump;

    public Animal(String name, int maxRun, int maxSwim, double maxJump) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
        this.maxJump = maxJump;
    }


    public void voice(String name) {
        System.out.println(name + " залаяла");
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
