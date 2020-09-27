package Lesson7.service;

import Lesson7.dto.ClientDTO;

import java.util.List;

public interface ClientService {
    List<ClientDTO> getAll();

    ClientDTO getById(Long id);

    ClientDTO save(ClientDTO clientDTO);

    void deleteById(Long id);

}