package Units;

import Obstacles.Runway;
import Obstacles.Wall;

import java.util.Random;

public class Cat implements Jumpable, Runnable{
    Wall wall1 = new Wall();
    Runway runway1 = new Runway();
    Random rand = new Random();

    @Override
    public void run(Runway runwayName) {
        int distance = rand.nextInt(100);
        int runwayLength = rand.nextInt(100);
        runwayName.runOver(distance, runwayLength);
    }

    @Override
    public void jump(Wall wallName) {
        int height = rand.nextInt(100);
        int wallHeight = rand.nextInt(100);
        wallName.jumpOver(height, wallHeight);
    }
}
