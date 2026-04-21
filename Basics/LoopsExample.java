package Basic;

public class LoopsExample {

    public static void main(String[] args) {

        // For Loop
        System.out.println("For Loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Value: " + i);
        }

        // While Loop
        System.out.println("\nWhile Loop:");
        int j = 1;
        while (j <= 5) {
            System.out.println("Value: " + j);
            j++;
        }

        // Do-While Loop
        System.out.println("\nDo-While Loop:");
        int k = 1;
        do {
            System.out.println("Value: " + k);
            k++;
        } while (k <= 5);

        // Nested Loop
        System.out.println("\nNested Loop:");
        for (int row = 1; row <= 3; row++) {
            for (int col = 1; col <= 3; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Break and Continue
        System.out.println("\nBreak and Continue:");
        for (int num = 1; num <= 5; num++) {

            if (num == 3) {
                continue;
            }

            if (num == 5) {
                break;
            }

            System.out.println("Value: " + num);
        }
    }
}