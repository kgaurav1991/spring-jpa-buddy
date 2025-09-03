package com.project.spring.boot.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Data
@Table(name = "product")
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