package Lesson_4;
import java.util.Arrays;

public class qsort 
{
    public static void main(String[] args) 
    {
        int[] x = {0,40,-34,56,2,1,-2,7};
        System.out.println(Arrays.toString(x));

        int low = 0;
        int high = x.length - 1;

        quickSort(x, low, high);
        System.out.println(Arrays.toString(x));
    }
    public static void quickSort(int[] array, int low, int high) 
    {
        if (array.length == 0)
            return;

        if (low >= high)
            return;

        int middle = low + (high - low) / 2;
        int middleel = array[middle];

        
        int i = low, j = high;
        while (i <= j) {
            while (array[i] < middleel) {
                i++;
            }

            while (array[j] > middleel) {
                j--;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
    }

        if (low < j)
        quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);
    }
    
}

