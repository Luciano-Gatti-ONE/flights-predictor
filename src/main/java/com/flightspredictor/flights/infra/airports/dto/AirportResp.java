package com.flightspredictor.flights.infra.airports.dto;

import com.flightspredictor.flights.infra.airports.entity.Airport;

public record AirportResp(
        String airportIata,
        String airportName,
        String country,
        String cityName,

        Float latitude,
        Float longitude,

        Double elevation,
        String timeZone,
        String googleMaps
) {
    public AirportResp(Airport airport) {
        this(
                airport.getAirportIata(),
                airport.getAirportName(),
                airport.getCountry(),
                airport.getCityName(),
                airport.getLatitude(),
                airport.getLongitude(),
                airport.getElevation(),
                airport.getTimeZone(),
                airport.getGoogleMaps()
        );
    }
}
