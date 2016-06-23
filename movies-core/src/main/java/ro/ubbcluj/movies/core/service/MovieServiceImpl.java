package ro.ubbcluj.movies.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.ubbcluj.movies.core.model.Movie;
import ro.ubbcluj.movies.core.repository.MovieRepository;

import java.util.List;

/**
 * Created by Patri on 6/16/2016.
 */
@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieRepository movieRepo;

    @Override
    public List<Movie> findAll() {
        return movieRepo.findAll();
    }
}
