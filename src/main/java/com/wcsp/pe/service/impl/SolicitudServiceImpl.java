package com.wcsp.pe.service.impl;

import com.wcsp.pe.model.Solicitud;
import com.wcsp.pe.repository.SolicitudRepository;
import com.wcsp.pe.service.SolicitudService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class SolicitudServiceImpl implements SolicitudService {

  private final SolicitudRepository solicitudRepository;

  @Override
  public List<Solicitud> findAll() {
    return solicitudRepository.findAllByOrderByFechaSolicitudDesc();
  }

  @Override
  public void save(Solicitud solicitud) {
    solicitudRepository.save(solicitud);
  }

}
