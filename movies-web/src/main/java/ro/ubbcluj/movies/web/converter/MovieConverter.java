package ro.ubbcluj.movies.web.converter;

import org.springframework.stereotype.Component;
import ro.ubbcluj.movies.core.model.Movie;
import ro.ubbcluj.movies.web.dto.MovieDto;

/**
 * Created by Patri on 6/16/2016.
 */
@Component
public class MovieConverter extends BaseConverter<Movie, MovieDto> {
    @Override
    public MovieDto convertModelToDto(Movie movie) {
        MovieDto movieDto = new MovieDto();

        movieDto.setId(movie.getId());
        movieDto.setDiskNumber(movie.getDiskNumber());
        movieDto.setTitle(movie.getTitle());
        movieDto.setClient_id(movie.getClient().getId());
//        movieDto.setGenre(movie.getGenre());
//        movieDto.setPrice(movie.getPrice());

        return movieDto;
    }
}
