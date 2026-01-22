/**
 * Trying nested-if and switch-case statements.
 */
public class PrintNumberInWord {   // Save as "PrintNumberInWord.java"
   public static void main(String[] args) {
      int number = 5;  // Set the value of "number" here!
 
      // Using nested-if
      if (number == 1) {   // Use == for comparison
         System.out.println( "ONE" );
      } else if ( number == 2 ) {
         System.out.println( "TWO" );
      } else if (number == 9 ) {
         System.out.println( "NINE" ); 
      } else {
         System.out.println( "Autre car flemme" ); 
      }
 
      // Using switch-case-default
      switch(number) {
         case 1: 
            System.out.println( "One" ); break;  // Don't forget the "break" after each case!
         case 2: 
            System.out.println( "Two" ); break;
         default: System.out.println( "Flemme" ); 
      }
   }
}
