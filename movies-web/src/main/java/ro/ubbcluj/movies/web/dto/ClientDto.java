package ro.ubbcluj.movies.web.dto;

import lombok.*;

import java.util.Set;

/**
 * Created by Patri on 6/16/2016.
 */

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ClientDto extends BaseDto {
    private String name;
    private int numberOfMovies;
    private String mostActive;
    private Set<Long> movies;
}
