package ro.ubbcluj.movies.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ro.ubbcluj.movies.core.model.Client;
import ro.ubbcluj.movies.core.service.ClientService;
import ro.ubbcluj.movies.web.MediaType;
import ro.ubbcluj.movies.web.converter.ClientConverter;
import ro.ubbcluj.movies.web.dto.ClientDto;
import ro.ubbcluj.movies.web.dto.ClientsDataDto;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by Patri on 6/16/2016.
 */

@RestController
public class ClientController {

    @Autowired
    private ClientService clientService;

    @Autowired
    private ClientConverter clientConverter;

    @RequestMapping(value = "/clients", method = RequestMethod.GET, produces = MediaType.API_JSON)

    public ClientsDataDto getClients(){
        List<Client> clients = clientService.findAll();

        Set<ClientDto>  clientsDto = clientConverter.convertModelsToDtos(clients);

        Optional<ClientDto> max = clientsDto.stream().max(Comparator.comparing(ClientDto::getNumberOfMovies));

        ClientDto c = max.get();
        String name = c.getName();

        for (ClientDto client : clientsDto){
            client.setMostActive(name);
            name = "";
        }

        ClientsDataDto result = new ClientsDataDto(clientsDto);


//        return new ClientDataDto(clientConverter.convertModelsToDtos(clients));
        //return new ClientDataDto(clientdtos);

        return result;

    }


}
