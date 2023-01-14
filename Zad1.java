import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj ilosc elementow:");
        int[] n = new int[scan.nextInt()];

        for (int i = 0; i < n.length; i++) {
            n[i] = (int)(Math.random()*(101));
        }

        printArray(n);
    }
    public static void printArray(int[] n) {
        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i]);
        }
    }
}