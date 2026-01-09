package com.flightspredictor.flights.infra.airports.controller;

import com.flightspredictor.flights.infra.airports.dto.AirportData;
import com.flightspredictor.flights.infra.airports.dto.AirportResp;
import com.flightspredictor.flights.infra.airports.entity.Airport;
import com.flightspredictor.flights.infra.airports.repository.AirportRepository;
import com.flightspredictor.flights.infra.airports.service.AirportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/airports")
@RestController
public class AirportController {

    @Autowired
    private AirportRepository airportRepository;

    private final AirportService airportService;

    public AirportController(AirportService airportService) {
        this.airportService = airportService;
    }

    @GetMapping("/{iata}")
    public ResponseEntity<AirportResp> getAirport (@PathVariable String iata) {
        var airport = airportService.getAirport(iata);

        return ResponseEntity.ok(new AirportResp(airport));
    }
}
