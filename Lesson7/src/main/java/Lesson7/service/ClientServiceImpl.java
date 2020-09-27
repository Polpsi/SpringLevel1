package Lesson7.service;

import Lesson7.domain.Client;
import Lesson7.dto.ClientDTO;
import Lesson7.mapper.ClientMapper;
import Lesson7.repository.ClientDAO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

    private final ClientMapper mapper = ClientMapper.MAPPER;
    private final ClientDAO clientDAO;

    public ClientServiceImpl(ClientDAO clientDAO) {
        this.clientDAO=clientDAO;
    }

    @Override
    public List<ClientDTO> getAll() {
        return mapper.fromClientList(clientDAO.findAll());
    }

    @Override
    public ClientDTO getById(Long id) {
        return mapper.fromClient(clientDAO.findById(id).orElse(null));
    }

    @Override
    public ClientDTO save(ClientDTO clientDTO) {
        Client client = mapper.toClient(clientDTO);
        Client savedClient=clientDAO.save(client);
        return mapper.fromClient(savedClient);
    }

    public void deleteById(Long id) {
        clientDAO.deleteById(id);
    }
}