package ua.lviv.iot.plants.model;

public abstract class CultivatedPlant extends GardenPlant {

  protected int nutricionalValueInKCalPerKg;

  public int getNutricionalValueInKCalPerKg() {
    return nutricionalValueInKCalPerKg;
  }

  public void setNutricionalValueInKCalPerKg(int nutricionalValueInKCalPerKg) {
    this.nutricionalValueInKCalPerKg = nutricionalValueInKCalPerKg;
  }
<<<<<<< Updated upstream
=======

  public CultivatedPlant(String name, PlantingSeason plantingSeason, int lifespanInYears,
      double seedsPricePerKgInUaH, int nutricionalValueInKCalPerKg) {
    super(name, plantingSeason, lifespanInYears, seedsPricePerKgInUaH);
    this.nutricionalValueInKCalPerKg = nutricionalValueInKCalPerKg;
  }

  @Override
  public String getHeaders() {
    return super.getHeaders() + "," + " nutricionalValueInKCalPerKg";
  }

  @Override
  public String toCsV() {
    return super.toCsV() + "," + nutricionalValueInKCalPerKg;
  }
>>>>>>> Stashed changes

  public CultivatedPlant(String name, PlantingSeason plantingSeason, int lifespanInYears,
      double seedsPricePerKgInUah, int nutricionalValueInKCalPerKg) {
    super(name, plantingSeason, lifespanInYears, seedsPricePerKgInUah);
    this.nutricionalValueInKCalPerKg = nutricionalValueInKCalPerKg;
  }
}
