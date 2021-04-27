package com.taras.exhibition.service.repository;

import com.taras.exhibition.service.model.Exhibition;

public interface ExhibitionRepository {
    Exhibition getExhibition(String theme);

    Exhibition createExhibition(Exhibition exhibition);

    Exhibition updateExhibition(String theme, Exhibition exhibition);

    void deleteExhibition(String theme);
}
