package com.app.pensionFund.service.impl;

import com.app.pensionFund.model.InvestmentLine;
import com.app.pensionFund.repository.InvestmentLineRepository;
import com.app.pensionFund.service.InvestmentLineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class InvestmentLineServiceImpl implements InvestmentLineService {

    @Autowired
    InvestmentLineRepository investmentLineRepository;


    @Override
    public List<InvestmentLine> findByIdPensionFund(Long idPensionFund) {
        return investmentLineRepository.findByIdPensionFund(idPensionFund);
    }
}
