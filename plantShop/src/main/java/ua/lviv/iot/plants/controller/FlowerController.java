package ua.lviv.iot.plants.controller;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.plants.model.Flower;

@RequestMapping("/flowers")
@RestController
public class FlowerController {

  private Map<Integer, Flower> flowers = new HashMap<>();

  private AtomicInteger idCounter = new AtomicInteger();

  @GetMapping
  public List<Flower> getFLowers() {
    return new LinkedList<Flower>(flowers.values());
  }

  @GetMapping(path = {"/{id}"})
  public ResponseEntity<Flower> getFlower(final @PathVariable("id") Integer flowerId) {

    Flower flower;
    ResponseEntity<Flower> status = (flower = flowers.get(flowerId)) == null
        ? new ResponseEntity<>(HttpStatus.NOT_FOUND)
        : new ResponseEntity<>(flower, HttpStatus.OK);
    return status;

  }

  @PostMapping
  public Flower createFlower(final @RequestBody Flower flower) {
    flower.setId(idCounter.incrementAndGet());
    flowers.put(flower.getId(), flower);
    return flower;
  }

  @DeleteMapping(path = {"/{id}"})
  public ResponseEntity<Flower> deleteFlower(@PathVariable("id") Integer flowerId) {
    HttpStatus status = flowers.remove(flowerId) == null ? HttpStatus.NOT_FOUND : HttpStatus.OK;

    return ResponseEntity.status(status).build();
  }

  @PutMapping(path = {"/{id}"})
  public ResponseEntity<Flower> updateFlower(final @PathVariable("id") Integer flowerId,
                                           final @RequestBody Flower flower) {
    flower.setId(flowerId);
    Flower oldFlower = flowers.replace(flowerId, flower);
    ResponseEntity<Flower> status = oldFlower == null
        ? new ResponseEntity<Flower>(HttpStatus.NOT_FOUND)
        : new ResponseEntity<Flower>(oldFlower, HttpStatus.OK);
    return status;
  }

}
