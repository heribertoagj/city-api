package com.dio.heribertoagj.cities.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.math.BigInteger;

@Getter
@Setter
@Builder
@Entity(name = "pais")
@Table(name = "pais")
@AllArgsConstructor
@NoArgsConstructor
public class Country {

    @Id
    private BigInteger id;

    @Column(name = "nome")
    @NotEmpty(message = "Name is required")
    @Size(max = 60)
    private String name;

    @Column(name = "nome_pt")
    @Size(max = 60)
    private String namePt;

    @Column(name = "sigla")
    @Size(max = 2)
    @NotEmpty(message = "Initials is required")
    private String initials;

    @Column(name = "bacen")
    private Integer centalBank;
}
