package com.softserve.farmservice.entity;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Culture")
public class Culture {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "CULTURE_NAME", length = 50, nullable = false, unique = false)
    @Size(min = 2, message = "Name should have at least 2 characters")
    private String name;
}
