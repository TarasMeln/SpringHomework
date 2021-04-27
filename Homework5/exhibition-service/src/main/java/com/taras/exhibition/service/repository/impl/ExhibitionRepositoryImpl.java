package com.taras.exhibition.service.repository.impl;

import com.taras.exhibition.service.model.Exhibition;
import com.taras.exhibition.service.repository.ExhibitionRepository;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ExhibitionRepositoryImpl implements ExhibitionRepository {

    private List<Exhibition> list = new ArrayList<>();

    @Override
    public Exhibition getExhibition(String theme) {
        return list.stream().filter(exhibition -> exhibition.getTheme().equals(theme)).findFirst().orElseThrow(RuntimeException::new);
    }

    @Override
    public Exhibition createExhibition(Exhibition exhibition) {
        list.add(exhibition);
        return exhibition;
    }

    @Override
    public Exhibition updateExhibition(String theme, Exhibition exhibition) {
        boolean isDeleted = list.removeIf(exhibition1 -> exhibition1.getTheme().equals(theme));
        if (isDeleted) {
            list.add(exhibition);
        } else {
            throw new RuntimeException("Exhibition does not exist!");
        }
        return exhibition;
    }

    @Override
    public void deleteExhibition(String theme) {
        list.removeIf(exhibition -> exhibition.getTheme().equals(theme));
    }
}
