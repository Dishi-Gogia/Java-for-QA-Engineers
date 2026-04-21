package Basic;

public class VariablesExample {

	// Instance variables
    int employeeId = 101;
    String employeeName = "John";

    // Static variable
    static String companyName = "ABC Technologies";

    public void displayVariables() {

        // Local variables
        int age = 30;
        float salary = 55000.75f;
        double bonus = 12000.50;
        char grade = 'A';
        boolean isActive = true;
        long phoneNumber = 9876543210L;
        short experience = 5;
        byte rating = 4;

        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Grade: " + grade);
        System.out.println("Is Active: " + isActive);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Experience: " + experience);
        System.out.println("Rating: " + rating);
    }

    public static void main(String[] args) {

        VariablesExample obj = new VariablesExample();

        // Final variable
        final String department = "QA";

        System.out.println("Employee ID: " + obj.employeeId);
        System.out.println("Employee Name: " + obj.employeeName);
        System.out.println("Company Name: " + companyName);

        obj.displayVariables();

        System.out.println("Department: " + department);
    }
}
