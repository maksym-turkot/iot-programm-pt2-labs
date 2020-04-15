package ua.lviv.iot.plants.manager;

import java.util.LinkedList;
import java.util.List;
import ua.lviv.iot.plants.model.GardenPlant;
import ua.lviv.iot.plants.model.PlantingSeason;

public class PlantShopManager {

  private List<GardenPlant> plants = new LinkedList<>();

  public void addPlants(List<GardenPlant> plants) {
    this.plants.addAll(plants);
  }

  public void addPlant(GardenPlant plants) {
    this.plants.add(plants);
  }

  /**
   * Checkstyle-recommended Javadoc comment.
   * Plants search by planting season.
   * 
   * @param plantingSeason is the search parameter
   * @return
   */
  public List<GardenPlant> findPlantsBy(PlantingSeason plantingSeason) {

    LinkedList<GardenPlant> result = new LinkedList<>();

    for (GardenPlant plant : plants) {
      if (plant.getPlantingSeason() == plantingSeason) {
        result.add(plant);
      }
    }
    return result;
  }
<<<<<<< Updated upstream
}
=======
}
>>>>>>> Stashed changes
