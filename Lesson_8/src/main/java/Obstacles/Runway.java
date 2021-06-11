package Obstacles;

import java.util.Random;

public class Runway {
    public void runOver(int distance, int runwayLength) {
        if(distance > runwayLength){
            System.out.println("Пробежал " + distance + " из " + runwayLength + ". Уре!");
        } else {
            System.out.println("пробежал " + distance + " из " + runwayLength);
        }
    }
}
