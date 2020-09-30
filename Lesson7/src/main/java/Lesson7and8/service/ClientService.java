package Lesson7and8.service;

import Lesson7and8.dto.ClientDTO;

import java.util.List;

public interface ClientService {
    List<ClientDTO> getAll();

    ClientDTO getById(Long id);

    ClientDTO save(ClientDTO clientDTO);

    void deleteById(Long id);

}