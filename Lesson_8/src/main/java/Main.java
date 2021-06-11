import Obstacles.Runway;
import Obstacles.Wall;
import Units.Cat;
import Units.Human;
import Units.Jumpable;
import Units.Robot;
import Units.Runnable;

import java.util.ArrayList;
import java.util.List;

// У меня тут каша. Я сам запутался. Нужно еще поработать.

public class Main {
    public static void main(String[] args) {
        Human human1 = new Human();
        Cat cat1 = new Cat();
        Robot robot1 = new Robot();

        Runway runway1 = new Runway();
        Runway runway2 = new Runway();
        Runway runway3 = new Runway();

        Wall wall1 = new Wall();
        Wall wall2 = new Wall();
        Wall wall3 = new Wall();



//        Jumpable[] jumpableUnits = new Jumpable[9];
//        for (int i = 0; i < jumpableUnits.length; i++) {
//            if (i < jumpableUnits.length / 3) {
//                jumpableUnits[i] = new Human();
//            } else if (i < jumpableUnits.length * 2 / 3) {
//                jumpableUnits[i] = new Cat();
//            } else {
//                jumpableUnits[i] = new Robot();
//            }
//        }
//
//        jumpableUnits[1].jump();
//
//        Runnable[] runnableUnits = new Runnable[9];
//        for (int i = 0; i < runnableUnits.length; i++) {
//            if (i < runnableUnits.length / 3) {
//                runnableUnits[i] = new Human();
//            } else if (i < runnableUnits.length * 2 / 3) {
//                runnableUnits[i] = new Cat();
//            } else {
//                runnableUnits[i] = new Robot();
//            }
//        }
//
//        runnableUnits[1].run();

        List<Object> allUnits = new ArrayList<>();
        allUnits.add(human1);
        allUnits.add(cat1);
        allUnits.add(robot1);

        List<Object> allObstacles = new ArrayList<>();
        allObstacles.add(runway1);
        allObstacles.add(runway2);
        allObstacles.add(runway3);

        allObstacles.add(wall1);
        allObstacles.add(wall2);
        allObstacles.add(wall3);

        for (Object oneUnit : allUnits){
            if (oneUnit instanceof Runnable) {
                Runnable runUnit = (Runnable) oneUnit;

                for (Object oneObstacle : allObstacles) {
                    if (oneObstacle instanceof Runway) {
                        Runway runObstacle = (Runway) oneObstacle;
                        runUnit.run(runObstacle);
                    }
                }
//                runUnit.run(runway1);
//                runUnit.run(runway2);
//                runUnit.run(runway3);
            }

            if (oneUnit instanceof Jumpable) {
                Jumpable jumpUnit = (Jumpable) oneUnit;
                for (Object oneObstacle : allObstacles) {
                    if (oneObstacle instanceof Wall) {
                        Wall JumpObstacle = (Wall) oneObstacle;
                        jumpUnit.jump(JumpObstacle);
                    }
                }
//                jumpUnit.jump(wall1);
//                jumpUnit.jump(wall1);
//                jumpUnit.jump(wall1);
            }
        }

    }
}
