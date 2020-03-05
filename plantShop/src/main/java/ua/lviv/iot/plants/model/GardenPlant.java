package ua.lviv.iot.plants.model;

public abstract class GardenPlant {

	protected String name;
	protected PlantingSeason plantingSeason;
	protected int lifespanInYears;
	protected double seedsPricePerKgInUAH;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PlantingSeason getPlantingSeason() {
		return plantingSeason;
	}

	public void setPlantingSeason(PlantingSeason plantingSeason) {
		this.plantingSeason = plantingSeason;
	}

	public int getLifespanInYears() {
		return lifespanInYears;
	}

	public void setLifespanInYears(int lifespanInYears) {
		this.lifespanInYears = lifespanInYears;
	}

	public double getSeedsPricePerKgInUAH() {
		return seedsPricePerKgInUAH;
	}

	public void setSeedsPricePerKgInUAH(double seedsPricePerKgInUAH) {
		this.seedsPricePerKgInUAH = seedsPricePerKgInUAH;
	}

	public GardenPlant(String name, PlantingSeason plantingSeason, int lifespanInYears, double seedsPricePerKgInUAH) {
		this.name = name;
		this.plantingSeason = plantingSeason;
		this.lifespanInYears = lifespanInYears;
		this.seedsPricePerKgInUAH = seedsPricePerKgInUAH;
	}

}
