package com.libreria.libreria_api.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import static org.springframework.data.jpa.domain.AbstractPersistable_.id;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Libro {
            @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
            private Long id;


            @Column(nullable = false)
            private String titulo;

            @Column(nullable = false)
            private String autor;

            @Column(nullable = false)
            private Double precio;

            private Integer stock;

}
