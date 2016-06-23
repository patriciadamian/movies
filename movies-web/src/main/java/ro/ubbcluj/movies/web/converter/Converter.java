package ro.ubbcluj.movies.web.converter;

import ro.ubbcluj.movies.core.model.BaseEntity;
import ro.ubbcluj.movies.web.dto.BaseDto;

/**
 * Created by Patri on 6/16/2016.
 */
public interface Converter<Model extends BaseEntity<Long>, Dto extends BaseDto> {
    Model convertDtoToModel(Dto dto);

    Dto convertModelToDto(Model model);
}
