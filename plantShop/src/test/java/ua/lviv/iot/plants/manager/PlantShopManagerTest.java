package ua.lviv.iot.plants.manager;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.lviv.iot.plants.manager.PlantShopManager;
import ua.lviv.iot.plants.model.GardenPlant;
import ua.lviv.iot.plants.model.PlantingSeason;

import java.util.List;

class PlantShopManagerTest extends PlantShopManagerBaseTest {

	private PlantShopManager plantShopManager;

	@BeforeEach
	public void setUp() {
		plantShopManager = new PlantShopManager();

		supplyAllPlants();

		plantShopManager.addPlants(flower);
		plantShopManager.addPlants(vegetable);
		plantShopManager.addPlants(fruit);
	}

	@Test
	public void testFindPlantByPlantingSeason() {
		List<GardenPlant> plant = plantShopManager.findPlantsBy(PlantingSeason.SPRING);
		assertEquals(3, plant.size());
		assertEquals(PlantingSeason.SPRING, plant.get(0).getPlantingSeason());
	}

}
