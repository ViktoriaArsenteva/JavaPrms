//Написать программу вычисления n-ого треугольного числа

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        double res = findnumber();
        System.out.printf("Треугольное число для заданного элемента элемента = "+ res);   
    }
    public static double findnumber() {
        Scanner iS = new Scanner(System.in);
        System.out.print("Введите число n для вычисления n-ого треугольного числа: ");
        int num = iS.nextInt();
        double result = (num * 1/2 * (num + 1));
        return result;
        
    }
}
