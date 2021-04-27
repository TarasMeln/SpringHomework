package com.taras.exhibition.service.service;

import com.taras.exhibition.service.dto.ExhibitionDto;

public interface ExhibitionService {
    ExhibitionDto getExhibition(String theme);

    ExhibitionDto createExhibition(ExhibitionDto exhibitionDto);

    ExhibitionDto updateExhibition(String theme, ExhibitionDto exhibitionDto);

    void deleteExhibition(String theme);
}
