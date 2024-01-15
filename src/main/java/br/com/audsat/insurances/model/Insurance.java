package br.com.audsat.insurances.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.cglib.core.Local;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Insurance implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate creationId = LocalDate.now();

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate updatedId = LocalDate.now();

    @ManyToOne
    @JoinColumn(name = "car_id")
    private Car car;

    private Boolean isActive;
}
