import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        replaceOne();
        arrayFiller();
        arrayMultiplier();
        square();
        findMinMax();
    }

    private static void replaceOne(){
        int[] array = {1,1,0,1,0,1,1,0,0,0,1,0};
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if(array[i] == 1) {
                array[i] = 0;
            } else {
                array[i] = 1;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    private static void arrayFiller(){
        int[] arrayEight = new int[8];
        for (int i = 0; i < arrayEight.length; i++) {
            arrayEight[i] = i * 3;
            System.out.println(arrayEight[i]);
        }
    }

    private static void arrayMultiplier() {
        int[] arrayToMultiply = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arrayToMultiply.length; i++) {
            if(arrayToMultiply[i] < 6) {
                arrayToMultiply[i] *= 2;
            }
        System.out.println(arrayToMultiply[i]);
        }
    }

    private static void square() {
        int[][] squaredArray = new int[10][10];
        for (int i = 0; i < squaredArray.length; i++) {
            for (int j = 0; j < squaredArray[i].length; j++) {
                if(j == i) {
                    squaredArray[i][j] = 1;
                } else if (squaredArray.length-1-i == j) {
                    squaredArray[i][j] = 1;
                }
            }
            System.out.println(Arrays.toString(squaredArray[i]));
        }
    }

    private static void findMinMax(){
        int[] numArray = {8,5,3,2,4,33,9,7,4,2,1,6,10};
        int minNum = numArray[0];
        int maxNum = numArray[0];
        for (int i = 0; i < numArray.length; i++) {
            if(numArray[i] < minNum) {
                minNum = numArray[i];
            }
            if(numArray[i] > maxNum) {
                maxNum = numArray[i];
            }
        }
        System.out.println("Min: " + minNum);
        System.out.println("Max: " + maxNum);
    }
}
