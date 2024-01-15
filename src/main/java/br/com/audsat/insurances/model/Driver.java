package br.com.audsat.insurances.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Driver implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String document;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate birthdate;

    @OneToMany(mappedBy = "driver")
    private List<CarDrivers> carDrivers = new ArrayList<>();

}