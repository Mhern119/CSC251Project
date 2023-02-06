/**
   Create a Policy class that will model an insurance policy for one person.  

*/
public class Policy
{
  //Fields
  private int number; // Policy Number
  private int age; // Provider age
  private double height_inInches; // Policyholder’s height
  private double weight_inPounds; // Policyholder’s weight 
  private String providerName; //Provider's Name
  private String firstName; //Policyholder’s first Name
  private String lastName; //Policyholder’s Last Name
  private String status; // Policyholder’s Smoking status 
  
  //Include a no-arg constructor (set default values for all fields).
  public Policy()
   {
     number = 0;
     providerName = "Empty";
     firstName = "Empty";
     lastName = "Empty";
     age = 0;
     height_inInches = 0.0;
     weight_inPounds = 0.0;
     status = "Empty";  
   }
  //Include a constructor that accepts arguments 
  public Policy (int num, String n, String fn ,String ln , int a , double h , double w , String stat )
   {
      number = num ;
      providerName = n ;
      firstName = fn ;
      lastName  = ln ;
      age  = a ;
      height_inInches  = h ;
      weight_inPounds  = w ;
      status  = stat ;  
   }
  //Include appropriate set & get Methods for each fields
  public void setNumber(int num) // Number
      {
      number = num ;
      }
  
  public int getNumber()
      {
      return number;
      }
   
   public void setProviderName(String n)  // Provider Name
      {
      providerName  = n ;
      }
  
  public String getProviderName()
      {
      return providerName;
      }
      
  public void setFirstName(String fn)  // First Name
      {
         firstName = fn ;
      }
  
  public String getFirstName()
      {
      return firstName;
      }   
      
  public void setLastName(String ln)  // last Name
      {
         lastName = ln ;
      }
  
  public String getLastName()
      {
         return lastName;
      } 
      
  public void setAge(int a)  // Age
      {
         age  = a ;
      }
  
  public int getAge()
      {
         return age;
      } 
 public void setHeight(double h)  // Height
      {
       height_inInches  = h ;  
      }
  
  public double getHeight()
      {
      return height_inInches;
      } 
 public void setWeight(double w)  // Weight
      {
        weight_inPounds  = w ; 
      }
  
  public double getWeight()
      {
      return weight_inPounds;
      } 
      
 public void setStatus(String stat)  // Status 
      {
        status  = stat ;  
      }
  
  public String getStatus()
      {
      return status;
      } 
//Include a method that calculates and returns the BMI of the policyholder.*
  public double BMI()
   {
      return (weight_inPounds * 703 ) / (Math.pow( height_inInches ,2) );
   }

// Include a method that calculates and returns the price of the insurance policy*
   public double Price()
   {
      final double fee = 600.00; //The Insurance Policy has a base fee of $600
      double price = 0.0; // Hold the price total amount
      
      double bmi =BMI(); // Calling BMI method for coditions
      
      if (age > 50)   //if the Policyholder is over 50 years old, there is an additional fee of $75
      {
         price = fee + 75.00;
      }
      
      else if (status.equals("smoker") ) //If the Policyholder is a smoker, there is an additional fee of $100
      {
         price = fee + 100.00;
      }
      
      else if (bmi > 35)//If the Policyholder has a BMI of over 35, there is an additional fee
      {
         double addFee =(bmi - 35) * 20;
         price = addFee + fee ;
      }
      
      else
      {
         return price = fee + 0.00;
      }
      
    return price ;  
   }
   
}