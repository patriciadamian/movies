package ro.ubbcluj.movies.core.service;

import ro.ubbcluj.movies.core.model.Movie;

import java.util.List;

/**
 * Created by Patri on 6/16/2016.
 */

public interface MovieService {
    List<Movie> findAll();
}
