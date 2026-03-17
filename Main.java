import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
  
   
  public static void main(String[] args) {
      System.out.println("Unsorted Array ---------------------------------------------------");
      ArrayList<Integer> integerList = Lab4.getList();
      Lab4.outputList(integerList);
      System.out.println("\n\nBubble sort results ----------------------------------------------");
      ArrayList<Integer> bubbleSortedList = Lab4.bubbleSort(integerList);
      Lab4.outputList(bubbleSortedList);

      System.out.println("\n\nInsertion sort results -------------------------------------------");
      ArrayList<Integer> insertionSortedList = Lab4.insertionSort(integerList);  
      Lab4.outputList(insertionSortedList);
      
    }
}

class Lab4 {

  public static ArrayList<Integer> insertionSort(ArrayList<Integer> integerList) 
  
  {
long startTime = System.nanoTime();
    for(int o = 1; o < integerList.size(); o++)
{
  int currentElement = integerList.get(o);
  int f;
  for(f = o - 1; f >= 0 && integerList.get(f) > currentElement; f--)
{
   integerList.set(f + 1, f);
   integerList.set(f, currentElement);
}
}
   long endTime = System.nanoTime();
long elapsedTime = endTime - startTime;
  System.out.println(elapsedTime);
return integerList;
  }

  public static ArrayList<Integer> bubbleSort(ArrayList<Integer> integerList) 
  {
    // Step 2 - Implement the bubble sort algorithm here
long startTime = System.nanoTime();
    boolean nextPass = true;
for(int i = 1; i < integerList.size() && nextPass; i++)
  {
nextPass = false;
for(int j = 0; j < integerList.size() - i; j++){
  if(integerList.get(j) > integerList.get(j + 1))
  {
    int temp = integerList.get(j);
    integerList.set(j, j + 1);
    integerList.set(j + 1, temp);
    nextPass = true;
  }
}
}
long endTime = System.nanoTime();
long elapsedTime = endTime - startTime;
  System.out.println(elapsedTime);
 return integerList;
  }
  public static ArrayList<Integer> getList() {
    ArrayList<Integer> integerList = new ArrayList<>();
    String line;
    try (BufferedReader br = new BufferedReader(new FileReader("integers.txt"))) {
        while ((line = br.readLine()) != null) {
            integerList.add(Integer.parseInt(line));
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    return integerList;
  }

  public static void outputList(ArrayList<Integer> integerList) {
    for (int i = 0; i < integerList.size(); i++) {
        System.out.print(integerList.get(i) + " ");
    }
  }
}