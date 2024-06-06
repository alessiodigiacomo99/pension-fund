package com.app.pensionFund.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PensionFundDTO {

    private Long idPensionFund;
    private String company;
    private String fundName;
}
