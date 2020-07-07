package P01_Simple_Chatty_Bot;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1 = -5;
        double num2 = 12;
//        double num1 = scanner.nextInt();
//        double num2 = scanner.nextInt();
        double count = 0;
        double sum = 0;
        double ave = 0;

        for (double i = num1; i <= num2; i++) {

            if (i % 3 == 0) {
                count++;
                sum += i;
                ave = sum / count;
            }
        }
        System.out.println(count);
        System.out.println(sum);
        System.out.println(ave);

    }
}
/*
===============================
Write a program that reads two numbers aa and bb from the keyboard and calculates and outputs to the console the arithmetic average of all numbers from the interval [a; b][a;b], which are divisible by 33.

In the example below, the arithmetic average is calculated for the numbers on the interval [-5; 12][−5;12]. Total numbers divisible by 33 on this interval 66: -3, 0, 3, 6, 9, 12−3,0,3,6,9,12. Their arithmetic average equals to 4.54.5

The program input contains intervals, which always contain at least one number, which is divisible by 33.

Remember that int type cannot contain fractions. Use double variable to store the precise result of the division.

Sample Input 1:

-5
12
Sample Output 1:

4.5
===============================
 */