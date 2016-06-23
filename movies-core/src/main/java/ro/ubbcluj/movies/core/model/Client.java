package ro.ubbcluj.movies.core.model;

import javax.persistence.*;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by Patri on 6/16/2016.
 */

@Entity
@Table(name = "client")
public class Client extends BaseEntity<Long> {

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "client", fetch = FetchType.EAGER)
    private List<Movie> list_of_rented_movies;

    public Client(String name, List<Movie> movieList) {
        this.name = name;
        this.list_of_rented_movies = movieList;
    }

    public Client(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Movie> getMovieList() {
        return list_of_rented_movies;
    }

    public void setMovieList(List<Movie> movieList) {
        this.list_of_rented_movies = movieList;
    }

    public Set<Movie> getMovies() {
        return Collections.unmodifiableSet(
                this.list_of_rented_movies.stream().
                        collect(Collectors.toSet()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Client client = (Client) o;

        if (!name.equals(client.name)) return false;
        return list_of_rented_movies.equals(client.list_of_rented_movies);

    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + list_of_rented_movies.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", movieList=" + list_of_rented_movies +
                '}';
    }
}
