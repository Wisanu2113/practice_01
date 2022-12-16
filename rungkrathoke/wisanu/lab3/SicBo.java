package rungkrathoke.wisanu.lab3;

import java.util.Scanner;

/**
 * lab3
 */
public class SicBo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(
                "Choose hoe do you want to bet: \nType 1 for choosing high or loe numbers. \nType 2 for choosing number between 1-6. ");
        System.out.print("Enter your choice: ");
        String inputType = sc.next(); // nextLine() เอาทั้งบรรทัด ส่วน next() ถ้ามีวรรค จะตัดคำ
        int MAX = 6, MIN = 1;
        int value_random = MAX - MIN + 1;
        int dice_1 = (int) (Math.random() * value_random) + 1;
        int dice_2 = (int) (Math.random() * value_random) + 1;
        int dice_3 = (int) (Math.random() * value_random) + 1;
        int sum = dice_1 + dice_2 + dice_3;

        if (inputType.equals("1")) {
            System.out.print("Typr in h for high and l for low:");
            String input_lowAndHigh = sc.next();
            System.out.println("Dice 1 : " + dice_1 + ", Dice 2 : " + dice_2 + ", Dice 2 : " + dice_3);
            System.out.println("Total is " + sum);
            if ((input_lowAndHigh.equalsIgnoreCase("h")) || (input_lowAndHigh.equalsIgnoreCase("l"))) {
                if (input_lowAndHigh.equalsIgnoreCase("h") & (sum >= 11)) {
                    System.out.println("You win 20 Bahts ");
                } else if (input_lowAndHigh.equalsIgnoreCase("l") & (sum <= 10)) {
                    System.out.println("You win 20 Bahts ");
                } else {
                    System.out.println("You loose 10 Bahts ");
                }
            } else {
                System.out.println("Incorrect input. Enter h for high and l for low only. ");
            }

        } else if (inputType.equals("2")) {
            System.out.print("Typr in a number to bet on (1-6): ");
            int input_number = sc.nextInt();
            System.out.println("Dice 1 : " + dice_1 + ", Dice 2 : " + dice_2 + ", Dice 2 : " + dice_3);
            if (input_number <= 6) {
                if ((input_number == dice_1) & (input_number == dice_2) & (input_number == dice_3)) {
                    System.out.println("You win 90 Bahts ");
                }else if ( ((input_number == dice_1) & (input_number == dice_2)) & ((input_number == dice_1)
                        & (input_number == dice_3)) & ((input_number == dice_2) & (input_number == dice_3))) {
                    System.out.println("You win 60 Bahts ");  

                } else if (input_number != dice_1 & input_number != dice_2 & input_number != dice_3) {
                    System.out.println("You win loose 10 Bahts ");

                } else {
                    System.out.println("You win  30 Bahts ");
                }
               
            } else {
                System.out.println("Incorrect input. Enter a number between 1-6 only.");
                
            }
        }else {
            System.out.println("Incorrect input. Enter 1 or 2 only.");
        }

    }
}