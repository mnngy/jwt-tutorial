package com.example.jwttutorial.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
public class User {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column
    private String username;

    @Column
    private String password;

    @Column
    private String nickname;

    @Column
    private boolean activated;

    @OneToOne(mappedBy = "user")
    private UserAuthority userAuthority;
}
