package com.transport.transport.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name= "Customer")
public class CustomerDetails extends BaseEntity<Integer>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Integer id;

    @Column(name="CustomerName",nullable = false)
    private String customerName;

    @Column(name="Customer Address")
    private String customerAddress;

    @Column(name="Customer City",nullable = false)
    private String customerCity;

    @Column(name="Customer Mobile-1",nullable = false)
    private String customerMobileOne;

    @Column(name="Customer Mobile-2")
    private String customerMobileTwo;

    @Column(name="Customer Contact-Email")
    private String customerContactEmail;


}
