
public class TemperatureConverter {
	
	public static double fahrenheitToCelsius(double fahrenheit) {
		double celsius = (5.0 / 9.0) * (fahrenheit - 32) ;
		return celsius;
	}

	public static void main(String[] args) {
		//Fahrenheit temperatures.
		double f1 = 32.0;
		double f2 = 212.0;
		double f3 = 0.0;
		
		//Convert Fahrenheit to Celsius. Error in formula due to integer division.
		double c1 = 5/9 * (f1 - 32);
		double c2 = 5/9 * (f2 - 32);
		double c3 = 5/9 * (f3 - 32);
		
		//Print results
		System.out.println(String.format("%f fahrenheit = %f celsius", f1, c1));
		System.out.println(String.format("%f fahrenheit = %f celsius", f2, c2));
		System.out.println(String.format("%f fahrenheit = %f celsius", f3, c3));
	}

}
