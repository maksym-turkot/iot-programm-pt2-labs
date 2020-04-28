package ua.lviv.iot.plants.manager;

import ua.lviv.iot.plants.model.*;

import java.util.LinkedList;
import java.util.List;

public abstract class PlantShopManagerBaseTest {

  protected List<GardenPlant> flowers;
  protected List<GardenPlant> vegetables;
  protected List<GardenPlant> fruits;

  public void supplyFlowers() {
    flowers = new LinkedList<GardenPlant>();
    flowers.add(new Flower("Aster", PlantingSeason.SPRING, 2, 3283.42, "DeepPurple"));
    flowers.add(new Flower("Tulip", PlantingSeason.FALL, 1, 1170.25, "Red"));

  }

  public void supplyVegetables() {
    vegetables = new LinkedList<GardenPlant>();
    vegetables.add(new Vegetable("Pickle", PlantingSeason.SPRING, 1, 2734.88, 150, false));
    vegetables.add(new Vegetable("Tomato", PlantingSeason.SPRING, 3, 7242.42, 180, true));
  }

  public void supplyFruits() {
    fruits = new LinkedList<GardenPlant>();
    fruits.add(new Fruit("Apple", PlantingSeason.WINTER, 100, 67.45, 520, false));
    fruits.add(new Fruit("Rambutan", PlantingSeason.SUMMER, 10, 95.10, 680, true));
  }

  public void supplyAllPlants() {
    supplyFlowers();
    supplyVegetables();
    supplyFruits();
  }
}