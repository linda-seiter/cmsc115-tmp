
public class TemperatureConverterSolution {
	
	/**
	 * Returns the Celsius equivalent of the degrees Fahrenheit.
	 * 
	 * @param fahrenheit - the degrees in Fahrenheit
	 * @return the equivalent degrees in Celsius. 
	 */
	public static double fahrenheitToCelsius(double fahrenheit) {
		double celsius = 5.0/9.0 * (fahrenheit - 32);
		return celsius;
	}

	public static void main(String[] args) {
		double f1 = 32.0;
		double f2 = 212.0;
		double f3 = 0.0;
		
		//Convert fahrenheit to celsius.
		double c1 = fahrenheitToCelsius(f1);
		double c2 = fahrenheitToCelsius(f2);
		double c3 = fahrenheitToCelsius(f3);
		
		System.out.println(String.format("%f fahrenheit = %f celsius", f1, c1));
		System.out.println(String.format("%f fahrenheit = %f celsius", f2, c2));
		System.out.println(String.format("%f fahrenheit = %f celsius", f3, c3));
	}

}
