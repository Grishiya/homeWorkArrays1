import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача1.");
        int[] array = new int[]{1, 2, 3};
        double[] arrayDouble = new double[]{1.57, 7.654, 9.986};
        String[] arrayString = new String[]{"Привет,", " как ", "дела?"};
        System.out.println(arrayString[0] + arrayString[1] + arrayString[2]);

    }

    public static void task2() {
        System.out.println("Задача2.");
        int[] array = new int[]{1, 2, 3};
        double[] arrayDouble = new double[]{1.57, 7.654, 9.986};
        String[] arrayString = new String[]{"Привет,", " как ", "дела?"};
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(arrayDouble));
        System.out.println(Arrays.toString(arrayString));
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] array = new int[]{1, 2, 3};
        double[] arrayDouble = new double[]{1.57, 7.654, 9.986};
        String[] arrayString = new String[]{"Привет,", " как ", "дела?"};
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = arrayDouble.length - 1; i >= 0; i--) {
            System.out.print(arrayDouble[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = arrayString.length - 1; i >= 0; i--) {
            System.out.print(arrayString[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void task4() {

    }
}