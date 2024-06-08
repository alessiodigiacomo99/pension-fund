package com.app.pensionFund.mapper;

import com.app.pensionFund.dto.InvestmentLineDTO;
import com.app.pensionFund.model.InvestmentLine;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = {MapperMethods.class})
public interface InvestmentLineMapper {

    @Mapping(source = "pensionFund.company.companyName", target="companyName")
    @Mapping(source = "pensionFund.fundName", target="fundName")
    @Mapping(source = "stockPercentage", target="stockPercentage", qualifiedByName = {"mapperMethods", "formatPercentage"})
    @Mapping(source = "bondPercentage", target="bondPercentage", qualifiedByName = {"mapperMethods", "formatPercentage"})
    @Mapping(source = "commodityPercentage", target="commodityPercentage", qualifiedByName = {"mapperMethods", "formatPercentage"})
    @Mapping(source = "liquidityPercentage", target="liquidityPercentage", qualifiedByName = {"mapperMethods", "formatPercentage"})
    @Mapping(source = "other", target="other", qualifiedByName = {"mapperMethods", "formatPercentage"})
    InvestmentLineDTO fromInvestmentLineToInvestmentLineDTO(InvestmentLine investmentLine);

    List<InvestmentLineDTO> fromInvestmentLineListToInvestmentLineDTOList(List<InvestmentLine> investmentLineList);

}
