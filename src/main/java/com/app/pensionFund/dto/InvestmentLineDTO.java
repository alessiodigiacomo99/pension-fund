package com.app.pensionFund.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class InvestmentLineDTO extends PensionFundDTO{

    private String investmentLineName;
}
