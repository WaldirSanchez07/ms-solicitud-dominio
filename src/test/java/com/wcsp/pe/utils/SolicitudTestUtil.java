package com.wcsp.pe.utils;

import com.wcsp.pe.model.Solicitud;

import java.time.LocalDateTime;
import java.util.List;

public class SolicitudTestUtil {

  public static List<Solicitud> generateSolicitudes() {
    Solicitud solicitud1 = Solicitud.builder()
            .id(1)
            .dni("80706021")
            .nombres("Juan")
            .apellidos("Soto Castro")
            .correo("jsoto@gmail.com")
            .celular("987654321")
            .monto(15000.00)
            .estado("ENVIADO")
            .fechaSolicitud(LocalDateTime.now())
            .build();

    Solicitud solicitud2 = Solicitud.builder()
            .id(1)
            .dni("70706022")
            .nombres("Jose")
            .apellidos("Castro Soto")
            .correo("jcastro@gmail.com")
            .celular("999888777")
            .monto(15000.00)
            .estado("ENVIADO")
            .fechaSolicitud(LocalDateTime.now())
            .build();

    return List.of(solicitud1, solicitud2);
  }

  public static Solicitud generateSolicitud() {
    return Solicitud.builder()
            .id(1)
            .dni("80706021")
            .nombres("Juan")
            .apellidos("Soto Castro")
            .correo("jsoto@gmail.com")
            .celular("987654321")
            .monto(15000.00)
            .estado("ENVIADO")
            .fechaSolicitud(LocalDateTime.now())
            .build();
  }

}
