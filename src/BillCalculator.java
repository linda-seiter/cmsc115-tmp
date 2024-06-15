

import java.util.Scanner;

public class BillCalculator {
	
	public static double roundUpNearestCent(double num) {
		return  Math.ceil(num*100)/100.0;
	}
	
	public static double calculateTip(double bill, int tipPercent) {
		return roundUpNearestCent(bill * tipPercent / 100.0); 
	}
	
	public static double calculateCostPerPerson(double bill, int numDiners) {
		int tipPercent = numDiners >= 6? 20 : 15;
		double totalBill = bill + calculateTip(bill, tipPercent);
		double costPerPerson = totalBill / numDiners;
		return roundUpNearestCent(costPerPerson);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the bill and #diners:");
		double bill = input.nextDouble();
		int numDiners = input.nextInt();
		double costPerPerson = calculateCostPerPerson(bill, numDiners);
		System.out.println("Each person owes $" + costPerPerson);
	}

}
