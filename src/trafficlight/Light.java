package trafficlight;

public class Light {

	private String name;
	private int time;

	public Light(String name, int time) {
		this.name = name;
		this.time = time;
	}

	public void show() {
		System.out.println(this.name);
		pause();
	}

	private void pause() {
		try {
			Thread.sleep(this.time * 1000);
		} catch (InterruptedException e) {
			// ignore Exception
			e.printStackTrace();
		}
	}

}
