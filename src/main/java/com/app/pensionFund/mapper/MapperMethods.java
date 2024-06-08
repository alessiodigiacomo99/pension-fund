package com.app.pensionFund.mapper;

import lombok.extern.slf4j.Slf4j;
import org.mapstruct.Named;
import org.springframework.stereotype.Component;

@Component
@Named("mapperMethods")
@Slf4j
public class MapperMethods {

    @Named("formatPercentage")
    public String formatPercentage(Double percentage) {
        if(percentage == null){
            return null;
        }
        return String.format("%.2f %%", percentage);
    }
}
