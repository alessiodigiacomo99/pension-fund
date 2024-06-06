package com.app.pensionFund.repository;

import com.app.pensionFund.model.PensionFund;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PensionFundRepository extends JpaRepository<PensionFund, Long> {

}
