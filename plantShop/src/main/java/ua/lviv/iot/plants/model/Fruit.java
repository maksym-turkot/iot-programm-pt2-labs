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
      double seedsPricePerKgInUaH, int nutricionalValueInKCalPerKg, boolean exotic) {
    super(name, plantingSeason, lifespanInYears, seedsPricePerKgInUaH, nutricionalValueInKCalPerKg);
    this.exotic = exotic;
  }

  @Override
  public String getHeaders() {
    return super.getHeaders() + "," + " exotic";
  }

  @Override
  public String toCsV() {
    return super.toCsV() + "," + exotic;

  }
}
