package com.wcsp.pe.controller;

import com.wcsp.pe.dto.response.ResponseDto;
import com.wcsp.pe.model.Solicitud;
import com.wcsp.pe.service.SolicitudService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/solicitud-dominio")
public class SolicitudDominioController {

  private final SolicitudService solicitudService;

  @PostMapping(value = "save")
  public void saveSolicitud(@RequestBody Solicitud solicitud) {
    solicitudService.save(solicitud);
  }

  @GetMapping(value = "list")
  public ResponseEntity<ResponseDto> listSolicitudes() {
    return ResponseEntity.ok(ResponseDto.builder()
            .statusCode(HttpStatus.OK.value())
            .data(solicitudService.findAll())
            .build());
  }

}
