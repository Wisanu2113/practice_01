package rungkrathoke.wisanu.lab3;

import java.util.Scanner;

public class SicBoMethods {
    static int test;

    public static void main(String[] args) {
        playgame();
        test();
        System.out.println("main () : " + test);

    }

    public static int playgame() {
        Scanner sc = new Scanner(System.in);
        test = sc.nextInt();
        System.out.println("playgame () : " + test);
        return test;
        

    }
    
    public static void test() {
        // test = 2;
        System.out.println("test : " + test);

    }

}
