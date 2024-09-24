import java.text.DecimalFormat;

public class TipCalculator {
    // Init variables
    private int numOfPeople;
    private double subTotal;
    private double tipPercentage;

    private double totalTip;
    private double finalBill;
    private double billPerPerson;
    private double tipPerPerson;


    // Decimal formating for money values
    // # non-zero placeholder, 0 all number placeholder
    DecimalFormat dc1 = new DecimalFormat("#.00");

    // Constructor
    public TipCalculator(double subTotal, double tipPercentage, int numOfPeople) {
        this.subTotal = subTotal;
        this.tipPercentage = tipPercentage;
        this.numOfPeople = numOfPeople;
    }

    // Calculations for values
    public void calculateValues() {
        totalTip = tipPercentage * subTotal;
        tipPerPerson = totalTip / numOfPeople;
        finalBill = totalTip + subTotal;
        billPerPerson = finalBill / numOfPeople;
    }

    // Print the final receipt
    // Results boxed
    // Format all money values with dc1
    public void printResults() {
        String seperation1 = "-------------------------------";
        final String ENDING_SIGN = "Thanks for supporting us!\nTHANK YOU";

        System.out.println();
        System.out.println(seperation1);
        System.out.println("|" + "Response: Approved");
        System.out.println(seperation1);
        System.out.println("|" + "Sub Total: USD $" + dc1.format(subTotal));
        System.out.println("|" + "Tip: USD $" + dc1.format(totalTip));
        System.out.println("|" + "Bill per person: USD $" + dc1.format(billPerPerson));
        System.out.println("|" + "Tip per person: USD $" + dc1.format(tipPerPerson));
        System.out.println("|" + "Total bill: USD $" + dc1.format(finalBill));
        System.out.println(seperation1);
        System.out.println();
        System.out.println(ENDING_SIGN);
    }
}