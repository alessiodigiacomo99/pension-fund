package com.app.pensionFund.business;

import com.app.pensionFund.dto.PensionFundDTO;
import com.app.pensionFund.service.PensionFundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;

@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class PensionFundBusiness {

    @Autowired
    PensionFundService pensionFundService;

    public List<PensionFundDTO> getAllPensionFunds() {
        PensionFundDTO pensionFundDTO1 = new PensionFundDTO(12L);
        PensionFundDTO pensionFundDTO2 = new PensionFundDTO(13L);
        List<PensionFundDTO> pensionFundDTOList = Arrays.asList(pensionFundDTO1, pensionFundDTO2);
        return pensionFundDTOList;
    }
}
