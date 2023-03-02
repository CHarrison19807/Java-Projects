import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    final static byte MONTHS_IN_YEAR = 12;
    final static byte PERCENT = 100;
    public static void main(String[] args) {

        int principle = (int)readNumber("Principle: ",1000,1_000_000);
        float annualInterest = (float)readNumber("Annual Interest Rate: ",1,30);
        byte years = (byte)readNumber("Period (Years): ",1,30);

        double mortgage = calculateMortgage(principle, annualInterest, years);
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String mortgageFormatted = currency.format(mortgage);

        String MORTGAGE = "MORTGAGE";
        String Payment_Schedule = "PAYMENT SCHEDULE";

        System.out.println(" \nMORTGAGE\n" + separator(MORTGAGE) +
                "\nMonthly Payments: " + mortgageFormatted +
                "\n" + separator(Payment_Schedule));
        remainingBalance(principle, annualInterest, years);
    }
    public static double readNumber(String prompt, int min, int max) {
        Scanner scanner = new Scanner(System.in);
        double value;

        while(true) {
            System.out.print(prompt);
            value = scanner.nextInt();
            if (value >= min && value <= max)
                break;
            System.out.println("Enter a value between " + min + " and " + max+ ".");

        }
        return value;
    }
    public static double calculateMortgage(
            int principle,
            float annualInterest,
            byte years) {

        float numberOfPayments = years * MONTHS_IN_YEAR;
        double monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;

        return (principle
                * ((monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1)));
    }

    public static String separator(String title) {
        return "-".repeat(title.length());
    }

    public static void remainingBalance(
            int principle,
            float annualInterest,
            byte years) {

        short numberOfPaymentsMade = 0;
        float numberOfPayments = years * MONTHS_IN_YEAR;
        double monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;

        double balance = principle;
        while (balance > 0) {
            numberOfPaymentsMade++;
            balance = principle * (((Math.pow((1 + monthlyInterest), numberOfPayments))
                    - ((Math.pow((1 + monthlyInterest), numberOfPaymentsMade))))
                    / (((Math.pow((1 + monthlyInterest), numberOfPayments) - 1))));
            System.out.println(balanceToCurrency(balance));
        }
    }
    public static String balanceToCurrency(double balance) {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(balance);
    }
}


