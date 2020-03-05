package ua.lviv.iot.plants.model;

public abstract class CultivatedPlant extends GardenPlant {

	protected int nutricionalValueInKCalPerKg;

	public int getNutricionalValueInKCalPerKg() {
		return nutricionalValueInKCalPerKg;
	}

	public void setNutricionalValueInKCalPerKg(int nutricionalValueInKCalPerKg) {
		this.nutricionalValueInKCalPerKg = nutricionalValueInKCalPerKg;
	}

	public CultivatedPlant(String name, PlantingSeason plantingSeason, int lifespanInYears, double seedsPricePerKgInUAH,
			int nutricionalValueInKCalPerKg) {
		super(name, plantingSeason, lifespanInYears, seedsPricePerKgInUAH);
		this.nutricionalValueInKCalPerKg = nutricionalValueInKCalPerKg;
	}

}
