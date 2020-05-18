package ua.lviv.iot.plants.manager;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.lviv.iot.plants.model.GardenPlant;
import ua.lviv.iot.plants.writer.PlantShopWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.io.StringWriter;

class PlantShopWriterTest extends PlantShopManagerBaseTest {

  @BeforeEach
  public void setUp() {
    supplyAllPlants();
  }

  @Test
  void testOfficeEquipmentWriter() {
    try (Writer csvWriter = new FileWriter(new File("plant.csv"))) {
      PlantShopWriter writer = new PlantShopWriter();
      writer.setCsvWriter(csvWriter);
      writer.writeToFile(flowers);
      writer.writeToFile(vegetables);
      writer.writeToFile(fruits);
    } catch (Exception e) {
      fail("test failed");
    }
  }

  @Test
  public void testProperTextFormatting() {
    try (Writer csvWriter = new StringWriter()) {
      PlantShopWriter writer = new PlantShopWriter();
      writer.setCsvWriter(csvWriter);
      
      writer.writeToFile(flowers);
      writer.writeToFile(vegetables);
      writer.writeToFile(fruits);

      String expectedOutput = "";
      for (GardenPlant flower : flowers) {
        expectedOutput += flower.getHeaders() + "\n" + flower.toCsV() + "\n";
      }
      for (GardenPlant vegetable : vegetables) {
        expectedOutput += vegetable.getHeaders() + "\n" + vegetable.toCsV() + "\n";
      }
      for (GardenPlant fruit : fruits) {
        expectedOutput += fruit.getHeaders() + "\n" + fruit.toCsV() + "\n";
      }
      assertEquals(expectedOutput, csvWriter.toString());
    } catch (Exception e) {
      fail("the test failed unexpected - try to write to the file ");
    }
  }
}
