// This program will print out statements with variables that make up a sample Customer order. 
// (Jade Park - 5/14/2021)

// Making a class
public class SampleCustomerOrder {
   public static void main(String[] args) {
      // Declaring and assigning values to variables that I'll later put in my statements
      final String companyName = "Starr";
      byte numberOfMemberships = 1;
      double membershipCost = 49.95;
      // The statements are a combination of strings and previously declared variables
      System.out.println("Thanks for purchasing " + numberOfMemberships + " Premium " + companyName + " membership(s).");
      System.out.println("Your total for this order is $" + membershipCost);
   }

}