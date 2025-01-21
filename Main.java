public class Main {

   public static void main(String []args) {
      System.out.println("Hello World");

      // ARRAY (list) is a data sctructure (collection)
      // stores multiple values in one named variable

      // DECLARE arrays using square brackets
      // one array can hold items of one data type

      int[] luckyNumbers;
      double[] mileTimes;
      boolean[] trueOrFalse;
      // Arrays can also store objects (reference types)
      String[] spiritAnimals;

      
      // Two options to CREATE the array in memory
      // 1. Use the keyword new to set up an array
      // Need to tell java how many spaces to allocate
      luckyNumbers = new int[6]; // already delcared earlier
      int[] moreLuckyNumbers = new int[8]; //declare + create in one line
      double[] movieRatings = new double[10];
      String[] faveAnimals = new String[8];
      System.out.println(moreLuckyNumbers);

      // INITIALIZER LIST
      int[] luckiestNumbers = {13,13,10,9,5,20,37,7};
      double[] currentCash = {1.0 , 5.25, 15.0, 21.0};
      String[] bestClass = { "Maia", "Alex","Zoie", "Paige", "Natalie", "Bryce", "Finny", "Jackson"};
      
      //How to access array elements
      // arrayname[index] --> gets item at that position
      System.out.println(luckiestNumbers[5]);
      System.out.println(bestClass[5]);

      // HOW TO MODIFY AN ARRAY ELEMENT
      // arrayName[index] = newValue
      faveAnimals[0] = "dolphin";
      faveAnimals[1] = "dog";





   }
}
