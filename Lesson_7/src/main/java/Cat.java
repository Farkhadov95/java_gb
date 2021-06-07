public class Cat {
    private String name;
    private int appetite;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void isFoodEnough(Plate p){
        if(p.getFood() >= appetite){
            p.decreaseFood(appetite);
            System.out.println(name + " поел " + appetite + " и сыт");
        } else {
            System.out.println(name + "-у не хватает еще " + (appetite - p.getFood()));
            p.info();
        }
    }
}
