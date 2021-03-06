package org.iata.service;

import org.iata.cargo.model.Event;
import org.iata.model.LogisticsObject;

import java.util.List;

public interface LogisticsObjectsService {

  void addLogisticsObject(LogisticsObject logisticsObject);

  LogisticsObject findById(String id);

  List<LogisticsObject> findByCompanyId(String companyId);

  void updateLogisticsObject(LogisticsObject logisticsObject);

  void addEvent(String loId, Event event);

  List<Event> findEvents(String loId);

}
