package br.com.fiap.postech.fastfood.client.cliente.impl;

import br.com.fiap.postech.fastfood.client.cliente.Cliente;
import br.com.fiap.postech.fastfood.client.cliente.ClientePersistencePort;
import br.com.fiap.postech.fastfood.client.repository.cliente.ClienteJpaRepository;
import br.com.fiap.postech.fastfood.client.repository.entities.ClienteEntity;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class ClientePersistencePortImpl implements ClientePersistencePort {

  private final ClienteJpaRepository clienteJpaRepository;
  private final ModelMapper modelMapper;

  @Override
  public Cliente save(Cliente cliente) {
    ClienteEntity clienteEntity = clienteJpaRepository.save(
        modelMapper.map(cliente, ClienteEntity.class));
    return modelMapper.map(clienteEntity, Cliente.class);
  }

  @Override
  public List<Cliente> findAll() {
    return clienteJpaRepository.findAll().stream()
        .map(entity -> modelMapper.map(entity, Cliente.class)).toList();
  }

  @Override
  public Cliente findByNome(String nome) {
    ClienteEntity cliente = clienteJpaRepository.findByNome(nome);
    if (cliente != null) {
      return modelMapper.map(cliente, Cliente.class);
    }
    return null;
  }

  @Override
  public Cliente findByCpf(String cpf) {
    ClienteEntity cliente = clienteJpaRepository.findByCpf(cpf);
    if (cliente != null) {
      return modelMapper.map(cliente, Cliente.class);
    }
    return null;
  }
}
