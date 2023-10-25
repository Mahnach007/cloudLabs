package ua.lviv.iot.domain;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;

@AllArgsConstructor
@EqualsAndHashCode
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "planes", schema = "skyscanner")
public class Plane {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "airline_id", referencedColumnName = "id", nullable = false)
    @JsonIgnore
    private Airline airline;
    @Basic
    @Column(name = "max_passengers")
    private Integer maxPassengers;

    
}
