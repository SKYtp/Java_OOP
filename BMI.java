public class BMI {
    private String name;
  private int age;
  private double weight; // pounds
  private double inches; // inches
  private double feet;
  public static final double KILOGRAMS_POUND = 0.45359237; 
  public static final double METERS_INCH = 0.0254;  

  BMI(String name, int age, double weight, double inches) {
    this.name = name;
    this.age = age;
    this.weight = weight;
    this.inches = inches;
  }
  
  BMI(String name, int age, double weight,double feet, double inches) {
    this.name = name;
    this.age = age;
    this.weight = weight;
    this.feet = feet;
    this.inches = inches;
  }
  
  public double getBMI() {
    double bmi = weight * KILOGRAMS_POUND / ((inches * METERS_INCH) * (inches * METERS_INCH));
    return Math.round(bmi * 100) / 100.0;
  }
  
  public String getStatus() {
    double bmi = getBMI();
    if (bmi < 18.5)
      return "Underweight";
    else if (bmi < 25)
      return "Normal";
    else if (bmi < 30)
      return "Overweight";
    else
      return "Obese";
  }
  
  public String getName() {
    return name;
  }
  
  public int getAge() {
    return age;
  }
  
  public double getWeight() {
    return weight;
  }
  
  public double getHeight() {
    return inches;
  }
}
