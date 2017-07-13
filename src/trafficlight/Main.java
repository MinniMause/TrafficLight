package trafficlight;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.print("Enter delation for colors with space : ");
		int green = in.nextInt();
		int yellow = in.nextInt();
		int red = in.nextInt();
		in.close();				

		TrafficLight trafficLight = new TrafficLight(green, yellow, red);
		trafficLight.run();

	}

}
