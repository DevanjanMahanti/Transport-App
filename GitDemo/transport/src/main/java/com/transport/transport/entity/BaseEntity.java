package com.transport.transport.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public abstract class BaseEntity<ID>{


    @Column(name = "createdDate",nullable = false)
    private Date createdWhen;
    @Column(name = "modifiedDate",nullable = false)
    private Date modifyWhen;

    public abstract ID getId();
    public abstract void setId(ID id);



}
