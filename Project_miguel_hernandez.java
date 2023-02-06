import java.util.Scanner;

public class Project_miguel_hernandez 
{
   public static void main(String[] args)
   {
      //Varibale that will hold input from user
      int number,
          age ;
      double height , 
             weight ;
      String provider_Name , 
             firstName ,
             lastName ,
             status  ;
      
      // Create an object that reads input 
       Scanner keyboard = new Scanner(System.in) ;
       
       System.out.print("Please enter the Policy Number: ");
         number =keyboard.nextInt();
          keyboard.nextLine(); // Buffer before nextLine
       System.out.print("Please enter the Provider Name: ");
        provider_Name = keyboard.nextLine();
       System.out.print("Please enter the Policyholder's First Name: ");
        firstName = keyboard.nextLine();
       System.out.print("Please enter the Policyholder's Last Name: ");
         lastName = keyboard.nextLine();
       System.out.print("Please enter the Policyholder's Age: ");
         age = keyboard.nextInt(); 
          keyboard.nextLine(); //buffer before nextLine
       System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
         status =keyboard.nextLine();
       System.out.print("Please enter the Policyholder's Height (in inches): ");
         height = keyboard.nextDouble();
       System.out.print("Please enter the Policyholder's Weight (in pounds): ");
         weight = keyboard.nextDouble();
      
      // Creating object that use input for policy class  
      Policy demo = new Policy(number, provider_Name , firstName , lastName, age , height , weight , status );
      
      //Display data 
      System.out.println();
      System.out.println();
      System.out.println();
      
      System.out.println("Policy Number: " + demo.getNumber());
      System.out.println("Provider Name: " + demo.getProviderName());
      System.out.println("Policyholder's First Name: " + demo.getFirstName());
      System.out.println("Policyholder's Last Name: " + demo.getLastName());
      System.out.println("Policyholder's Age: "+  demo.getAge());
      System.out.println("Policyholder's Smoking Status: " + demo.getStatus());
      System.out.println("Policyholder's Height: " + demo.getHeight() + " inches");
      System.out.println("Policyholder's Weight: " + demo.getWeight() + " pounds");
      System.out.printf("Policyholder's BMI: %.2f", demo.BMI());
      System.out.println();
      System.out.printf("Policy Price: $%.2f", demo.Price());
        
   }
}