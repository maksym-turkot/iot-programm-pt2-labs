package ua.lviv.iot.plants.model;

public class Flower extends GardenPlant {

  private String color;

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }
<<<<<<< Updated upstream

  public Flower(String name, PlantingSeason plantingSeason, int lifespanInYears,
      double seedsPricePerKgInUah, String color) {
    super(name, plantingSeason, lifespanInYears, seedsPricePerKgInUah);
    this.color = color;
=======

  public Flower(String name, PlantingSeason plantingSeason, int lifespanInYears,
      double seedsPricePerKgInUaH, String color) {
    super(name, plantingSeason, lifespanInYears, seedsPricePerKgInUaH);
    this.color = color;
  }

  @Override
  public String getHeaders() {
    return super.getHeaders() + "," + " color";
  }

  @Override
  public String toCsV() {
    return super.toCsV() + "," + color;
>>>>>>> Stashed changes
  }
}
