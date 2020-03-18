package ua.lviv.iot.plants.manager;

import org.junit.jupiter.api.Test;
import ua.lviv.iot.plants.model.SortType;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PlantShopManagerUtilsTest extends PlantShopManagerBaseTest {

	@Test
	public void testSortPlantsBySeedsPricePerKgInUah() {
		supplyAllPlants();
		PlantShopManagerUtils.sortPlantsBySeedsPricePerKgInUah(flower, SortType.ASC);
		assertEquals(1170.25, flower.get(0).getSeedsPricePerKgInUah());
		assertEquals(3283.42, flower.get(1).getSeedsPricePerKgInUah());
	}

	@Test
	public void testSortPlantsByName() {
		supplyAllPlants();
		PlantShopManagerUtils.sortPlantsByName(vegetable, SortType.DESC);
		assertEquals("Tomato", vegetable.get(0).getName());
		assertEquals("Pickle", vegetable.get(1).getName());

	}

//	@Test
//	public void testSortPlantsByLifespanInYears() {
//		supplyAllPlants();
//		PlantShopManagerUtils.sortPlantsByName(fruit, SortType.ASC);
//		assertEquals(10, fruit.get(0).getLifespanInYears());
//		assertEquals(100, fruit.get(1).getLifespanInYears());
//	}

//	@Test
//	public void testSortPlantsByLifespanAndName() {
//		supplyAllPlants();
//		PlantShopManagerUtils.sortPlantsByName(flower, SortType.DESC);
//		assertEquals(2, flower.get(0).getLifespanInYears());
//		assertEquals(1, flower.get(1).getLifespanInYears());
//		assertEquals("Tulip", flower.get(0).getName());
//		assertEquals("Aster", flower.get(1).getName());
//	}

	@Test
	public void testSortPlantsByLifespanInYearsLambdaStyle() {
		supplyAllPlants();
		PlantShopManagerUtils.sortPlantsByLifespanInYearsLambdaStyle(vegetable, SortType.ASC);
		assertEquals(1, vegetable.get(0).getLifespanInYears());
		assertEquals(3, vegetable.get(1).getLifespanInYears());

	}

}
