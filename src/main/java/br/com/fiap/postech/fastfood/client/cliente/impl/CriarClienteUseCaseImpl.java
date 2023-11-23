package br.com.fiap.postech.fastfood.client.cliente.impl;

import br.com.fiap.postech.fastfood.client.cliente.Cliente;
import br.com.fiap.postech.fastfood.client.cliente.ClientePersistencePort;
import br.com.fiap.postech.fastfood.client.cliente.CriarClienteUseCase;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CriarClienteUseCaseImpl implements CriarClienteUseCase {

  private final ClientePersistencePort clientePersistencePort;

  @Override
  public Cliente save(Cliente cliente) {
    return clientePersistencePort.save(cliente);
  }
}
