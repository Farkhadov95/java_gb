public class Main {
    public static void main(String[] args) {
        String[][] myArray1 = new String[4][4];

        try {
            myArray1[0][0] = "1";
            myArray1[0][1] = "1";
            myArray1[0][2] = "1";
            myArray1[0][3] = "1";

            myArray1[1][0] = "2";
            myArray1[1][1] = "2";
            myArray1[1][2] = "2";
            myArray1[1][3] = "2";

            myArray1[2][0] = "3";
            myArray1[2][1] = "3";
            myArray1[2][2] = "3";
            myArray1[2][3] = "3";

            myArray1[3][0] = "4";
            myArray1[3][1] = "4";
            myArray1[3][2] = "4";
            myArray1[3][3] = "4";

            checkSize(myArray1);

        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }
    }

    // Проверка размера
    public static void checkSize(String[][] array) throws MyArraySizeException, MyArrayDataException {
        int matrixSize = 4;
        for (int i = 0; i < array.length; i++) {
            if (array.length != matrixSize || array[i].length != matrixSize) {
                throw new MyArraySizeException("Размер не 4х4");
            }
        }
        parseToInt(array);
    }



    // парсим каждый символ в число
    public static void parseToInt(String[][] array) throws MyArrayDataException {
        try {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    int integer = Integer.parseInt(array[i][j]);
                    System.out.println(integer);
                }
            }
        } catch (NumberFormatException e) {
            throw new MyArrayDataException("Это не число");
        }


    }
}
