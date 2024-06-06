package com.app.pensionFund.service.impl;

import com.app.pensionFund.model.PensionFund;
import com.app.pensionFund.repository.PensionFundRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.app.pensionFund.service.PensionFundService;

import java.util.List;

@Service
@Transactional
public class PensionFundServiceImpl implements PensionFundService {

    @Autowired
    PensionFundRepository pensionFundRepository;

    @Override
    public List<PensionFund> findAll() {
        return pensionFundRepository.findAll();
    }
}
