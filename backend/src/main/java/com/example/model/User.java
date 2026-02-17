package com.example.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.validation.constraints.Size;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    @Size(min=3, max=50)
    @NotNull
    private String name;

    @Column
    @Size(min=3, max=50)
    @NotNull
    private String password;

    @JsonManagedReference
    @OneToOne(cascade= CascadeType.ALL, mappedBy = "user", optional = false)
    @NotNull
    private Cart cart;
}
