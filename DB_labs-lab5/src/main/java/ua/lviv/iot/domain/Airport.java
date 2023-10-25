package ua.lviv.iot.domain;

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
@Table(name = "airports", schema = "skyscanner")
public class Airport {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;
    @Basic
    @Column(name = "name")
    private String name;


}
