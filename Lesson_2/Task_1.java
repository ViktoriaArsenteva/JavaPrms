package Lesson_2;
//Написать программу, показывающую последовательность действий для игры “Ханойская башня”

import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите количество дисков: ");
        int n = input.nextInt();
        char a = 'A';
        char b = 'B';
        char c = 'C';
        
        hanoi(n, a, b, c);
    }

    public static void hanoi(int n, char a, char b, char c) {
        if (n == 1) {
            print(1, a, c);
        } else {
            hanoi(n - 1, a, c, b);
            print(n, a, c);
            hanoi(n - 1, b, a, c);
        }
    }

    public static void print(int n, char i, char j) {
        System.out.println(i + " -> " + j);
    }
}
