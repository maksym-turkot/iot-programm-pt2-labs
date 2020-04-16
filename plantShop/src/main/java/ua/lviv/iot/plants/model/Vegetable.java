package ua.lviv.iot.plants.model;

public class Vegetable extends CultivatedPlant {

  protected boolean borshchIngredient;

  public boolean isBorshchIngredient() {
    return borshchIngredient;
  }

  public void setBorshchIngredient(boolean borshchIngredient) {
    this.borshchIngredient = borshchIngredient;
  }

  public Vegetable(String name, PlantingSeason plantingSeason, int lifespanInYears,
      double seedsPricePerKgInUah, int nutricionalValueInKCalPerKg, boolean borshchIngredient) {
    super(name, plantingSeason, lifespanInYears, seedsPricePerKgInUah, nutricionalValueInKCalPerKg);
    this.borshchIngredient = borshchIngredient;
  }
}
