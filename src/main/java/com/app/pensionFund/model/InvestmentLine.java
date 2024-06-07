package com.app.pensionFund.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class InvestmentLine {

    @Id
    @Column(name = "id_investment_line", nullable = false, unique = true)
    private Long idInvestmentLine;

    @Column(name = "investment_line_name", nullable = false)
    private String investmentLineName;

    @ManyToOne
    @JoinColumn(name = "id_pension_fund", referencedColumnName = "id_pension_fund")
    private PensionFund pensionFund;

}

