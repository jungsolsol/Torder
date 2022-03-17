package com.example.torder.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class User {

    @Id
    @GeneratedValue
    @Column(name = "user_id")
    private String name;
    private Integer number;
    private Long id;

    @OneToMany(mappedBy = "user")
    private List<Order> orders = new ArrayList<>();
}
