package com.accolite.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ParsedRecord  {
    private String cusipId;
    private String countryCode;
    private String description;
    private String isin;
    private double lotSize;
    private String indicator;
}
