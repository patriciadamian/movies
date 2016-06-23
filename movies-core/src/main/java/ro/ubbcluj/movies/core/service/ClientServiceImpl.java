package ro.ubbcluj.movies.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ro.ubbcluj.movies.core.model.Client;
import ro.ubbcluj.movies.core.repository.ClientRepository;

import java.util.List;

/**
 * Created by Patri on 6/16/2016.
 */
@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository clientRepo;

    @Override
    @Transactional
    public List<Client> findAll() {
        return clientRepo.findAll();
    }
}
