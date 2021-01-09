package HomeWork2;

import java.util.Arrays;

public class HomeWork2 {
    public static void main (String [] args){
        int [] array1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        System.out.println("Массив с заменой 0 на 1, 1 на 0 " + Arrays.toString(replaceNull(array1)));
        int [] array2 = new int[8];
        System.out.println("Заполненый массив " + Arrays.toString(insert1(array2)));
        System.out.println("Заполненый массив " + Arrays.toString(insert2(array2)));
        int [] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Массив после умножения на 2, чисел < 6 " + Arrays.toString(multiplication(array3)));
        int [] array4 = {5, 6, 1, 100, 5, 10};
        System.out.println("min = " + min(array4));
        System.out.println("max = " + max(array4));

        int[][] square = new int [5][5];
        printArray(diagonals(square));

        int [] balance1 = {1, 1, 1, 2, 1};
        int [] balance2 = {2, 1, 1, 2, 1};
        int [] balance3 = {10, 1, 2, 3, 4};
        System.out.println(checkBalance(balance1));
        System.out.println(checkBalance(balance2));
        System.out.println(checkBalance(balance3));

        int [] shift1 = {1, 2, 3, 4, 5};
        int n1 = -12;
        System.out.println(Arrays.toString(shift(shift1, n1)));
        System.out.println(Arrays.toString(shifter(shift1, n1)));

    }

//  1.Метод, заменяющий в  принятом массиве 0 на 1, 1 на 0;
    public static int [] replaceNull (int[] array){
        for (int i = 0; i < array.length; i++){
            switch(array[i]) {
                case 0:
                    array[i] = 1;
                    break;
                case 1:
                    array[i] = 0;
                    break;
            }
        }
        return array;
    }

// 2. Задать пустой целочисленный массив размером 8.
// Написать метод, который c помощью цикла заполнит его значениями 1 4 7 10 13 16 19 22
    public static int [] insert1 (int [] array){
        for (int i = 0; i < array.length; i++){
            array[i] = 1 + i * 3;
        }
        return array;
    }

    public static int [] insert2 (int [] array){
        int i = 0;
        while( i < array.length){
            array[i] = 1 + i * 3;
            i++;
        }
        return array;
    }


// 3. Метод, принимающий на вход массив и умножающий числа меньше 6 на 2
    public static int [] multiplication (int [] array){
        for (int i = 0; i < array.length; i++){
            if (array [i] < 6) {
                array[i] *= 2;
            }
        }
        return array;
    }

//4 Задать одномерный массив. Написать методы поиска в нём минимального и максимального элемента
   public static int max (int[] array){
        int max = array [0];
        for (int num : array) {
            if (num > max) {
              max = num;
            }
        }
        return max;
   }

   public static int min (int [] array){
       int min = array [0];
       for (int num : array) {
           if (num < min) {
               min = num;
           }
       }
       return min;
   }

//5 * Создать квадратный целочисленный массив (количество строк и столбцов одинаковое),
// заполнить его диагональные элементы единицами, используя цикл(ы)
    public static int[][] diagonals (int [][] array){
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                if ((i == j) || (i + j == array.length - 1)){
                    array [i][j] = 1;
                }
            }
        }
        return array;
    }

    public static void printArray (int[][] array) {
        for (int[] num : array) {
            for (int j = 0; j < num.length; j++) {
                System.out.print(num[j] + "  ");
            }
            System.out.println();
        }
    }
//6 ** Написать метод, в который передается не пустой одномерный целочисленный массив,
// метод должен вернуть true если в массиве есть место, в котором сумма левой и правой части массива равны.
    public static boolean checkBalance (int [] array){
        int sum1 = 0;
        int sum2;
        int i = 0;
        do {
            sum2 = 0;
            sum1 += array[i];
            for (int j = array.length - 1; j > i; j--) {
                    sum2 += array[j];
            }
            i++;
        } while (sum1 != sum2 && i< array.length );
        return (sum1 == sum2);
    }
//   Написать метод, которому на вход подаётся одномерный массив и число n (может быть положительным, или отрицательным),
//   при этом метод должен циклически сместить все элементы массива на n позиций.
    public static int [] shift (int [] array, int n) {
        int lengthArray = array.length;
        n %= lengthArray;
        int [] arrayNew = new int [lengthArray];
        if (n >= 0){
            for(int i = 0; i < array.length; i ++) {
                if ( i + n < lengthArray) {
                    arrayNew[i + n] = array[i];
                } else if ( i + n >= lengthArray) {
                    arrayNew[i - array.length + n] = array[i];
                 }
            }
        } else
            for(int j = array.length - 1; j >= 0; j --) {
                if ( j + n >= 0) {
                    arrayNew[j + n] = array[j];
                } else if ( j + n < 0) {
                    arrayNew[j + array.length + n] = array[j];
            }
        }
        return arrayNew;
    }

    //без вспомогательного массива
    private static int[] shifter(int[] array, int n) {
        boolean direction;
        if (n < 0) {
            direction = true;
            n = -n;
        } else {
            direction = false;
        }
        n %= array.length;
        int lastIndex = array.length - 1;
        for (int i = 0; i < n; i++) {
            int temp = (direction) ? array[0] : array[lastIndex];
            for (int j = 0; j < lastIndex; j++) {
                if (direction)
                    array[j] = array[j + 1];
                else
                    array[lastIndex - j] = array[lastIndex - j - 1];
            }
            if (direction)
                array[lastIndex] = temp;
            else
                array[0] = temp;
        }
        return array;
    }

}



