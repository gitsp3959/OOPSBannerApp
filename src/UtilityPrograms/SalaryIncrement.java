// Create SalaryIncrement Class to calculate salary increment

class SalaryIncrement {
    public static void main(String[] args) {

        // Create variables for salary details
        String employeeName = "Eric";
        double salary = 50000;
        double incrementPercentage = 10;

        // Calculate increment amount
        double increment = salary * incrementPercentage / 100;

        // Calculate new salary
        double newSalary = salary + increment;

        // Display salary details
        System.out.println("Salary Details:\nEmployee Name: " + employeeName +
                "\nOld Salary: " + salary +
                "\nIncrement: " + increment +
                "\nNew Salary: " + newSalary);
    }
}