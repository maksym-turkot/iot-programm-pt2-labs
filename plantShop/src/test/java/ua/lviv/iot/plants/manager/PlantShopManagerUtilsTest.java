package ua.lviv.iot.plants.manager;

import org.junit.jupiter.api.Test;
import ua.lviv.iot.plants.model.SortType;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PlantShopManagerUtilsTest extends PlantShopManagerBaseTest {

	@Test
	public void testSortPlantsBySeedsPricePerKgInUah() {
		supplyAllPlants();
		PlantShopManagerUtils.sortPlantsBySeedsPricePerKgInUah(flowers, SortType.ASC);
		assertEquals(1170.25, flowers.get(0).getSeedsPricePerKgInUah());
		assertEquals(3283.42, flowers.get(1).getSeedsPricePerKgInUah());
	}

	@Test
	public void testSortPlantsByName() {
		supplyAllPlants();
		PlantShopManagerUtils.sortPlantsByName(vegetables, SortType.DESC);
		assertEquals("Tomato", vegetables.get(0).getName());
		assertEquals("Pickle", vegetables.get(1).getName());

	}

	@Test
	public void testSortPlantsByLifespanInYears() {
		supplyAllPlants();
		PlantShopManagerUtils.sortPlantsByLifespanInYears(fruits, SortType.ASC);
		assertEquals(10, fruits.get(0).getLifespanInYears());
		assertEquals(100, fruits.get(1).getLifespanInYears());
	}

	@Test
	public void testSortPlantsByLifespanAndName() {
		supplyAllPlants();
		PlantShopManagerUtils.sortPlantsByLifespanAndName(flowers, SortType.DESC);
		assertEquals(1, flowers.get(0).getLifespanInYears());
		assertEquals(2, flowers.get(1).getLifespanInYears());
		assertEquals("Tulip", flowers.get(0).getName());
		assertEquals("Aster", flowers.get(1).getName());
	}

	@Test
	public void testSortPlantsByLifespanInYearsLambdaStyle() {
		supplyAllPlants();
		PlantShopManagerUtils.sortPlantsByLifespanInYearsLambdaStyle(vegetables, SortType.ASC);
		assertEquals(1, vegetables.get(0).getLifespanInYears());
		assertEquals(3, vegetables.get(1).getLifespanInYears());

	}
}
