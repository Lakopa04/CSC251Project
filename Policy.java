public class Policy {
   


//An insurance Policy has the following attributes:
   private String policyNum;
   private Stirng providerName; 
   private String firstName;
   private String lastName;
   private int age;
   private String smokingStat;
   private double height;
   private double weight;
   private double bmi;
   private double insurePrice;



//no-arg constructors

   public Policy() {
      this.policyNum = "";
      this.providerName = "";
      this.firstName = "";
      this.lastName = "";
      this.age = 0;
      this.smokingStat = "";
      this.height = 0.0; 
      this.weight = 0.0;
      this.bmi = 0.0;
      this.insurePrice = 0.0;
   
   
   } 
   
   //Constructors with arguements
   public Policy(String policyNum, String providerName, String firstName, String lastName, int age, String smokingStat, double height, double weight) {
      this.policyNum = policyNum;
      this.providerName = providerName;
      this.firstName = firstName;
      this.lastName = lastName;
      this.age = age;
      this.smokingStat = smokingStat;
      this.height = height;
      this.weight = weight;
      calculateBMI();
      calculateInsurancePrice();
   
   }
   
   // Setters and Getters
   public String getPolicyNumber() {
   
      return policyNum;
   
   }
   
   public void setPolicyNumber(String policyNum) {
      
      this.policy = policyNum;
      
   
   }
   
   public String getProviderName(){
      return providerName;
   
   }
   
   public void setProviderName(String providerName){
      this.providerName = providerName;
   
   }
   
   public String getFirstName() {
      return firstName;
   
   }
   
   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }
   
   public String getLastName() {
      return lastName;
   
   
   }
   
   public void setLastName(String lastName) {
      this.lastName = lastName;
   }
   
   public int getAge() {
      return age;
   
   }
   
   public void setAge(int age) {
      this.age = age;
   
   }
   
  public String getSmokingStatus() {
   return smokingStat;
  
  
  }
  
  public void setSmokingStatus(String smokingStat) {
   this.smokingStat = smokingStat;
  
  }
  
  public double getHeight() {
   return height;
  
  }
  
  public void setHeight(double height) {
   this.height = height;
  
  }
  
  public double getWeight(){
   return weight;
  
  }
  
  public void setWeight(double weight) {
   this.weight = weight;
  
  
  }
  
  public double getBmi() {
   return bmi;
  
  
  }
  
  public double getInsurancePrice() {
   return insurePrice;
  
  
  }
  
  private void calcualateBMI() {
   this.bmi = (weight * 703) / (height * weight);
  
  }
  
  
  //Method to calculate insurance price
  private void calculateInsurancePrice() {
  
   insurePrice = 600;
   
   
   //Additonal fee for people over the age of 50
   if(age > 50) {
      insurncePrice += 75;
   
   }
   
   //Additional fee for smokers
   if(smokingStat.equalsIgnoreCse("smoker")) {
      insurePrice += 100;
   
   }
   
   //Additional fee for BMI over 35
   if (bmi > 35) {
      insurePrice += (bmi - 35) * 20; 
   
   
   }
  
  }
  
  



}