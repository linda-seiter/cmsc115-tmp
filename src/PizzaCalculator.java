

import java.util.Scanner;

public class PizzaCalculator {
	
	public static double calculateArea(int radius) {
		return Math.PI * Math.pow(radius, 2);
	}
	
	public static int calculateCaloriesPerPizza(int diameter) {
		int caloriesPerSqInch = 20;
		double area = calculateArea(diameter/2);
		double totalCalories = area * caloriesPerSqInch;
		return (int) totalCalories;
	}
	
	public static int calculateCaloriesPerSlice(int diameter, int slices) {
		return calculateCaloriesPerPizza(diameter) / slices;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in) ;
		System.out.println("Enter pizza diameter and number of slices:");
		int diameter = input.nextInt();
		int slices = input.nextInt();
		int calPerSlice = calculateCaloriesPerSlice(diameter, slices);
		System.out.println("Calories per slice = " + calPerSlice);
	}

}
