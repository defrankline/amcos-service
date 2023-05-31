package com.kachinga.asms.amcos.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;


@Setter
@Getter
@MappedSuperclass
public abstract class AuditModel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial")
    private Long id;

    @Basic(optional = false)
    @Column(name = "active", nullable = false)
    private boolean active = true;
}