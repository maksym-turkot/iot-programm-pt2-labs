package ua.lviv.iot.plants.model;

public abstract class GardenPlant {

  protected String name;
  protected PlantingSeason plantingSeason;
  protected int lifespanInYears;
<<<<<<< Updated upstream
  protected double seedsPricePerKgInUah;
=======
  protected double seedsPricePerKgInUaH;
>>>>>>> Stashed changes

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

<<<<<<< Updated upstream
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
=======
  public double getSeedsPricePerKgInUaH() {
    return seedsPricePerKgInUaH;
  }

  public void setSeedsPricePerKgInUaH(double seedsPricePerKgInUaH) {
    this.seedsPricePerKgInUaH = seedsPricePerKgInUaH;
  }

  /**
   * GardenPlant class constructor.
   * 
   * @param name defines plant's name
   * @param plantingSeason shows when plant can be planted
   * @param lifespanInYears indicates lifespan
   * @param seedsPricePerKgInUaH shows how expensive plant is
   */
  public GardenPlant(String name, PlantingSeason plantingSeason, int lifespanInYears,
      double seedsPricePerKgInUaH) {
    this.name = name;
    this.plantingSeason = plantingSeason;
    this.lifespanInYears = lifespanInYears;
    this.seedsPricePerKgInUaH = seedsPricePerKgInUaH;
  }

  public String getHeaders() {
    return "name, plantingSeason, lifespanInYears, seedsPricePerKgInUaH";
  }

  public String toCsV() {
    return name + "," + plantingSeason + "," + lifespanInYears + "," + seedsPricePerKgInUaH;
>>>>>>> Stashed changes
  }
}
