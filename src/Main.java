import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    /**
     * Задача 1:
     * Сортировка пузырьком
     * C генерацией случайных чисел
     */
    private static void task1() {
        System.out.println("Сортировка пузырьком:");
        Random newRandom = new Random();
        int[] array = new int[10];
        for (int r = 0; r < 10; r++) {
            array[r] = newRandom.nextInt(100) - 10;
        }
        for (int j = 0; j < array.length - 1; j++) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int b = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = b;
                }
            }
        }
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
        System.out.println(Arrays.toString(array));
    }
}