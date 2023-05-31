package com.kachinga.asms.amcos.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "product_values")
public class ProductValue extends AuditModel {

    @Column(name = "capacity", nullable = false)
    private Double capacity;

    @Column(name = "value", nullable = false)
    private BigDecimal value;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "unit_id", nullable = false)
    private Unit unit;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "storage_id", nullable = false)
    private Storage storage;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "store_keeper_id", nullable = false)
    private User storeKeeper;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "date", nullable = false)
    private LocalDate date;

    @Column(name = "receipt_number", nullable = false, unique = true)
    private String receiptNumber;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    @Enumerated(EnumType.STRING)
    @Column(name = "change_cause", nullable = false)
    private ValueChangeCause changeCause = ValueChangeCause.ORIGINAL_VALUE;
}
