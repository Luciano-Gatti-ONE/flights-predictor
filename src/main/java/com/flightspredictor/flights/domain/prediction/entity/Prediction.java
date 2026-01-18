package com.flightspredictor.flights.domain.prediction.entity;

import com.flightspredictor.flights.domain.prediction.enums.Prevision;
import com.flightspredictor.flights.domain.prediction.enums.Status;
import com.flightspredictor.flights.domain.requests.dto.ModelPredictionResponse;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "response")
@Entity(name = "Prediction")

@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")

public class Prediction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private Prevision prevision;

    private Double probability;

    @Enumerated(EnumType.STRING)
    private Status status;

    @OneToOne
    @JoinColumn(name = "request_id", nullable = false, unique = true)
    private Request requests;

    @Column(name = "resultado_real")
    private String resultadoReal;

    public Prediction(ModelPredictionResponse data) {
        this.id = null;
        this.prevision = data.prevision();
        this.probability = data.probability();
        this.status = data.status();
    }
    public void setResultadoReal(String resultadoReal) {
    this.resultadoReal = resultadoReal;
}
}
