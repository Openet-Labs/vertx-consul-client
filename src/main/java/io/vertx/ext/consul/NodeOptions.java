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

import java.util.List;
import java.util.Map;

/**
 * Options used to register service in catalog.
 *
 * @author <a href="mailto:michalm@openet.com">Michal Michalowski</a>
 */
@DataObject(generateConverter = true)
public class NodeOptions {

	private String id;
	private String node;
	private String address;
	private String datacenter;
	private Map<String, String> taggedAddresses;
	private Map<String, String> nodeMeta;
	private ServiceOptions serviceOptions;
	private CheckOptions checkOptions;

	/**
	 * Default constructor
	 */
	public NodeOptions() {
	}

	/**
	 * Copy constructor
	 *
	 * @param options the one to copy
	 */
	public NodeOptions(NodeOptions options) {
		this.id = options.id;
		this.node = options.node;
		this.address = options.address;
		this.datacenter = options.datacenter;
		this.taggedAddresses = options.taggedAddresses;
		this.nodeMeta = options.nodeMeta;
		this.serviceOptions = options.serviceOptions;
		this.checkOptions = options.checkOptions;
	}

	/**
	 * Constructor from JSON
	 *
	 * @param options the JSON
	 */
	public NodeOptions(JsonObject options) {
		NodeOptionsConverter.fromJson(options, this);
	}

	/**
	 * Convert to JSON
	 *
	 * @return the JSON
	 */
	public JsonObject toJson() {
		JsonObject jsonObject = new JsonObject();
		NodeOptionsConverter.toJson(this, jsonObject);
		return jsonObject;
	}

	/**
	 * Get the ID of session
	 *
	 * @return the ID of session
	 */
	public String getId() {
		return id;
	}

	/**
	 * Set the ID of session
	 *
	 * @param id the ID of session
	 * @return reference to this, for fluency
	 */
	public NodeOptions setId(String id) {
		this.id = id;
		return this;
	}

	public String getNode() {
		return node;
	}

	public NodeOptions setNode(String node) {
		this.node = node;
		return this;
	}

	public String getAddress() {
		return address;
	}

	public NodeOptions setAddress(String address) {
		this.address = address;
		return this;
	}

	public String getDatacenter() {
		return datacenter;
	}

	public NodeOptions setDatacenter(String datacenter) {
		this.datacenter = datacenter;
		return this;
	}

	public Map<String, String> getTaggedAddresses() {
		return taggedAddresses;
	}

	public NodeOptions setTaggedAddresses(Map<String, String> taggedAddresses) {
		this.taggedAddresses = taggedAddresses;
		return this;
	}

	public Map<String, String> getNodeMeta() {
		return nodeMeta;
	}

	public NodeOptions setNodeMeta(Map<String, String> nodeMeta) {
		this.nodeMeta = nodeMeta;
		return this;
	}

	public ServiceOptions getServiceOptions() {
		return serviceOptions;
	}

	public NodeOptions setServiceOptions(ServiceOptions serviceOptions) {
		this.serviceOptions = serviceOptions;
		return this;
	}

	public CheckOptions getCheckOptions() {
		return checkOptions;
	}

	public NodeOptions setCheckOptions(CheckOptions checkOptions) {
		this.checkOptions = checkOptions;
		return this;
	}

}
