package ua.lviv.iot.plants.writer;

import java.io.IOException;
import java.io.Writer;
import java.util.List;
import ua.lviv.iot.plants.model.GardenPlant;

public class PlantShopWriter {

  private Writer csvWriter;

  public void setCsvWriter(Writer csvWriter) {
    this.csvWriter = csvWriter;
  }

  /**
   * This method writes to file.
   * 
   * @param gardenPlants is a list of plants
   * @throws IOException is a standard exception
   */
  public void writeToFile(List<GardenPlant> gardenPlants) throws IOException {
    for (GardenPlant gardenPlant : gardenPlants) {
      csvWriter.write(gardenPlant.getHeaders());
      csvWriter.write("\n");
      csvWriter.write(gardenPlant.toCsV());
      csvWriter.write("\n");
      csvWriter.flush();
    }
  }
}
