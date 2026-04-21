package Basic;

public class ConditionalStatementsExample {

    public static void main(String[] args) {

        int marks = 75;

        // If Statement
        if (marks > 50) {
            System.out.println("Passed");
        }

        // If-Else Statement
        int age = 17;
        if (age >= 18) {
            System.out.println("Eligible to Vote");
        } else {
            System.out.println("Not Eligible to Vote");
        }

        // Else-If Ladder
        int score = 85;

        if (score >= 90) {
            System.out.println("Grade A");
        } else if (score >= 75) {
            System.out.println("Grade B");
        } else if (score >= 50) {
            System.out.println("Grade C");
        } else {
            System.out.println("Fail");
        }

        // Nested If
        String username = "admin";
        String password = "test123";

        if (username.equals("admin")) {
            if (password.equals("test123")) {
                System.out.println("Login Successful");
            } else {
                System.out.println("Invalid Password");
            }
        } else {
            System.out.println("Invalid Username");
        }

        // Switch Statement
        int day = 3;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            default:
                System.out.println("Invalid Day");
        }
    }
}