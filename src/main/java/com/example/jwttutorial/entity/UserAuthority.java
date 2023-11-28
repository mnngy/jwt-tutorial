package com.example.jwttutorial.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
public class UserAuthority {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_authority_id")
    private Long id;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column
    private String authorityName;
}
