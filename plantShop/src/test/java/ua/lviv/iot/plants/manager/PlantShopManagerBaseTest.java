package ua.lviv.iot.plants.manager;

import ua.lviv.iot.plants.model.*;

import java.util.LinkedList;
import java.util.List;

public abstract class PlantShopManagerBaseTest {

	protected List<GardenPlant> flower;
	protected List<GardenPlant> vegetable;
	protected List<GardenPlant> fruit;

	public void supplyFlowers() {
		flower = new LinkedList<GardenPlant>();
		flower.add(new Flower("Aster", PlantingSeason.SPRING, 2, 3283.42, "DeepPurple"));
		flower.add(new Flower("Tulip", PlantingSeason.FALL, 1, 1170.25, "Red"));

	}

	public void supplyVegetables() {
		vegetable = new LinkedList<GardenPlant>();
		vegetable.add(new Vegetable("Pickle", PlantingSeason.SPRING, 1, 2734.88, 150, false));
		vegetable.add(new Vegetable("Tomato", PlantingSeason.SPRING, 3, 7242.42, 180, true));
	}

	public void supplyFruits() {
		fruit = new LinkedList<GardenPlant>();
		fruit.add(new Fruit("Apple", PlantingSeason.WINTER, 100, 67.45, 520, false));
		fruit.add(new Fruit("Rambutan", PlantingSeason.SUMMER, 10, 95.10, 680, true));
	}

	public void supplyAllPlants() {
		supplyFlowers();
		supplyVegetables();
		supplyFruits();
	}
}
