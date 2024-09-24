import java.util.Scanner;


public class TipCalculatorRunner {
    public static void main(String[] args) {
        // Ask for input with Scanner
        // Inputs are for money and tip
        Scanner s = new Scanner(System.in);

        System.out.print("Enter your Bill (S): ");
        String tempSubTotal = s.nextLine();
        double subTotal = Double.parseDouble(tempSubTotal);


        System.out.print("Tip Percent: ");
        String tempTipPercentage = s.nextLine();
        double tipPercentage = Double.parseDouble(tempTipPercentage) / 100;

        System.out.print("Number of People: ");
        String tempNumberOfPeople = s.nextLine();
        int numOfPeople = Integer.parseInt(tempNumberOfPeople);

        // CLose scanner
        s.close();

        TipCalculator calc1 = new TipCalculator(subTotal, tipPercentage, numOfPeople);
        calc1.calculateValues();
        calc1.printResults();


    }
}