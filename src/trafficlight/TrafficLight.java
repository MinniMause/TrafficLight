package trafficlight;

public class TrafficLight {

	Light green;
	Light red;
	Light yellow;

	public TrafficLight(int timeG, int timeY, int timeR) {

		green = new Light("green", timeG);
		yellow = new Light("yellow", timeY);
		red = new Light("red", timeR);

	}

	public void run() {
		while (true) {
			red.show();
			yellow.show();
			green.show();
			yellow.show();
		}
	}

}
