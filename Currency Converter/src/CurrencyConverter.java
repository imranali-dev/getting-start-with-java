import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Double> exchangeRates = new HashMap<>();

        // Sample exchange rates
        exchangeRates.put("PKR", 214.30); // Pakistani Rupee
        exchangeRates.put("INR", 81.56);  // Indian Rupee
        exchangeRates.put("USD", 1.00);
        // Get amount to convert from user
        System.out.print("Enter the amount to convert: ");
        double amount;
        try {
            amount = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Invalid amount. Please enter a number.");
            return;
        }
        scanner.nextLine(); // Consume newline

        // Get source currency from user
        System.out.print("Enter the source currency (e.g., USD, EUR, JPY): ");
        String sourceCurrency = scanner.nextLine().toUpperCase();

        // Get target currency from user
        System.out.print("Enter the target currency (e.g., USD, EUR, JPY): ");
        String targetCurrency = scanner.nextLine().toUpperCase();

        // Check for invalid currencies
        if (!exchangeRates.containsKey(sourceCurrency) || !exchangeRates.containsKey(targetCurrency)) {
            System.out.println("Invalid currency code(s). Please enter valid codes.");
            return;
        }

        // Perform conversion
        double conversionRate = exchangeRates.get(targetCurrency) / exchangeRates.get(sourceCurrency);
        double convertedAmount = amount * conversionRate;

        // Display result
        System.out.printf("%.2f %s is equal to %.2f %s\n", amount, sourceCurrency, convertedAmount, targetCurrency);

        scanner.close();
    }
}
