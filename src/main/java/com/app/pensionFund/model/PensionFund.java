package com.app.pensionFund.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class PensionFund {

    @Id
    @Column(name = "id_pension_fund", nullable = false, unique = true)
    private Long idPensionFund;

    @Column(name = "company", nullable = false)
    private String company;

    @Column(name = "fund_name", nullable = false)
    private String fundName;
}

