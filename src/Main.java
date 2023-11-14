import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        task1_1();
        task1_2();
        task2();
        task3();
    }

    /**
     * Задача 1_1:
     * Сортировка пузырьком
     * C генерацией случайных чисел
     */
    private static void task1_1() {
        System.out.println("Сортировка пузырьком 1_1:");
        Random newRandom = new Random();
        int[] array = new int[10];
        for (int r = 0; r < 10; r++) {
            array[r] = newRandom.nextInt(100) - 10;
        }
        for (int a : array) {
            System.out.print(a + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(array) + "\n");

        for (int j = 0; j < array.length - 1; j++) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int b = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = b;
                }
            }
        }
        for (int a : array) {
            System.out.print(a + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(array) + "\n");
    }

    /**
     * Задача 1_2:
     * Сортировка пузырьком (Bubble Sort)
     * C генерацией случайных чисел
     */
    private static void task1_2() {
        System.out.println("Сортировка пузырьком 1_2:");
        Random random = new Random();
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) - 2;

        }
        for (int a : array) {
            System.out.print(a + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(array) + "\n");

        boolean whileForRunning = true;
        int countOfFor = 0;
        while (whileForRunning) {
            whileForRunning = false;
            for (int i = 0; i < array.length - 1 - countOfFor; i++) {
                if (array[i] > array[i + 1]) {
                    int z = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = z;
                    whileForRunning = true;
                }
            }
            countOfFor++;
        }
        for (int a : array) {
            System.out.print(a + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(array) + "\n");
    }

    /**
     * Задача 2:
     * Шейкерная сортировка
     * C генерацией случайных чисел
     */
    private static void task2() {
        System.out.println("Шейкерная сортировка:");
        Random newRandom = new Random();
        int[] array = new int[10];
        for (int r = 0; r < 10; r++) {
            array[r] = newRandom.nextInt(100) - 10;
        }
        for (int a : array) {
            System.out.print(a + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(array) + "\n");

        for (int j = 0; j < array.length; j++) {

            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int a = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = a;
                }
            }
            for (int f = array.length - 1; f >= 0; f--) {
                if (f >= 1 && array[f] > array[f - 1]) {
                    int b = array[f];
                    array[f] = array[f - 1];
                    array[f] = b;
                }
            }

        }
        for (int a : array) {
            System.out.print(a + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(array) + "\n");
    }

    /**
     * Задача 3:
     * Сортировка расчёской
     * C генерацией случайных чисел
     */
    private static void task3() {
        Random newRandom = new Random();
        System.out.println("Сортировка расчёской:");
        int[] array = new int[10];
        for (int r = 0; r < 10; r++) {
            array[r] = newRandom.nextInt(100) - 10;
        }
        for (int a : array) {
            System.out.print(a + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(array) + "\n");

        final double factor = 1.247;
        double step = array.length - 1;

        while (step >= 1) {
            for (int i = 0; i + step < array.length; ++i) {
                int curStep = (int) (i + step);
                if (array[i] > array[curStep]) {
                    int temp = array[i];
                    array[i] = array[curStep];
                    array[curStep] = temp;
                }
            }
            step /= factor;
        }
        for (int a : array) {
            System.out.print(a + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(array));
    }
}
