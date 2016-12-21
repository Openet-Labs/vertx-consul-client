package io.vertx.ext.consul;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.core.json.JsonObject;

import java.util.List;

/**
 * @author <a href="mailto:ruslan.sennov@gmail.com">Ruslan Sennov</a>
 */
@DataObject(generateConverter = true)
public class EventList {

  private long index;
  private List<Event> list;

  /**
   * Default constructor
   */
  public EventList() {}

  /**
   * Constructor from JSON
   *
   * @param json the JSON
   */
  public EventList(JsonObject json) {
    EventListConverter.fromJson(json, this);
  }

  /**
   * Convert to JSON
   *
   * @return the JSON
   */
  public JsonObject toJson() {
    JsonObject jsonObject = new JsonObject();
    EventListConverter.toJson(this, jsonObject);
    return jsonObject;
  }

  /**
   * Get Consul index
   *
   * @return the consul index
   */
  public long getIndex() {
    return index;
  }

  /**
   * Set Consul index, a unique identifier representing the current state of the requested events
   *
   * @param index the consul index
   * @return reference to this, for fluency
   */
  public EventList setIndex(long index) {
    this.index = index;
    return this;
  }

  /**
   * Get list of events
   *
   * @return the list of events
   */
  public List<Event> getList() {
    return list;
  }

  /**
   * Set list of events
   *
   * @param list the list of events
   * @return reference to this, for fluency
   */
  public EventList setList(List<Event> list) {
    this.list = list;
    return this;
  }
}
