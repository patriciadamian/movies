package ro.ubbcluj.movies.core.service;

import ro.ubbcluj.movies.core.model.Client;

import java.util.List;

/**
 * Created by Patri on 6/16/2016.
 */
public interface ClientService {
    List<Client> findAll();
}
