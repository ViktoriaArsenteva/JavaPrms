//Реализовать алгоритм сортировки вставками

import java.util.Scanner;

public class Task_2 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int array[] = new int[10];
        System.out.println("Введите 10 чисел через клавишу ENTER:");
        for (int i = 0; i<10 ; i++) {
            array[i] = input.nextInt();
        }
        InsertionSort(array);

        
    }

    public static void InsertionSort(int array[]) {
        for (int j = 0; j < array.length; j++) {
            int n = array[j];
            int i = j - 1;
            for (; i >= 0; i--) {
                   if (n < array[i]) {
                    array[i + 1] = array[i];
                } else {
                    break;
                }
            }
            array[i + 1] = n;
                    
        }

        for(int k = 0; k < array.length; k++){
            System.out.print(array[k] + " ");
        }
        
    }
}
