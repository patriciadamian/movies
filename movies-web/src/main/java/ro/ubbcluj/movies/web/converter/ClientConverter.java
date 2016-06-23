package ro.ubbcluj.movies.web.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ro.ubbcluj.movies.core.model.Client;
import ro.ubbcluj.movies.web.dto.ClientDto;

/**
 * Created by Patri on 6/16/2016.
 */

@Component
public class ClientConverter extends BaseConverter<Client, ClientDto> {

    @Autowired
    private MovieConverter movieConverter;

    @Override
    public ClientDto convertModelToDto(Client client) {
        ClientDto clientDto = new ClientDto();

        clientDto.setId(client.getId());
        clientDto.setName(client.getName());
        clientDto.setNumberOfMovies(client.getMovies().size());


        clientDto.setMovies(movieConverter.convertModelsToIDs(client.getMovies()));

        return clientDto;
    }
}
