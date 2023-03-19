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
@Table(name= "BookingDetails")
public class BookingDetails extends BaseEntity<Integer>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "supplierId")
    private SupplierDetails supplierId;

    @ManyToOne
    @JoinColumn(name = "customerId")
    private CustomerDetails customerId;

    @Column(name = "PaymentDetails",nullable = false)
    private long payment;

    @Column(name = "OurIncome")
    private double income;

}
