package ua.lviv.iot.plants.model;

public class Flower extends GardenPlant {

	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Flower(String name, PlantingSeason plantingSeason, int lifespanInYears, double seedsPricePerKgInUAH,
			String color) {
		super(name, plantingSeason, lifespanInYears, seedsPricePerKgInUAH);
		this.color = color;
	}

}
