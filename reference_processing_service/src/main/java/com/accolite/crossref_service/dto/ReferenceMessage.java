package com.accolite.crossref_service.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class ReferenceMessage {

    private String cusipId;
    private String countryCode;
    private String description;
    private String isin;
    private BigDecimal lotSize;
    private String action;
}