package com.app.pensionFund.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Company {

    @Id
    @Column(name = "id_company", nullable = false, unique = true)
    private Long idCompany;

    @Column(name = "company_name", nullable = false)
    private String companyName;

}

