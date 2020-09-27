package Lesson7.mapper;

import Lesson7.domain.Client;
import Lesson7.dto.ClientDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ClientMapper {

    ClientMapper MAPPER = Mappers.getMapper(ClientMapper.class);

    Client toClient(ClientDTO clientDTO);

    ClientDTO fromClient(Client client);

    List<Client> toClientList(List<ClientDTO> clientDTOS);

    List<ClientDTO> fromClientList(List<Client> clientList);
}
