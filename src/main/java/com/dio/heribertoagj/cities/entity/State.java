package com.dio.heribertoagj.cities.entity;

import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import lombok.*;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.List;

@Getter
@Setter
@Builder
@Entity(name = "estado")
@Table(name = "estado")
@TypeDefs({
        @TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
})
@AllArgsConstructor
@NoArgsConstructor
public class State {
    @Id
    private BigInteger id;

    @Column(name = "nome")
    private String name;

    @Column(name = "uf")
    private String initials;

    @Column
    private BigInteger ibge;

    @ManyToOne
    @JoinColumn(name = "pais", referencedColumnName = "id")
    private Country country;

    @Type(type = "jsonb")
    @Basic( fetch = FetchType.LAZY)
    @Column(columnDefinition = "jsonb")
    private List<Integer> ddd;
}
