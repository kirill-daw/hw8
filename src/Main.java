import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Task 1: ");

        System.out.println("1 array: ");
        byte array1[] = new byte[3];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;
        byte i = 0;
        while (i < array1.length) {
            if (i == array1.length - 1) {
                System.out.print(array1[i]);
            } else {
                System.out.print(array1[i] + ", ");
            }
            i++;
        }
        System.out.println();
        System.out.println("2 array: ");
        float array2[] = {1.57f, 7.654f, 9.986f};
        i = 0;
        while (i < array2.length) {
            if (i == array2.length - 1) {
                System.out.print(array2[i]);
            } else {
                System.out.print(array2[i] + ", ");
            }
            i++;
        }
        System.out.println();
        System.out.println("3 array: ");
        int array3[] = new int[7];
        i = 0;
        while (i < array3.length) {
            array3[i] += i * 5;
            i++;
        }
        System.out.println(Arrays.toString(array3));

        System.out.println("Task 2: ");
        for (int i1 = 0; i1 < array1.length; i1++) {
            if (i1 == array1.length - 1) {
                System.out.print(array1[i1]);
            } else {
                System.out.print(array1[i1] + ", ");
            }
        }
        System.out.println();
        for (int i2 = 0; i2 < array2.length; i2++) {
            if (i2 == array2.length - 1) {
                System.out.print(array2[i2]);
            } else {
                System.out.print(array2[i2] + ", ");
            }
        }
        System.out.println();
        for (int i3 = 0; i3 < array3.length; i3++) {
            if (i3 == array3.length - 1) {
                System.out.print(array3[i3]);
            } else {
                System.out.print(array3[i3] + ", ");
            }
        }
        System.out.println();

        System.out.println("Task 3: ");
        for (int i1 = array1.length - 1; i1 >= 0; i1--) {
            if (i1 == 0) {
                System.out.print(array1[i1]);
            } else {
                System.out.print(array1[i1] + ", ");
            }
        }
        System.out.println();
        for (int i2 = array2.length - 1; i2 >= 0; i2--) {
            if (i2 == 0) {
                System.out.print(array2[i2]);
            } else {
                System.out.print(array2[i2] + ", ");
            }
        }
        System.out.println();
        for (int i3 = array3.length - 1; i3 >= 0; i3--) {
            if (i3 == 0) {
                System.out.print(array3[i3]);
            } else {
                System.out.print(array3[i3] + ", ");
            }
        }
        System.out.println();

        System.out.println("Task 4: ");
        for (int i1 = 0; i1 < array1.length; i1++) {
            if (array1[i1] % 2 != 0) {
                array1[i1] += 1;
            }
        }
        System.out.println(Arrays.toString(array1));
    }
}