package ua.lviv.iot.plants.manager;

import java.util.Comparator;
import java.util.List;
import ua.lviv.iot.plants.model.GardenPlant;
import ua.lviv.iot.plants.model.SortType;

public class PlantShopManagerUtils {

  private static final PlantsSorterBySeedsPricePerKgInUah PLANTS_SORTER_BY_PRICE =
      new PlantsSorterBySeedsPricePerKgInUah();

  private static PlantShopManagerUtils plantsSorterByName = new PlantShopManagerUtils();
  private static final PlantsSorterByName PLANTS_SORTER_BY_NAME =
      plantsSorterByName.new PlantsSorterByName();

  public static void sortPlantsBySeedsPricePerKgInUah(List<GardenPlant> plants, SortType sortType) {
    plants.sort(sortType == SortType.ASC ? PLANTS_SORTER_BY_PRICE :
        PLANTS_SORTER_BY_PRICE.reversed());
  }

  public static void sortPlantsByName(List<GardenPlant> plants, SortType sortType) {
    plants.sort(sortType == SortType.ASC ? PLANTS_SORTER_BY_NAME :
        PLANTS_SORTER_BY_NAME.reversed());
  }

  public static void sortPlantsByLifespanInYears(List<GardenPlant> plants, SortType sortType) {
    Comparator<GardenPlant> comparator = Comparator.comparing(GardenPlant::getLifespanInYears);
    plants.sort(sortType == SortType.ASC ? comparator : comparator.reversed());
  }

  /**
   * Checkstyle-recommended Javadoc comment.
   * Sorts plants by lifespan and name.
   * Uses anonymous class.
   * 
   * @param plants represents GardenPlant list
   * @param sortType differentiates ascending and descending sort types
   */
  public static void sortPlantsByLifespanAndName(List<GardenPlant> plants, SortType sortType) {
    Comparator<GardenPlant> comparator = new Comparator<GardenPlant>() {

      @Override
      public int compare(GardenPlant firstPlant, GardenPlant secondPlant) {

        double lifespanComparisonResult = firstPlant.getLifespanInYears()
            - secondPlant.getLifespanInYears();

        if (lifespanComparisonResult == 0) {
          return (int) (lifespanComparisonResult);
        }

        return firstPlant.getName().compareTo(secondPlant.getName());
      }
    };
    plants.sort(sortType == SortType.ASC ? comparator : comparator.reversed());
  }

  /**
   * Checkstyle-recommended Javadoc comment.
   * Sorts plants by lifespan.
   * Uses lambda expression.
   * 
   * @param plants represents GardenPlant list
   * @param sortType sortType differentiates ascending and descending sort types
   */
  public static void sortPlantsByLifespanInYearsLambdaStyle(List<GardenPlant> plants,
        SortType sortType) {
    Comparator<GardenPlant> comparator = (firstPlant,
        secondPlant) -> firstPlant.getLifespanInYears() - secondPlant.getLifespanInYears();
    plants.sort(sortType == SortType.ASC ? comparator : comparator.reversed());
  }

  static class PlantsSorterBySeedsPricePerKgInUah implements Comparator<GardenPlant> {
    @Override
    public int compare(GardenPlant firstPlant, GardenPlant secondPlant) {
      return (int) (firstPlant.getSeedsPricePerKgInUah() - secondPlant.getSeedsPricePerKgInUah());
    }
  }

  class PlantsSorterByName implements Comparator<GardenPlant> {
    @Override
    public int compare(GardenPlant firstPlant, GardenPlant secondPlant) {
      return firstPlant.getName().compareTo(secondPlant.getName());
    }
  }

}
