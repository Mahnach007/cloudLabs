package ua.lviv.iot.domain;


import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@AllArgsConstructor
@EqualsAndHashCode
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "flights", schema = "skyscanner")
public class Flight {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;
    @ManyToMany
    @JoinTable(name = "bought_tickets", schema = "skyscanner", joinColumns = @JoinColumn(name = "flight_id", referencedColumnName = "id", nullable = false), inverseJoinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false))
    @ToString.Exclude
    private List<User> passengers;


}
