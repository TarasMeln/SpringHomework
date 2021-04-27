package com.taras.exhibition.service.model;

import lombok.Builder;
import lombok.Data;

import java.sql.Timestamp;

@Data
@Builder
public class Exhibition {
    private String theme;
    private long hall;
    private Timestamp date;
    private double ticketPrice;
}
