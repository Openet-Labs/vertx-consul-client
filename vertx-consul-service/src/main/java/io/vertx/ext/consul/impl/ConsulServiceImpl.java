package io.vertx.ext.consul.impl;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.ext.consul.*;

import java.util.List;

/**
 * @author <a href="mailto:ruslan.sennov@gmail.com">Ruslan Sennov</a>
 */
public class ConsulServiceImpl implements ConsulService {

  private final ConsulClient consulClient;

  public ConsulServiceImpl(ConsulClient consulClient) {
    this.consulClient = consulClient;
  }

  @Override
  public ConsulService getValue(String key, Handler<AsyncResult<KeyValue>> resultHandler) {
    consulClient.getValue(key, resultHandler);
    return this;
  }

  @Override
  public ConsulService deleteValue(String key, Handler<AsyncResult<Void>> resultHandler) {
    consulClient.deleteValue(key, resultHandler);
    return this;
  }

  @Override
  public ConsulService getValues(String keyPrefix, Handler<AsyncResult<List<KeyValue>>> resultHandler) {
    consulClient.getValues(keyPrefix, resultHandler);
    return this;
  }

  @Override
  public ConsulService deleteValues(String keyPrefix, Handler<AsyncResult<Void>> resultHandler) {
    consulClient.deleteValues(keyPrefix, resultHandler);
    return this;
  }

  @Override
  public ConsulService putValue(String key, String value, Handler<AsyncResult<Boolean>> resultHandler) {
    consulClient.putValue(key, value, resultHandler);
    return this;
  }

  @Override
  public ConsulService putValueWithOptions(String key, String value, KeyValueOptions options, Handler<AsyncResult<Boolean>> resultHandler) {
    consulClient.putValueWithOptions(key, value, options, resultHandler);
    return this;
  }

  @Override
  public ConsulService createAclToken(AclToken aclToken, Handler<AsyncResult<String>> idHandler) {
    consulClient.createAclToken(aclToken, idHandler);
    return this;
  }

  @Override
  public ConsulService updateAclToken(AclToken token, Handler<AsyncResult<String>> idHandler) {
    consulClient.updateAclToken(token, idHandler);
    return this;
  }

  @Override
  public ConsulService cloneAclToken(String id, Handler<AsyncResult<String>> idHandler) {
    consulClient.cloneAclToken(id, idHandler);
    return this;
  }

  @Override
  public ConsulService listAclTokens(Handler<AsyncResult<List<AclToken>>> resultHandler) {
    consulClient.listAclTokens(resultHandler);
    return this;
  }

  @Override
  public ConsulService infoAclToken(String id, Handler<AsyncResult<AclToken>> tokenHandler) {
    consulClient.infoAclToken(id, tokenHandler);
    return this;
  }

  @Override
  public ConsulService destroyAclToken(String id, Handler<AsyncResult<Void>> resultHandler) {
    consulClient.destroyAclToken(id, resultHandler);
    return this;
  }

  @Override
  public ConsulService fireEvent(String name, Handler<AsyncResult<Event>> resultHandler) {
    consulClient.fireEvent(name, resultHandler);
    return this;
  }

  @Override
  public ConsulService fireEventWithOptions(String name, EventOptions options, Handler<AsyncResult<Event>> resultHandler) {
    consulClient.fireEventWithOptions(name, options, resultHandler);
    return this;
  }

  @Override
  public ConsulService listEvents(Handler<AsyncResult<List<Event>>> resultHandler) {
    consulClient.listEvents(resultHandler);
    return this;
  }

  @Override
  public ConsulService registerService(ServiceOptions service, Handler<AsyncResult<Void>> resultHandler) {
    consulClient.registerService(service, resultHandler);
    return this;
  }

  @Override
  public ConsulService maintenanceService(MaintenanceOptions maintenanceOptions, Handler<AsyncResult<Void>> resultHandler) {
    consulClient.maintenanceService(maintenanceOptions, resultHandler);
    return this;
  }

  @Override
  public ConsulService deregisterService(String id, Handler<AsyncResult<Void>> resultHandler) {
    consulClient.deregisterService(id, resultHandler);
    return this;
  }

  @Override
  public ConsulService catalogServiceNodes(String service, Handler<AsyncResult<List<Service>>> resultHandler) {
    consulClient.catalogServiceNodes(service, resultHandler);
    return this;
  }

  @Override
  public ConsulService catalogDatacenters(Handler<AsyncResult<List<String>>> resultHandler) {
    consulClient.catalogDatacenters(resultHandler);
    return this;
  }

  @Override
  public ConsulService catalogNodes(Handler<AsyncResult<List<Node>>> resultHandler) {
    consulClient.catalogNodes(resultHandler);
    return this;
  }

  @Override
  public ConsulService catalogServices(Handler<AsyncResult<List<Service>>> resultHandler) {
    consulClient.catalogServices(resultHandler);
    return this;
  }

  @Override
  public ConsulService localChecks(Handler<AsyncResult<List<CheckInfo>>> resultHandler) {
    consulClient.localChecks(resultHandler);
    return this;
  }

  @Override
  public ConsulService registerCheck(CheckOptions check, Handler<AsyncResult<Void>> resultHandler) {
    consulClient.registerCheck(check, resultHandler);
    return this;
  }

  @Override
  public ConsulService deregisterCheck(String id, Handler<AsyncResult<Void>> resultHandler) {
    consulClient.deregisterCheck(id, resultHandler);
    return this;
  }

  @Override
  public ConsulService passCheck(CheckOptions check, Handler<AsyncResult<Void>> resultHandler) {
    consulClient.passCheck(check, resultHandler);
    return this;
  }

  @Override
  public ConsulService warnCheck(CheckOptions check, Handler<AsyncResult<Void>> resultHandler) {
    consulClient.warnCheck(check, resultHandler);
    return this;
  }

  @Override
  public ConsulService failCheck(CheckOptions check, Handler<AsyncResult<Void>> resultHandler) {
    consulClient.failCheck(check, resultHandler);
    return this;
  }

  @Override
  public ConsulService updateCheck(CheckInfo checkInfo, Handler<AsyncResult<Void>> resultHandler) {
    consulClient.updateCheck(checkInfo, resultHandler);
    return this;
  }

  @Override
  public ConsulService leaderStatus(Handler<AsyncResult<String>> resultHandler) {
    consulClient.leaderStatus(resultHandler);
    return this;
  }

  @Override
  public ConsulService peersStatus(Handler<AsyncResult<List<String>>> resultHandler) {
    consulClient.peersStatus(resultHandler);
    return this;
  }

  @Override
  public ConsulService createSession(Handler<AsyncResult<String>> idHandler) {
    consulClient.createSession(idHandler);
    return this;
  }

  @Override
  public ConsulService createSessionWithOptions(SessionOptions options, Handler<AsyncResult<String>> idHandler) {
    consulClient.createSessionWithOptions(options, idHandler);
    return this;
  }

  @Override
  public ConsulService infoSession(String id, Handler<AsyncResult<Session>> resultHandler) {
    consulClient.infoSession(id, resultHandler);
    return this;
  }

  @Override
  public ConsulService renewSession(String id, Handler<AsyncResult<Session>> resultHandler) {
    consulClient.renewSession(id, resultHandler);
    return this;
  }

  @Override
  public ConsulService listSessions(Handler<AsyncResult<List<Session>>> resultHandler) {
    consulClient.listSessions(resultHandler);
    return this;
  }

  @Override
  public ConsulService listNodeSessions(String nodeId, Handler<AsyncResult<List<Session>>> resultHandler) {
    consulClient.listNodeSessions(nodeId, resultHandler);
    return this;
  }

  @Override
  public ConsulService destroySession(String id, Handler<AsyncResult<Void>> resultHandler) {
    consulClient.destroySession(id, resultHandler);
    return this;
  }

  @Override
  public ConsulService localServices(Handler<AsyncResult<List<Service>>> resultHandler) {
    consulClient.localServices(resultHandler);
    return this;
  }

  @Override
  public ConsulService catalogNodeServices(String node, Handler<AsyncResult<List<Service>>> resultHandler) {
    consulClient.catalogNodeServices(node, resultHandler);
    return this;
  }

  @Override
  public void close() {
    consulClient.close();
  }
}
