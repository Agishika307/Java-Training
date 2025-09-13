import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] number = new int[5];
        int[] score = new int[5];
        int[] marks = new int[5];
        System.out.println("Enter 5 values for the 'number' array:");
        for (int i = 0; i < number.length; i++) {
            number[i] = scanner.nextInt();
        }

        System.out.println("Enter 5 values for the 'score' array:");
        for (int i = 0; i < score.length; i++) {
            score[i] = scanner.nextInt();
        }

        System.out.println("Enter 5 values for the 'marks' array:");
        for (int i = 0; i < marks.length; i++) {
            marks[i] = scanner.nextInt();
        }
        System.out.println("Values in the 'number' array:");
        for (int num : number) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Values in the 'score' array:");
        for (int sc : score) {
            System.out.print(sc + " ");
        }
        System.out.println();
        System.out.println("Values in the 'marks' array:");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println();

        scanner.close();
    }
}