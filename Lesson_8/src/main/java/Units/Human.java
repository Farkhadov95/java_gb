package Units;


import Obstacles.Runway;
import Obstacles.Wall;

import java.util.Random;

public class Human implements Jumpable, Runnable{
    Wall wall1 = new Wall();
    Runway runway1 = new Runway();
    Random rand = new Random();

//    @Override
//    public void run() {
//        int chance = rand.nextInt(10);
//        if (chance > 5) {
//            runway1.runOver(true);
//        } else {
//            runway1.runOver(false);
//        }
//    }
//
//    @Override
//    public void jump() {
//        int chance = rand.nextInt(10);
//        if (chance > 5) {
//            wall1.jumpOver(true);
//        } else {
//            wall1.jumpOver(false);
//        }
//    }

    @Override
    public void run(Runway runwayName) {
        int distance = rand.nextInt(100);
        int runwayLength = rand.nextInt(100);
        runwayName.runOver(distance, runwayLength);
    }

    @Override
    public void jump(Wall wallName) {
        int height = rand.nextInt(2);
        int wallHeight = rand.nextInt(100);
        wallName.jumpOver(height, wallHeight);
    }
}
