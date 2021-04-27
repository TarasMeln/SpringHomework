package com.taras.exhibition.service.service.impl;

import com.taras.exhibition.service.dto.ExhibitionDto;
import com.taras.exhibition.service.model.Exhibition;
import com.taras.exhibition.service.repository.ExhibitionRepository;
import com.taras.exhibition.service.service.ExhibitionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ExhibitionServiceImpl implements ExhibitionService {
    private final ExhibitionRepository exhibitionRepository;


    @Override
    public ExhibitionDto getExhibition(String theme) {
        Exhibition exhibition = exhibitionRepository.getExhibition(theme);
        return mapExhibitionToExhibitionDto(exhibition);
    }

    @Override
    public ExhibitionDto createExhibition(ExhibitionDto exhibitionDto) {
        Exhibition exhibition = mapExhibitionDtoToExhibition(exhibitionDto);
        exhibition = exhibitionRepository.createExhibition(exhibition);
        return mapExhibitionToExhibitionDto(exhibition);
    }

    @Override
    public ExhibitionDto updateExhibition(String theme, ExhibitionDto exhibitionDto) {
        Exhibition exhibition = mapExhibitionDtoToExhibition(exhibitionDto);
        exhibition = exhibitionRepository.updateExhibition(theme, exhibition);
        return mapExhibitionToExhibitionDto(exhibition);
    }

    @Override
    public void deleteExhibition(String theme) {
        exhibitionRepository.deleteExhibition(theme);
    }

    private ExhibitionDto mapExhibitionToExhibitionDto(Exhibition exhibition) {

        return ExhibitionDto.builder().
                theme(exhibition.getTheme()).
                date(exhibition.getDate()).
                hall(exhibition.getHall()).
                ticketPrice(exhibition.getTicketPrice()).
                build();
    }

    private Exhibition mapExhibitionDtoToExhibition(ExhibitionDto exhibitionDto) {

        return Exhibition.builder()
                .theme(exhibitionDto.getTheme())
                .date(exhibitionDto.getDate())
                .hall(exhibitionDto.getHall())
                .ticketPrice(exhibitionDto.getTicketPrice())
                .build();
    }

}
