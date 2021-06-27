import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        final int SIZE = 10_000_000;
        final int HALF = SIZE / 2;
        float[] arr = new float[SIZE];
        fillArray(arr);

        float[] partOne = new float[HALF];
        float[] partTwo = new float[HALF];
        float[] arrFromParts = new float[SIZE];

        // Основной поток
        long a = System.currentTimeMillis();
        giveValue(arr);
        System.out.println("Основной поток " + (System.currentTimeMillis() - a));


        // Разделение массива
        System.arraycopy(arr, 0, partOne, 0, HALF);
        System.arraycopy(arr, HALF, partTwo, 0, HALF);

        // Второй и Третий поток
//        long b = System.currentTimeMillis();
//        Thread t1 = new Thread(new Another.MyRunnableClass(partOne));
//        Thread t2 = new Thread(new Another.MyRunnableClass(partTwo));
//        t1.start();
//        t2.start();
//        System.out.println("Другой поток " + (System.currentTimeMillis() - b));


        // Пул потоков
        long b = System.currentTimeMillis();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(new Runnable() {
            @Override
            public void run() {giveValue(partOne);}
        });
        executorService.submit(new Runnable() {
            @Override
            public void run() {giveValue(partTwo);}
        });


        // Склеивание массивов
        System.arraycopy(partOne, 0, arrFromParts, 0, HALF);
        System.arraycopy(partTwo, 0, arrFromParts, HALF, HALF);

        System.out.println("Поток 2 и 3 " + (System.currentTimeMillis() - b));

        // Печать массивов
//        System.out.println(Arrays.toString(partOne));
//        System.out.println(Arrays.toString(partTwo));
//        System.out.println(Arrays.toString(arrFromParts));
    }

    public static void fillArray(float[] inArr) {
        Arrays.fill(inArr, 1);
    }

    public static void giveValue(float[] inArr) {
        for (int i = 0; i < inArr.length; i++) {
            inArr[i] = (float)(inArr[i]
                    * Math.sin(0.2f + i / 5.0)
                    * Math.cos(0.2f + i / 5.0)
                    * Math.cos(0.4f + i / 2.0));
        }
    }
}
