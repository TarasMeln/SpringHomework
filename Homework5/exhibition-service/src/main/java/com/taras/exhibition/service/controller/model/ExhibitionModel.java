package com.taras.exhibition.service.controller.model;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.taras.exhibition.service.dto.ExhibitionDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.hateoas.RepresentationModel;

@Data
@EqualsAndHashCode
@AllArgsConstructor
public class ExhibitionModel extends RepresentationModel<ExhibitionModel> {
    @JsonUnwrapped
    private ExhibitionDto exhibitionDto;
}
