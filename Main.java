import java.util.Hashtable;

class Main {
  public static void main(String[] args) {
    // Use the instructions in Blackboard or instructions.md to complete Lab 6
    Hashtable<String, Integer> creditHours = new Hashtable<>(9);
    creditHours.put("IT-1025", 3);
    creditHours.put("IT-1050", 3);
    creditHours.put("IT-1150", 3);
    creditHours.put("IT-2310", 3);
    creditHours.put("IT-2320", 4);
    creditHours.put("IT-2351", 4);
    creditHours.put("IT-2650", 4);
    creditHours.put("IT-2660", 4);
    creditHours.put("IT-2030", 4);

    System.out.println(creditHours.containsKey("IT-1025"));
     System.out.println(creditHours.containsKey("IT-2110")); 

    for(String key : creditHours.keySet())
    {
      System.out.println(creditHours.getKey() + " " + creditHours.getValue());
    }
    
  }
}