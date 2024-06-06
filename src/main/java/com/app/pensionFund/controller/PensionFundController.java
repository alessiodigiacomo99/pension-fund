package com.app.pensionFund.controller;

import com.app.pensionFund.business.PensionFundBusiness;
import com.app.pensionFund.dto.PensionFundDTO;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pension-fund")
@CrossOrigin
@Tag(name = "PensionFundController")
public class PensionFundController {

    @Autowired
    PensionFundBusiness pensionFundBusiness;


    @GetMapping(path = "/get-all", produces = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity<List<PensionFundDTO>> getAllPensionFunds() throws Exception {
        return ResponseEntity.ok(pensionFundBusiness.getAllPensionFunds());
    }
}
