class Policy {
    private int policyNum;
    private String providerName;
    private String firstName;
    private String lastName;
    private int age;
    private String smokingStatus;
    private double height;
    private double weight;
    private double bmi;
    private double price;

    public Policy() {
        this.policyNum = 0;
        this.providerName = "";
        this.firstName = "";
        this.lastName = "";
        this.age = 0;
        this.smokingStatus = "";
        this.height = 0;
        this.weight = 0;
        this.bmi = 0;
        this.price = 0;
    }

    public Policy(int policyNum, String providerName, String firstName, String lastName, int age,
                  String smokingStatus, double height, double weight) {
        this.policyNum = policyNum;
        this.providerName = providerName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.smokingStatus = smokingStatus;
        this.height = height;
        this.weight = weight;
        calculateBMI();
        calculatePrice();
    }

    public int getPolicyNum() {
        return policyNum;
    }

    public String getProviderName() {
        return providerName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getSmokingStatus() {
        return smokingStatus;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public double getBMI() {
        return bmi;
    }

    public double getPrice() {
        return price;
    }

    private void calculateBMI() {
        bmi = (weight * 703) / (height * height);
    }

    private void calculatePrice() {
        price = 600; // Base fee
        if (age > 50) {
            price += 75; // Additional fee for age over 50
        }
        if (smokingStatus.equalsIgnoreCase("smoker")) {
            price += 100; // Additional fee for smokers
        }
        if (bmi > 35) {
            calculateBMI(); // Recalculate BMI
            price += (bmi - 35) * 20; // Additional fee for BMI over 35
        }
    }
}