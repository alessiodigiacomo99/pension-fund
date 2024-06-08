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

    @Column(name = "stock_percentage")
    private Double stockPercentage;

    @Column(name = "bond_percentage")
    private Double bondPercentage;

    @Column(name = "commodity_percentage")
    private Double commodityPercentage;

    @Column(name = "liquidity_percentage")
    private Double liquidityPercentage;

    @Column(name = "other")
    private Double other;

    @ManyToOne
    @JoinColumn(name = "id_pension_fund", referencedColumnName = "id_pension_fund")
    private PensionFund pensionFund;

}

