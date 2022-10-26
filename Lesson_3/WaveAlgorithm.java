package Lesson_3;

import java.util.ArrayList;
import java.util.Scanner;

public class WaveAlgorithm 
{
  static int position = 0;
  static int[] storage = new int[200];

  static void clear() {
    position = 0;
    int size = storage.length;
    for (int i = 0; i < size; i++) {
      storage[i] = 0;
    }
  }

  static void print() {
    for (int i = 0; i < storage.length; i++) {
      System.out.printf(storage[i] + " ");
    }
    System.out.println();
  }

  static void shift() {
    for (int i = 0; i <= position; i++) {
      storage[i] = storage[i + 1];
    }
    storage[position] = 0;
    position--;
  }

  static void add(int item) {
    if (position >= storage.length)
      return;
    storage[position++] = item;
  }

  static int remove() {
    int el = storage[0];
    shift();
    return el;
  }

  public static void main(String[] args) 
  {
    Scanner iS = new Scanner(System.in);
    ArrayList<Integer> a = new ArrayList<>();
    System.out.println("Введите размер поля");
    System.out.print("Cтроки ");
    int row = iS.nextInt();
    System.out.print("Cтолбцы ");
    int col = iS.nextInt();
    int start[] = new int[2];
    int end[] = new int[2];
    System.out.println("Введите точку начала");
    System.out.print("Cтрока: ");
    start[0] = iS.nextInt();
    System.out.print("Cтолбец: ");
    start[1] = iS.nextInt();
    System.out.println("Введите точку выхода");
    System.out.print("Cтрока: ");
    end[0] = iS.nextInt();
    System.out.print("Cтолбец: ");
    end[1] = iS.nextInt();
    labyr(start,end, row, col);
  }
  
  public static void labyr(int start[],int end[],int row, int col) 
  {
    int laby[][] = new int[row][col]; 
    laby[start[0]][start[1]] = 1;
    int start1[]=new int []{start[0],start[1]};
    int answer[][] = new int[row][col];
    int k = 0;
  
    while (k != (row*col)-1) 
    {

      if (start[0] - 1 >= 0)
      {
        if (laby[start[0]-1][start[1]] == 0)
        {
          laby[start[0] - 1][start[1] ] = laby[start[0]][start[1]]+1;
          add(start[0]-1);
          add(start[1]);
          k=k+1;
        }
      }
      if (start[1] + 1 < col)
      {
        if (laby[start[0]][start[1] + 1] == 0)
        {
          laby[start[0]][start[1] + 1] =laby[start[0]][start[1]]+1;
          add(start[0]);
          add(start[1] + 1);
          k=k+1;
        }
      }
      if (start[0] + 1 < row) 
      {
        if (laby[start[0] + 1][start[1]] == 0)
        {
          laby[start[0] + 1][start[1]] = laby[start[0]][start[1]]+1;
          add(start[0] + 1);
          add(start[1]);
          k=k+1;
        }
      }
      if (start[1] - 1 >= 0)
      {
        if (laby[start[0]][start[1] - 1] == 0)
        {
          laby[start[0]][start[1] - 1] = laby[start[0]][start[1]]+1;
          add(start[0]);
          add(start[1] - 1);
          k=k+1;
        }
      }
      
      start[0]=remove();
      start[1]=remove();
    }
      
      clear();
      answer[end[0]][end[1]] = laby[end[0]][end[1]];
      int laby2[][] = new int[row+2][col+2];
      for (int i = 1; i < row+1; i++) 
      {  
        for (int j = 1; j < col+1 ; j++) 
        {
            laby2[i][j]=laby[i-1][j-1];
        }
      }
      
    while(answer[start1[0]][start1[1]]== 0)
    {
      if ((end[0] - 1 >= 0) & (laby2[end[0]+1][end[1]+1]-laby2[end[0]][end[1]+1] == 1))
      {
          answer[end[0] - 1][end[1] ] = laby[end[0] - 1][end[1]];
          add(end[0]-1);
          add(end[1]);
      }
      else if ((end[1] + 1 < col) & (laby2[end[0]+1][end[1]+1]-laby2[end[0]+1][end[1]+1] == 1))
      {
          answer[end[0]][end[1] + 1] = laby[end[0]][end[1] + 1];
          add(end[0]);
          add(end[1] + 1);
      }
      else if ((end[0] + 1 < row) & (laby2[end[0]+1][end[1]+1]-laby2[end[0]+1][end[1]+1] == 1))
      {
          answer[end[0] + 1][end[1]] = laby[end[0] + 1][end[1]];
          add(end[0] + 1);
          add(end[1]);
      }
      else if ((end[1] - 1 >= 0) & (laby2[end[0]+1][end[1]+1]-laby2[end[0]+1][end[1]] == 1))
      {
          answer[end[0]][end[1] - 1] = laby[end[0]][end[1] - 1];
          add(end[0]);
          add(end[1] - 1);
      }
      end[0]=remove();
      end[1]=remove();
    } 
    
      
      for (int i = 0; i < row; i++) 
      {  
        for (int j = 0; j < col ; j++) 
        {
            System.out.print(" " + answer[i][j] + " "); 
        }
        System.out.println();
      }
      System.out.println();
    }
   
    
  
  
}