package com.example.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    @Size(max = 150)
    @NotNull
    private String name;

    @Column
    @Size(max = 150)
    private String description;

    @Column
    @PositiveOrZero
    private float price;

    @ManyToMany(mappedBy = "products")
    private Set<Cart> carts = new HashSet<>();
}
