package ua.lviv.iot.plants.model;

public abstract class GardenPlant {

  protected String name;
  protected PlantingSeason plantingSeason;
  protected int lifespanInYears;
  protected double seedsPricePerKgInUah;

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

  public double getSeedsPricePerKgInUah() {
    return seedsPricePerKgInUah;
  }

  public void setSeedsPricePerKgInUah(double seedsPricePerKgInUah) {
    this.seedsPricePerKgInUah = seedsPricePerKgInUah;
  }

  /**
   * Checkstyle-recommended Javadoc comment.
   * GardenPlant constructor.
   * 
   * @param name is plant's name
   * @param plantingSeason is plant's planting season
   * @param lifespanInYears is plant's lifespan
   * @param seedsPricePerKgInUah is plant's seeds' price
   */
  public GardenPlant(String name, PlantingSeason plantingSeason, int lifespanInYears,
      double seedsPricePerKgInUah) {
    this.name = name;
    this.plantingSeason = plantingSeason;
    this.lifespanInYears = lifespanInYears;
    this.seedsPricePerKgInUah = seedsPricePerKgInUah;
  }

  public int compareTo(Flower another) {
    // TODO Auto-generated method stub
    return 0;
  }
}
