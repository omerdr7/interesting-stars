package interesting.stars;

import java.util.Scanner;

public class InterestingStars {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("give a value for height");
        int height = input.nextInt();
        System.out.println("give a value for width");
        int width = input.nextInt();
        char m = '|';
        for (int i = 0; i <= height; i++) {

            System.out.print("|");

            for (int j = 0; j < width - i; j++) {
                System.out.print(" ");
            }
            for (int l = 0; l < 1; l++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = height; i > 0; i--) {
            System.out.print(m);
            for (int j = 1; j < width - i + 2; j++) {
                System.out.print(" ");
            }
            for (int l = 0; l < 1; l++) {
                System.out.print("*");
            }
            System.out.println();

        }
        for (int i = 0; i <= height; i++) {

            System.out.print("|");

            for (int j = 0; j < width - i; j++) {
                System.out.print(" ");
            }
            for (int l = 0; l < 1; l++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }

}
