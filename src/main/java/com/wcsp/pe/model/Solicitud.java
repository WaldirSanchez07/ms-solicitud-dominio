package com.wcsp.pe.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "solicitud_prestamo")
public class Solicitud {

  @Id
  @Column(columnDefinition = "INT")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column(columnDefinition = "VARCHAR(08) NOT NULL")
  private String dni;

  @Column(columnDefinition = "VARCHAR(80) NOT NULL")
  private String nombres;

  @Column(columnDefinition = "VARCHAR(80) NOT NULL")
  private String apellidos;

  @Column(columnDefinition = "VARCHAR(100) NOT NULL")
  private String correo;

  @Column(columnDefinition = "VARCHAR(09) NOT NULL")
  private String celular;

  @Column(columnDefinition = "NUMERIC(10,2) NOT NULL")
  private Double monto;

  @Column(columnDefinition = "VARCHAR(20) NOT NULL DEFAULT 'ENVIADO'")
  private String estado;

  @Column(columnDefinition = "TIMESTAMP NOT NULL")
  private LocalDateTime fechaSolicitud;

}
