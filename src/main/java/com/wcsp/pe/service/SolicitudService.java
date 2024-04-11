package com.wcsp.pe.service;

import com.wcsp.pe.model.Solicitud;

import java.util.List;

public interface SolicitudService {

  List<Solicitud> findAll();
  void save(Solicitud solicitud);

}
