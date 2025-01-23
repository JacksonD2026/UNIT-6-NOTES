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

      
      //How to access array elements
      // arrayname[index] --> gets item at that position
      System.out.println(luckiestNumbers[0]);
      System.out.println(currentCash[3]);

      // HOW TO MODIFY AN ARRAY ELEMENT
      // arrayName[index] = newValue
      faveAnimals[0] = "dolphin";
      faveAnimals[1] = "dog";
      // NOTE that the other 6 indies hold NULL
      System.out.println(faveAnimals[2]);

      String[] bestClass = { "Maia", "Alex","Zoie", "Paige", "Natalie", "Bryce", "Finny", "Jackson"};
     // LENGTH IS AN ARRAY ATTRIBUTE/PROPERTY
     int numStudents = bestClass.length;
     System.out.println(numStudents); // 8
     int lastStudentIndex = bestClass.length - 1;
     System.out.println(bestClass[lastStudentIndex]);

     // Parallel array to hold info associated with another array
     String[] faveFoods = {"Pasta", "", "Sushi", "Ceaser Salad" , "Sushi" , "Burritos" , "I don't know" , "Lasagna"};

     //with parallel arrays, order matters; so we can use the same index for multiple liss

    

 System.out.println( bestClass[lastStudentIndex] + "'s favorite food is " + faveFoods[faveFoods.length - 1] );


 // STANDARD FOR-LOOP TO TRAVERSE ARRAYS
 // Example: start at first index, stop at final index, CHANGE by 1
// WATCH out for bounds with the stop condition
// Can use i < array.length or i<= (array.length);
 for(int i = 0; i < bestClass.length; i++) {
   System.out.println(bestClass[i] + "'s favorite food is " + faveFoods[i]);
 }

 // with standard for loops, you have flexibility over the order and way you traverse through the array
 // Start at final index, stop at first index

 int[] countdown = {1,2,3,4,5,6,7,8,9,10};
 for (int i = countdown.length - 1; i >= 0; i-=2) {
 System.out.println(countdown[i]);

 if (i == 0) {
  System.out.println("Happy new year!");
}

 }


   }
}
