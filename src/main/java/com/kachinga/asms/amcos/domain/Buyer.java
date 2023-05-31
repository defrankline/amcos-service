package com.kachinga.asms.amcos.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "buyers")
public class Buyer extends AuditModel {
    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "mobile", nullable = false)
    private String mobile;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "company_id", nullable = false)
    private Long companyId;

    @Column(name = "account_id", nullable = false)
    private Long accountId;

    @Column(name = "ward_id", nullable = false)
    private Long wardId;
}
