package lab211_10;
import java.util.Random;
import java.util.Scanner;
public class Lab211_10 {
    public static void unsortArr(int[] a) {
        System.out.println("Array: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    public static int linearSear(int[] a, int value) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == value) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int size;
        do {
            System.out.println("Enter number of array: ");
            size = sc.nextInt();
        } while (size <= 0);
        int[] a = new int[size];
        Random rand = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(100);
        }
        System.out.println("Enter a value to search: ");
        int val = sc.nextInt();
        unsortArr(a);
        int foundIndex = linearSear(a, val);
        if (foundIndex != -1) {
            System.out.println("\nFound " + val + " at index: " + foundIndex);
        } else {
            System.out.println("" + val + " no found in array.");
        }
    }
}
