package com.transport.transport.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "GoodsInfo")
public class GoodsInfo extends BaseEntity<Integer>{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "GoodsId",nullable = false)
    private Integer id;


    @ManyToOne
    @JoinColumn(name = "bookingId")
    private BookingDetails bookingId;

    @Column(name = "GoodDescription")
    private String goodDetails;

    @Column(name = "DeliveryStatus")
    private String deliveryStatus;

    @Column(name = "DeliveryDate")
    private Date deliveryDate;

    @Column(name = "PaymentStatus")
    private String paymentStatus;
}
