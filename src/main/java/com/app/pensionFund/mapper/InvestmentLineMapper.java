package com.app.pensionFund.mapper;

import com.app.pensionFund.dto.InvestmentLineDTO;
import com.app.pensionFund.model.InvestmentLine;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface InvestmentLineMapper {

    @Mapping(source = "pensionFund.company.companyName", target="companyName")
    @Mapping(source = "pensionFund.fundName", target="fundName")
    InvestmentLineDTO fromInvestmentLineToInvestmentLineDTO(InvestmentLine investmentLine);

    List<InvestmentLineDTO> fromInvestmentLineListToInvestmentLineDTOList(List<InvestmentLine> investmentLineList);

}
