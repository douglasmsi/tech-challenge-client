package br.com.fiap.postech.fastfood.mock;

import br.com.fiap.postech.fastfood.client.cliente.Cliente;
import lombok.experimental.UtilityClass;

@UtilityClass
public final class ClienteMock {

  public Cliente create() {
    return Cliente.builder()
        .nome("Nome")
        .cpf("Cpf")
        .email("jane.doe@example.org")
        .endereco("Endereco")
        .telefone("Telefone")
        .build();
  }
}
