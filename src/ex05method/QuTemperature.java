package ex05method;

/*
[ 문제5-3 ]
섭씨(Celsius)를 입력받아서 화씨(Fahrenheit)로 변환하여 리턴하는 함수와 화씨를 입력받아서 섭씨로 변환하여 리턴하는 함수를 만들어라.

공식)
화씨 = 1.8 * 섭씨 + 32
섭씨 = (화씨 - 32) / 1.8
*/

import java.util.Scanner;

public class QuTemperature {
	
	public static double celsiusToFahrenheit(double temp) {
		double cel = 1.8 * temp + 32;
		
		return cel;
	}
	
	public static double fahrenheitToCelsius(double temp) {
		double fahr = (temp - 32) / 1.8;
				
		return fahr;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("섭씨 : ");
		double celsius = scan.nextDouble();
		System.out.println("화씨 : ");
		double fahrenheit = scan.nextDouble();
		
		System.out.println("섭씨 to 화씨 : "+ celsiusToFahrenheit(celsius));
		System.out.println("화씨 to 섭씨 : "+ fahrenheitToCelsius(fahrenheit));

	}

}
