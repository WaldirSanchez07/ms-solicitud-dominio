package com.wcsp.pe.repository;

import com.wcsp.pe.model.Solicitud;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SolicitudRepository extends JpaRepository<Solicitud, Integer> {

  List<Solicitud> findAllByOrderByFechaSolicitudDesc();

}
