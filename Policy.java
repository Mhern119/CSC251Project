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
   
 /**@param number The Policy number
   @param providerName The Policy Provider's Name
   @param firstName The Policyhodler's first name
   @param lastName The Policyholder's last name
   @param age The Policyholder's age
   @param status The Policyholder's smoking status
   @param height_inInches The Policyholder's height
   @param weight_inPounds The Policytholder's weight
   */
   
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
   /**
   @param number setting the number
   */  
  public void setNumber(int num) // Number
      {
      number = num ;
      }
    /**
   @return The Policy Number
   */ 
  public int getNumber()
      {
      return number;
      }
   /**
   @return number of policy
   */
   public void setProviderName(String n)  // Provider Name
      {
      providerName  = n ;
      }
    /**
   @return The Policy name
   */ 
  public String getProviderName()
      {
      return providerName;
      }
       /**
   @param first name
   */  
  public void setFirstName(String fn)  // First Name
      {
         firstName = fn ;
      }
     /**
   @return first name
   */
  public String getFirstName()
      {
      return firstName;
      }   
       /**
   @param last name 
   */  
  public void setLastName(String ln)  // last Name
      {
         lastName = ln ;
      }
     /**
   @return last name
   */
  public String getLastName()
      {
         return lastName;
      } 
       /**
   @param age 
   */  
  public void setAge(int a)  // Age
      {
         age  = a ;
      }
     /**
   @return age
   */
  public int getAge()
      {
         return age;
      } 
     /**
   @param the height 
   */
 public void setHeight(double h)  // Height
      {
       height_inInches  = h ;  
      }
    /**
   @return The height
   */ 
  public double getHeight()
      {
      return height_inInches;
      } 
    /**
   @param weight
   */
 public void setWeight(double w)  // Weight
      {
        weight_inPounds  = w ; 
      }
    /**
   @return weight 
   */ 
  public double getWeight()
      {
      return weight_inPounds;
      } 
   /**
  @param status
  */     
 public void setStatus(String stat)  // Status 
      {
        status  = stat ;  
      }
  /**
  @return status
  */
  public String getStatus()
      {
      return status;
      } 
/**Include a method that calculates and returns the BMI of the policyholder.*
   @return BMI
*/
  public double BMI()
   {
      return (weight_inPounds * 703 ) / (Math.pow( height_inInches ,2) );
   }

/** Include a method that calculates and returns the price of the insurance policy*
   @param price the total price
   @param fee the base fee
   @return the price 
*/   
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