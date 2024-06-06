package com.app.pensionFund.mapper;

import com.app.pensionFund.dto.PensionFundDTO;
import com.app.pensionFund.model.PensionFund;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PensionFundMapper {

    PensionFundDTO fromPensionFundToPensionFundDTO(PensionFund pensionFund);

    List<PensionFundDTO> fromPensionFundListToPensionFundDTOList(List<PensionFund> pensionFundList);
}
