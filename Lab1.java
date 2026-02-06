import java.util.*;
/*
 * IT-2660 - Lab 1
 * Student Name: Jayson Walker
 */

public class Main {
  public static void main(String[] args) 
  {
    System.out.println("hello, world!");
    int num[] = {5, 9, 3, 12, 7, 3, 11, 5};
    int i = 0;
    Lab1 lab = new Lab1();
    System.out.println(lab.increment(1));
    while(i != num.length)
    {
      System.out.println(num[i]);
      i++;
    }
    for(int x = 9; x < num.length; x--)
    {
      System.out.println(num[x]);
    }
      System.out.println(num[7]);

      System.out.println(num[0]);

      System.out.println("The max is " + lab.max(5, 10));
      System.out.println("The min is " + lab.min(5, 10));
      System.out.println("The sum is " + lab.sum(num));
      System.out.println("The average is " + lab.average(num));
      System.out.println("The max of array is " + lab.max(num));
      System.out.println("The min of array is " + lab.min(num));
      
      
  }
}     

// Add all of the methods here
class Lab1 {
 int all = 0;
 int avg = 0;
 double avg2 = 0;
 int mega = 0;
 int mega2 = 0;
  public int increment(int num) {
    return ++num;
  }

 public int max(int a, int b)
  {
    if(a < b)
    {
      return b;
    }
    else
    {
      return a; 
    }

  }

 public int min(int a, int b)
  {
    if(a < b)
    {
      return a;
    }
    else
    {
      return b; 
    }
  }

  public int sum(int[] nums)
  {
  
    for(int x = 0; x < nums.length; x++)
     {
        all += nums[x];
     }
     return all;
  }

  public double average(int[] nums)
  {
     for(int y = 0; y < nums.length; y++)
     {
        avg += nums[y];
     }
     avg2 = avg;
     avg2 /= 2;
     return avg2;
  }
  
  public int max(int[] nums)
  {
    for(int f = 1; f < nums.length; f++)
     {
      for(int e = 2; e < nums.length; e++)
     {
      mega = nums[f];   
      mega2 = nums[e];
      if(mega < mega2)
      {
        break;
      }
    }
     if(mega < mega2)
      {
        break;
      }
     }
     return mega2;
  }

  public int min(int[] nums)
  {
   for(int f = 0; f < nums.length; f++)
     { 
      for(int e = 1; e < nums.length; e++)
     {
      mega = nums[f];   
      mega2 = nums[e];
      if(mega > mega2)
      {
        break;
      }
    }
    if(mega > mega2)
      {
        break;
      }
     }
     return mega2;
  }
}
