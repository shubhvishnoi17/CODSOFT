import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the base currency (USD, INR, EUR):");
        String baseCurrency = sc.next().toUpperCase();

        System.out.println("Enter the currency you want to convert to (USD, INR, EUR):");
        String targetCurrency = sc.next().toUpperCase();

        System.out.println("How much " + baseCurrency + " do you want to convert?");
        double amount = sc.nextDouble();

        double rate = getExchangeRate(baseCurrency, targetCurrency);
        double convertedAmount = amount * rate;

        if (rate == 0) {
            System.out.println("Oops! That currency combination is not supported.");
        } else {
            System.out.printf("%.2f %s is equal to %.2f %s\n", amount, baseCurrency, convertedAmount, targetCurrency);
        }

        sc.close();
    }

    public static double getExchangeRate(String from, String to) {
        if (from.equals("USD") && to.equals("INR")) return 83.0;
        if (from.equals("USD") && to.equals("EUR")) return 0.92;
        if (from.equals("INR") && to.equals("USD")) return 0.012;
        if (from.equals("INR") && to.equals("EUR")) return 0.011;
        if (from.equals("EUR") && to.equals("USD")) return 1.09;
        if (from.equals("EUR") && to.equals("INR")) return 90.0;
        if (from.equals(to)) return 1.0;
        return 0.0;
    }
}
