package ro.ubbcluj.movies.web.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ro.ubbcluj.movies.core.model.Client;

import java.io.Serializable;
import java.util.Optional;
import java.util.Set;

/**
 * Created by Patri on 6/16/2016.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ClientsDataDto implements Serializable{
    private Set<ClientDto> clients;
    //private Optional<ClientDto> mostActive;
}
