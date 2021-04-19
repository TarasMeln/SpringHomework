package com.taras.exhibition.service.dto;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;

@Data
@Builder
public class ExhibitionDto {
    @NotNull
    private String theme;
    @NotNull
    @Min(1)
    private long hall;
    @NotNull
    private Timestamp date;
    @NotNull
    private double ticketPrice;
}
