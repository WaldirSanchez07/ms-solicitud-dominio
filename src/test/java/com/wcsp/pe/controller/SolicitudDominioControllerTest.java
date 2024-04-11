package com.wcsp.pe.controller;

import com.wcsp.pe.dto.response.ResponseDto;
import com.wcsp.pe.model.Solicitud;
import com.wcsp.pe.service.SolicitudService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static com.wcsp.pe.utils.SolicitudTestUtil.generateSolicitud;
import static com.wcsp.pe.utils.SolicitudTestUtil.generateSolicitudes;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class SolicitudDominioControllerTest {

  @InjectMocks
  private SolicitudDominioController solicitudDominioController;

  @Mock
  private SolicitudService solicitudService;

  @BeforeEach
  public void init() {
    solicitudDominioController = new SolicitudDominioController(solicitudService);
  }

  @Test
  public void testSaveSolicitud() {
    Solicitud solicitud = generateSolicitud();
    doNothing().when(solicitudService).save(any());
    solicitudDominioController.saveSolicitud(solicitud);

    verify(solicitudService).save(solicitud);
  }

  @Test
  public void testListSolicitud() {
    when(solicitudService.findAll()).thenReturn(generateSolicitudes());
    ResponseEntity<ResponseDto> response = solicitudDominioController.listSolicitudes();

    assertEquals(HttpStatus.OK, response.getStatusCode());
  }

}
