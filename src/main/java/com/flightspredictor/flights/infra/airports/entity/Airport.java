package com.flightspredictor.flights.infra.airports.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "airports")
@Entity(name = "Airport")

@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")

public class Airport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Abreviasión de tres letras asignadas por la Asociación Internacional de Transporte Aéreo
    private String airportIata;
    private String airportName;
    private String countryName;
    private String cityName;

    private Float longitude;
    private Float latitude;

    // Altura en metros sobre el nivel del mar (msnm)
    private Double elevation;

    // Zona horaria (America/Lima)
    private String timezone;

    // Enlace directo a la ubicación del aeropuerto en google maps
    private String googleMaps;
}
