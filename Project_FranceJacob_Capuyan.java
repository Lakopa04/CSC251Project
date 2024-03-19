import java.util.Scanner; 

//Name: France Jacob Capuyan 
//Date: 3/18/24
//Purpose: Project Part 1 (3/18/24)





public class Project_FranceJacob_Capuyan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user to enter policy number
        System.out.println("Please Enter Policy Number:");
        int policyNumber = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println("Please enter the Enter Provider Name:");
        String providerName = scanner.nextLine();

        System.out.println("Please Enter Policyholder's First Name:");
        String firstName = scanner.nextLine();

        System.out.println("Please Enter Policyholder's Last Name:");
        String lastName = scanner.nextLine();

        System.out.println("PleaseEnter Policyholder's Age:");
        int age = scanner.nextInt();

        System.out.println("Please Enter Policyholder's Smoking Status (smoker/non-smoker):");
        String smokingStatus = scanner.next();

        System.out.println("Please Enter Policyholder's Height (in inches):");
        double height = scanner.nextDouble();

        System.out.println("Please Enter Policyholder's Weight (in pounds):");
        double weight = scanner.nextDouble();
         
         
         //A policy object using the provided info.
        Policy policy = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);
         
         //Displays policy information
        System.out.println("Policy Number: " + policy.getPolicyNum());
        System.out.println("Provider Name: " + policy.getProviderName());
        System.out.println("Policyholder's First Name: " + policy.getFirstName());
        System.out.println("Policyholder's Last Name: " + policy.getLastName());
        System.out.println("Policyholder's Age: " + policy.getAge());
        System.out.println("Policyholder's Smoking Status: " + policy.getSmokingStatus());
        System.out.println("Policyholder's Height: " + policy.getHeight() + " inches");
        System.out.println("Policyholder's Weight: " + policy.getWeight() + " pounds");
        System.out.println("Policyholder's BMI: " + policy.getBMI());
        System.out.println("Policy Price: $" + policy.getPrice());

    }
}