/*
 * Copyright (c) 2016 The original author or authors
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Apache License v2.0 which accompanies this distribution.
 *
 *      The Eclipse Public License is available at
 *      http://www.eclipse.org/legal/epl-v10.html
 *
 *      The Apache License v2.0 is available at
 *      http://www.opensource.org/licenses/apache2.0.php
 *
 * You may elect to redistribute this code under either of these licenses.
 */
package io.vertx.ext.consul;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.core.json.JsonObject;

import java.util.Map;
import java.util.Objects;

/**
 * @author <a href="mailto:ruslan.sennov@gmail.com">Ruslan Sennov</a>
 */
@DataObject(generateConverter = true)
public class Node {

  private String id;
  private String node;
  private String address;
  private Map<String, String> taggedAddresses;
  private String datacenter;
  private Map<String, String> nodeMeta;

  /**
   * Default constructor
   */
  public Node() {}

  /**
   * Copy constructor
   *
   * @param other the one to copy
   */
  public Node(Node other) {
    this.id = other.id;
    this.node = other.node;
    this.address = other.address;
    this.taggedAddresses = other.taggedAddresses;
    this.datacenter = other.datacenter;
    this.nodeMeta = other.nodeMeta;
  }

  /**
   * Constructor from JSON
   *
   * @param json the JSON
   */
  public Node(JsonObject json) {
    NodeConverter.fromJson(json, this);
  }

  /**
   * Convert to JSON
   *
   * @return the JSON
   */
  public JsonObject toJson() {
    JsonObject jsonObject = new JsonObject();
    NodeConverter.toJson(this, jsonObject);
    return jsonObject;
  }

  /**
   * Get node id
   *
   * @return node id
   */
  public String getId() {
    return id;
  }

  /**
   * Get node name
   *
   * @return node name
   */
  public String getName() {
    return node;
  }

  /**
   * Get node address
   *
   * @return node address
   */
  public String getAddress() {
    return address;
  }

  /**
   * Get node tagged addresses
   *
   * @return node tagged addresses
   */
  public Map<String, String> getTaggedAddresses() {
    return taggedAddresses;
  }

  /**
   * Get node datacenter
   *
   * @return node datacenter
   */
  public String getDatacenter() { return datacenter; }

  /**
   * Get node meta
   *
   * @return node meta
   */
  public Map<String, String> getNodeMeta() {
    return nodeMeta;
  }

  /**
   * Set node id
   *
   * @param id node id
   * @return reference to this, for fluency
   */
  public Node setId(String id) {
    this.id = id;
    return this;
  }

  /**
   * Set node name
   *
   * @param node node name
   * @return reference to this, for fluency
   */
  public Node setName(String node) {
    this.node = node;
    return this;
  }

  /**
   * Set node address
   *
   * @param address node address
   * @return reference to this, for fluency
   */
  public Node setAddress(String address) {
    this.address = address;
    return this;
  }

  /**
   * Set node tagged addresses
   *
   * @param taggedAddresses node tagged addresses
   * @return reference to this, for fluency
   */
  public Node setTaggedAddresses(Map<String, String> taggedAddresses) {
    this.taggedAddresses = taggedAddresses;
    return this;
  }

  /**
   * Set node datacenter
   *
   * @param datacenter node datacenter
   * @return reference to this, for fluency
   */
  public Node setDatacenter(String datacenter) {
    this.datacenter = datacenter;
    return this;
  }

  /**
   * Set node meta
   *
   * @param nodeMeta node nodeMeta
   * @return reference to this, for fluency
   */
  public Node setNodeMeta(Map<String, String> nodeMeta) {
    this.nodeMeta = nodeMeta;
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Node node1 = (Node) o;

    if (!Objects.equals(id, node1.id)) return false;
    if (!Objects.equals(node, node1.node)) return false;
    if (!Objects.equals(address, node1.address)) return false;
    if (!Objects.equals(taggedAddresses, node1.taggedAddresses)) return false;
    if (!Objects.equals(datacenter, node1.datacenter)) return false;
    return Objects.equals(nodeMeta, node1.nodeMeta);
  }

  @Override
  public int hashCode() {
    int result = id != null ? id.hashCode() : 0;
    result = 31 * result + (node != null ? node.hashCode() : 0);
    result = 31 * result + (address != null ? address.hashCode() : 0);
    result = 31 * result + (taggedAddresses != null ? taggedAddresses.hashCode() : 0);
    result = 31 * result + (datacenter != null ? datacenter.hashCode() : 0);
    result = 31 * result + (nodeMeta != null ? nodeMeta.hashCode() : 0);
    return result;
  }
}
