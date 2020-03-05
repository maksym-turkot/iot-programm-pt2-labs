package ua.lviv.iot.plants.manager;

import org.junit.jupiter.api.Test;

import ua.lviv.iot.plants.manager.PlantShopManagerUtils;
import ua.lviv.iot.plants.model.SortType;

class PlantShopManagerUtilsTest extends PlantShopManagerBaseTest {

	@Test
	public void testSortingDescending() {
		PlantShopManagerUtils.sortBySeedsPricePerKgInUAH(flower, SortType.DESC);
		PlantShopManagerUtils.sortByLifespanInYears(vegetable, SortType.DESC);
	}

	@Test
	public void testSortingAscending() {
		PlantShopManagerUtils.sortBySeedsPricePerKgInUAH(vegetable, SortType.ASC);
		PlantShopManagerUtils.sortByLifespanInYears(flower, SortType.ASC);
	}

}
