package com.taras.exhibition.service.controller.assembler;

import com.taras.exhibition.service.controller.ExhibitionController;
import com.taras.exhibition.service.controller.model.ExhibitionModel;
import com.taras.exhibition.service.dto.ExhibitionDto;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.RepresentationModelAssemblerSupport;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

public class ExhibitionAssembler extends RepresentationModelAssemblerSupport<ExhibitionDto, ExhibitionModel> {
    public ExhibitionAssembler() {
        super(ExhibitionController.class, ExhibitionModel.class);
    }

    @Override
    public ExhibitionModel toModel(ExhibitionDto entity) {
        ExhibitionModel exhibitionModel = new ExhibitionModel(entity);

        Link get = linkTo(methodOn(ExhibitionController.class).getExhibition(entity.getTheme())).withRel("get");
        Link delete = linkTo(methodOn(ExhibitionController.class).deleteExhibition(entity.getTheme())).withRel("delete");
        exhibitionModel.add(get, delete);
        return exhibitionModel;
    }

}
