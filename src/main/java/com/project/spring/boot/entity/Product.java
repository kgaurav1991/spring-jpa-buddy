package com.project.spring.boot.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "product")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Product {
    @Id
    private Long id;

    @Column(name = "name")
    private String name;

    private String qty;

    private Long price;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

}