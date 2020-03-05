package ua.lviv.iot.plants.model;

public class Vegetable extends CultivatedPlant {

	protected boolean borshchIngredient;

	public boolean isBorshchIngredient() {
		return borshchIngredient;
	}

	public void setBorshchIngredient(boolean borshchIngredient) {
		this.borshchIngredient = borshchIngredient;
	}

	public Vegetable(String name, PlantingSeason plantingSeason, int lifespanInYears, double seedsPricePerKgInUAH,
			int nutricionalValueInKCalPerKg, boolean borshchIngredient) {
		super(name, plantingSeason, lifespanInYears, seedsPricePerKgInUAH, nutricionalValueInKCalPerKg);
		this.borshchIngredient = borshchIngredient;
	}

}
