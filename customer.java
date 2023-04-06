package morelikes;

import java.util.Random;
import java.util.Scanner;
import java.util.UUID;

public class customer {
    // Initialize Scanner
    static Scanner io_response = new Scanner(System.in);
    // Check the line
    static String response = io_response.nextLine();

    public static void main(String[] args) {
        // Link random library
        Random random = new Random();
        // Random ID from Library UUID
        final String id_of_customer = UUID.randomUUID().toString().replace("-", "");
        // Set bound up (Ticket of number)
        int response_ticket = random.nextInt(1000);
        // Set bound up (Age of number)
        int age_of_customer = random.nextInt(100);

        // Call constructor -> (support)
        support gather_information = new support(id_of_customer, response, age_of_customer, response_ticket);

    }
}
