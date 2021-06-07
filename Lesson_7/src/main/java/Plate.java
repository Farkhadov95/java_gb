public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void decreaseFood(int ap) {
        if(food < ap){
            System.out.println("Не хватает " + ((food-ap)*(-1)) + " чтобы наесться");
        }else{
            food -= ap;
        }
    }

    public void increaseFood(int amount) {
        food += amount;
        System.out.println("Добавлено в тарелку: " + amount);
        info();
    }

    public void info(){
        System.out.println("В тарелке: " + food);
    }
}
