package ua.lviv.iot.plants.model;

public class Fruit extends CultivatedPlant {

	protected boolean exotic;

	public boolean isExotic() {
		return exotic;
	}

	public void setExotic(boolean exotic) {
		this.exotic = exotic;
	}

	public Fruit(String name, PlantingSeason plantingSeason, int lifespanInYears, double seedsPricePerKgInUAH,
			int nutricionalValueInKCalPerKg, boolean exotic) {
		super(name, plantingSeason, lifespanInYears, seedsPricePerKgInUAH, nutricionalValueInKCalPerKg);
		this.exotic = exotic;
	}

}
