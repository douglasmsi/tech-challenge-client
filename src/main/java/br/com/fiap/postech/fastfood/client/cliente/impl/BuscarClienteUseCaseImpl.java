package br.com.fiap.postech.fastfood.client.cliente.impl;

import br.com.fiap.postech.fastfood.client.cliente.BuscarClienteUseCase;
import br.com.fiap.postech.fastfood.client.cliente.Cliente;
import br.com.fiap.postech.fastfood.client.cliente.ClientePersistencePort;
import java.util.List;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class BuscarClienteUseCaseImpl implements BuscarClienteUseCase {

  private final ClientePersistencePort clientePersistencePort;

  @Override
  public List<Cliente> findAll() {
    return clientePersistencePort.findAll();
  }

  @Override
  public Cliente findByCpf(String cpf) {
    return clientePersistencePort.findByCpf(cpf);
  }

  @Override
  public Cliente findByNome(String nome) {
    return clientePersistencePort.findByNome(nome);
  }
}
