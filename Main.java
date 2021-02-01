// Import Scanner
import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    // Initiate Scanner
    Scanner scan = new Scanner(System.in);

    // Print statements to get scanner variables
    System.out.println("Enter your age:");
    int currentAge = scan.nextInt();
    System.out.println("Enter any number of years");
    int yearsPassing = scan.nextInt();

    // Run calculateBalance using variables received from scanner
    System.out.println(ageOverTime(currentAge, yearsPassing));

    // 2nd set of print statements
    System.out.println("How much money do you have?:");
    double currentMoney = scan.nextDouble();
    System.out.println("How much money does your job pay per hour?:");
    double hourlyWage = scan.nextDouble();
    System.out.println("How many hours do you plan to work this week?:");
    int hoursWorking = scan.nextInt();
    
    // Run calculateBalance using variables received from scanner
    System.out.println(calculateBalance(currentMoney, hoursWorking, hourlyWage));

  }

  static int ageOverTime(int age, int yearsPassed) {

    // Assign new variables within method
    int newAge = age + yearsPassed;

    // Statements that method will print
    System.out.println("Your current age is " + age);
    System.out.print("In " + yearsPassed + " years you will be: ");

    // returns this variable
    return newAge;
  }

  static double calculateBalance(double pocketMoney, int hours, double wage) {

    // Assign new variables within method
    double weeklyWage = wage * hours;
    double totalMoney = weeklyWage + pocketMoney;

    // Statements that method will print
    System.out.println("If you work " + hours + " hours this week, with an hourly wage of " + wage + ", you will make " + weeklyWage + " dollars");
    
    System.out.print("So, at the end of the week you will have a total balance of: ");

    // returns this variable
    return totalMoney;

  }
}
