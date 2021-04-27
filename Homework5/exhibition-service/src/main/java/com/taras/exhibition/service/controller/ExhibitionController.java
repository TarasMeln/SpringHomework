package com.taras.exhibition.service.controller;

import com.taras.exhibition.service.dto.ExhibitionDto;
import com.taras.exhibition.service.service.ExhibitionService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Slf4j
@RestController
@RequestMapping("/exhibition")
@RequiredArgsConstructor
public class ExhibitionController {

    private final ExhibitionService exhibitionService;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/{theme}")
    public ExhibitionDto getExhibition(@PathVariable String theme) {

        log.info("Get exhibition with theme " + theme);
        return exhibitionService.getExhibition(theme);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public ExhibitionDto createExhibition(@Valid @RequestBody ExhibitionDto exhibitionDto) {

        log.info("Create exhibition: {} ", exhibitionDto);
        return exhibitionService.createExhibition(exhibitionDto);
    }

    @ResponseStatus(HttpStatus.OK)
    @PutMapping(value = "/{theme}")
    public ExhibitionDto updateExhibition(@PathVariable String theme, @RequestBody ExhibitionDto exhibitionDto) {

        log.info("Update exhibition: {} ", exhibitionDto);
        return exhibitionService.updateExhibition(theme, exhibitionDto);
    }

    @RequestMapping(value = "/{theme}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> deleteExhibition(@PathVariable String theme) {

        log.info("Get exhibition with theme " + theme);
        exhibitionService.deleteExhibition(theme);
        return ResponseEntity.noContent().build();
    }
}
