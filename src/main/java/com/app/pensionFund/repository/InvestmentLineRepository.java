package com.app.pensionFund.repository;

import com.app.pensionFund.model.InvestmentLine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InvestmentLineRepository extends JpaRepository<InvestmentLine, Long> {

    @Query(value = "select * from investment_line where id_pension_fund = :id_pension_fund", nativeQuery = true)
    List<InvestmentLine> findByIdPensionFund(@Param("id_pension_fund") Long idPensionFund);
}
