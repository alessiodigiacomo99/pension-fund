package com.app.pensionFund.service;

import com.app.pensionFund.model.InvestmentLine;
import com.app.pensionFund.model.PensionFund;

import java.util.List;

public interface InvestmentLineService {

    List<InvestmentLine> findByIdPensionFund(Long idPensionFund);

}
