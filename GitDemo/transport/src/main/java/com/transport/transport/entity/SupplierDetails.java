package com.transport.transport.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name= "Supplier")
@Component
public class SupplierDetails extends BaseEntity<Integer> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Integer id;

    @Column(name="SupplierName",nullable = false)
    private String supplierName;

    @Column(name="SupplierAddress")
    private String supplierAddress;

    @Column(name="SupplierCity",nullable = false)
    private String supplierCity;

    @Column(name="CommissionPercentage",nullable = false)
    private String ourCommission;

    @Column(name="SupplierMobile-1",nullable = false)
    private String supplierMobileOne;

    @Column(name="SupplierMobile-2")
    private String supplierMobileTwo;

    @Column(name="SupplierContact-Email")
    private String supplierContactEmail;

    @OneToMany
    private List<BookingDetails> bookingDetailsList = new ArrayList<>();

}
