import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        byte firstByte = 1;
        short firstShort = 22;
        int firstInt = 333;
        long firstLong = 4444;
        float firstFloat = 5.55F;
        char firstChar = 'a';
        boolean isCorrect = true;
        String firstString = "Первая строка";

        System.out.println(calculate(1.2f,2.3f,4.5f,5.6f));
        System.out.println(isInRang(6, 15));
        isPositiveString(0);
        System.out.println(isNegative(0));
        welcomeName("Петя");
        leapYear(1200);
    }

    private static float calculate(float a, float b, float c, float d) {
        float answer = a*(b+(c/d));
        return answer;
    }

    public static boolean isInRang(int firstNum, int secondNum) {
        int sum = firstNum + secondNum;
        if (sum > 10 && sum <= 20) {
            return true;
        }
        return false;
    }

    public static boolean isNegative(int input) {
        if (input >= 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void isPositiveString(int input) {
        if (input >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static void welcomeName(String userName) {
        System.out.println("Привет " + userName);
    }

    public static void leapYear(int year) {
        if (year % 100 == 0 && year % 400 != 0){
            System.out.println("Это не високосный год");
        } else if (year % 4 == 0){
            System.out.println("Это високосный год");
        } else {
            System.out.println("Это не високосный год");
        }
    }
}
