package ro.ubbcluj.movies.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ro.ubbcluj.movies.core.model.Movie;
import ro.ubbcluj.movies.core.service.MovieService;
import ro.ubbcluj.movies.web.MediaType;
import ro.ubbcluj.movies.web.converter.MovieConverter;
import ro.ubbcluj.movies.web.dto.MovieDto;
import ro.ubbcluj.movies.web.dto.MoviesDataDto;

import java.util.List;
import java.util.Set;

/**
 * Created by Patri on 6/16/2016.
 */
@RestController
public class MovieController {
    @Autowired
    private MovieService movieService;

    @Autowired
    private MovieConverter movieConverter;

    @RequestMapping(value = "/movies", method = RequestMethod.GET, produces = MediaType.API_JSON)

    public MoviesDataDto getMovies() {

        List<Movie> movies = movieService.findAll();

        Set<MovieDto> moviesDto = movieConverter.convertModelsToDtos(movies);

        MoviesDataDto result = new MoviesDataDto(moviesDto);

        return result;
    }
}
