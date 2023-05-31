package com.kachinga.asms.amcos.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "storage_requests")
public class StorageRequest extends AuditModel {
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "warehouse_id", nullable = false)
    private Warehouse warehouse;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    @Column(name = "capacity", nullable = false)
    private Double capacity;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "unit_id", nullable = false)
    private Unit unit;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "farmer_id", nullable = false)
    private User farmer;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "season_id", nullable = false)
    private Season season;

    @Column(name = "approved", nullable = false)
    private Boolean approved;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "time", nullable = false)
    private LocalDateTime time = LocalDateTime.now();
}
