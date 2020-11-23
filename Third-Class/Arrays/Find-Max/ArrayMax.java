public class ArrayMax {

   public static void main(String[] args) {
      double[] myList = {1.9, 2.9, 3.5, 3.4};
      // Finding the largest element
      double max = myList[0];
      for (int i = 1; i < myList.length; i++) {
         if (myList[i] > max) max = myList[i];
      }
      System.out.println("Max is " + max);  
   }
}