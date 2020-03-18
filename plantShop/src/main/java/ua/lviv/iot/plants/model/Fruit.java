package ua.lviv.iot.plants.model;

public class Fruit extends CultivatedPlant {

  protected boolean exotic;

  public boolean isExotic() {
    return exotic;
  }

  public void setExotic(boolean exotic) {
    this.exotic = exotic;
  }

  public Fruit(String name, PlantingSeason plantingSeason, int lifespanInYears,
      double seedsPricePerKgInUah, int nutricionalValueInKCalPerKg, boolean exotic) {
    super(name, plantingSeason, lifespanInYears, seedsPricePerKgInUah, nutricionalValueInKCalPerKg);
    this.exotic = exotic;
  }
}
