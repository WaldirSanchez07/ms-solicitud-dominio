package com.wcsp.pe.service.impl;

import com.wcsp.pe.model.Solicitud;
import com.wcsp.pe.repository.SolicitudRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static com.wcsp.pe.utils.SolicitudTestUtil.generateSolicitud;
import static com.wcsp.pe.utils.SolicitudTestUtil.generateSolicitudes;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class SolicitudServiceImplTest {

  @InjectMocks
  private SolicitudServiceImpl solicitudServiceImpl;

  @Mock
  private SolicitudRepository solicitudRepository;

  @BeforeEach
  public void init() {
    solicitudServiceImpl = new SolicitudServiceImpl(solicitudRepository);
  }

  @Test
  public void testFindAllSolicitudes() {
    when(solicitudRepository.findAllByOrderByFechaSolicitudDesc()).thenReturn(generateSolicitudes());
    List<Solicitud> solicitudes = solicitudServiceImpl.findAll();

    assertEquals(2, solicitudes.size());
  }

  @Test
  public void testSaveSolicitud() {
    Solicitud solicitud = generateSolicitud();
    doReturn(solicitud).when(solicitudRepository).save(any());
    solicitudServiceImpl.save(solicitud);

    verify(solicitudRepository, times(1)).save(solicitud);
  }

}
