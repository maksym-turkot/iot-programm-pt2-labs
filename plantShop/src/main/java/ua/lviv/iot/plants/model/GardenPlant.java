package ua.lviv.iot.plants.model;

public abstract class GardenPlant {

  protected String name;
  protected PlantingSeason plantingSeason;
  protected int lifespanInYears;
  protected double seedsPricePerKgInUaH;
  protected Integer id;

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

  public double getSeedsPricePerKgInUaH() {
    return seedsPricePerKgInUaH;
  }

  public void setSeedsPricePerKgInUaH(double seedsPricePerKgInUaH) {
    this.seedsPricePerKgInUaH = seedsPricePerKgInUaH;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * GardenPlant class constructor.
   * 
   * @param name                 defines plant's name
   * @param plantingSeason       shows when plant can be planted
   * @param lifespanInYears      indicates lifespan
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
  }
  
  public GardenPlant() {
    
  }
}