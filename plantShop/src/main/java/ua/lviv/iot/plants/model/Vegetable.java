package ua.lviv.iot.plants.model;

public class Vegetable extends CultivatedPlant {

  protected boolean borshchIngredient;

  public boolean isBorshchIngredient() {
    return borshchIngredient;
  }

  public void setBorshchIngredient(boolean borshchIngredient) {
    this.borshchIngredient = borshchIngredient;
  }
<<<<<<< Updated upstream
=======

  public Vegetable(String name, PlantingSeason plantingSeason, int lifespanInYears,
      double seedsPricePerKgInUaH, int nutricionalValueInKCalPerKg, boolean borshchIngredient) {
    super(name, plantingSeason, lifespanInYears, seedsPricePerKgInUaH, nutricionalValueInKCalPerKg);
    this.borshchIngredient = borshchIngredient;
  }

  @Override
  public String getHeaders() {
    return super.getHeaders() + "," + " borshchIngredient";
  }

  @Override
  public String toCsV() {
    return super.toCsV() + "," + borshchIngredient;
  }
>>>>>>> Stashed changes

  public Vegetable(String name, PlantingSeason plantingSeason, int lifespanInYears,
      double seedsPricePerKgInUah, int nutricionalValueInKCalPerKg, boolean borshchIngredient) {
    super(name, plantingSeason, lifespanInYears, seedsPricePerKgInUah, nutricionalValueInKCalPerKg);
    this.borshchIngredient = borshchIngredient;
  }
}
