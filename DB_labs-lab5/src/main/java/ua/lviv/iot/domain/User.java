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
@Table(name = "users", schema = "skyscanner")
public class User {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;
    @Basic
    @Column(name = "full_name")
    private String fullName;
    @Basic
    @Column(name = "email")
    private String email;
    @Basic
    @Column(name = "password")
    private String password;
    @ManyToMany(mappedBy = "passengers")
    @ToString.Exclude
    private List<Flight> flights;


}
