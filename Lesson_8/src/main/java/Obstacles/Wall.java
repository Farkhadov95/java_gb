package Obstacles;

public class Wall {
    public void jumpOver(int height, int wallHeight) {
        if(height > wallHeight){
            System.out.println("Перепрыгнул " + wallHeight + " метровую стену");
        } else {
            System.out.println("НЕ перепрыгнул");
        }
    }
}
