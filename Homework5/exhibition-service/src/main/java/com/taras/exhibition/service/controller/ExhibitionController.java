package com.taras.exhibition.service.controller;

import com.taras.exhibition.service.api.ExhibitionApi;
import com.taras.exhibition.service.dto.ExhibitionDto;
import com.taras.exhibition.service.service.ExhibitionService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
public class ExhibitionController implements ExhibitionApi {

    private final ExhibitionService exhibitionService;

    @Override
    public ExhibitionDto getExhibition(String theme) {

        log.info("Get exhibition with theme " + theme);
        return exhibitionService.getExhibition(theme);
    }

    @Override
    public ExhibitionDto createExhibition(ExhibitionDto exhibitionDto) {

        log.info("Create exhibition: {} ", exhibitionDto);
        return exhibitionService.createExhibition(exhibitionDto);
    }

    @Override
    public ExhibitionDto updateExhibition(String theme,ExhibitionDto exhibitionDto) {

        log.info("Update exhibition: {} ", exhibitionDto);
        return exhibitionService.updateExhibition(theme, exhibitionDto);
    }

    @Override
    public ResponseEntity<Void> deleteExhibition(String theme) {

        log.info("Get exhibition with theme " + theme);
        exhibitionService.deleteExhibition(theme);
        return ResponseEntity.noContent().build();
    }
}
