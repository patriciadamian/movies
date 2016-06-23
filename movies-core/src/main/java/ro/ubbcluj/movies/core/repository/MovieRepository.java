package ro.ubbcluj.movies.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.ubbcluj.movies.core.model.BaseEntity;
import ro.ubbcluj.movies.core.model.Movie;

import java.io.Serializable;

/**
 * Created by Patri on 6/16/2016.
 */


public interface MovieRepository extends Repository<Movie, Long> {
}
