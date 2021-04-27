package com.taras.exhibition.service.api;

import com.taras.exhibition.service.dto.ExhibitionDto;
import io.swagger.annotations.Api;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
@Api(tags = "Exhibition management API")
@RequestMapping("/api/v1/exhibition")
public interface ExhibitionApi {
    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/{theme}")
    ExhibitionDto getExhibition(@PathVariable String theme);

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    ExhibitionDto createExhibition(@Valid @RequestBody ExhibitionDto exhibitionDto);

    @ResponseStatus(HttpStatus.OK)
    @PutMapping(value = "/{theme}")
    ExhibitionDto updateExhibition(@PathVariable String theme, @RequestBody ExhibitionDto exhibitionDto);

    @RequestMapping(value = "/{theme}", method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteExhibition(@PathVariable String theme);
}
