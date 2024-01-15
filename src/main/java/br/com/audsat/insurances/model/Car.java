package br.com.audsat.insurances.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Car implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String model;

    private String manufactured;

    private String yearModel;

    private Double fipeValue;

    @OneToMany(mappedBy = "car")
    private List<CarDrivers> carrosMotorista = new ArrayList<>();

}
