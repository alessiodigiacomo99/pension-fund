package com.app.pensionFund.business;

import com.app.pensionFund.dto.InvestmentLineDTO;
import com.app.pensionFund.dto.PensionFundDTO;
import com.app.pensionFund.mapper.InvestmentLineMapper;
import com.app.pensionFund.mapper.PensionFundMapper;
import com.app.pensionFund.model.InvestmentLine;
import com.app.pensionFund.model.PensionFund;
import com.app.pensionFund.service.InvestmentLineService;
import com.app.pensionFund.service.PensionFundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class PensionFundBusiness {

    @Autowired
    PensionFundService pensionFundService;

    @Autowired
    PensionFundMapper pensionFundMapper;

    @Autowired
    InvestmentLineService investmentLineService;

    @Autowired
    InvestmentLineMapper investmentLineMapper;

    public List<PensionFundDTO> getAllPensionFunds() {
        List<PensionFund> pensionFundList = pensionFundService.findAll();
        return pensionFundMapper.fromPensionFundListToPensionFundDTOList(pensionFundList);
    }

    public List<InvestmentLineDTO> getInvestmentLineByPensionFund(Long idPensionFund) {
        List<InvestmentLine> investmentLineList =investmentLineService.findByIdPensionFund(idPensionFund);
        return investmentLineMapper.fromInvestmentLineListToInvestmentLineDTOList(investmentLineList);
    }
}
