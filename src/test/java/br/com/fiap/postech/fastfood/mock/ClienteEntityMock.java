package br.com.fiap.postech.fastfood.mock;

import br.com.fiap.postech.fastfood.client.repository.entities.ClienteEntity;
import lombok.experimental.UtilityClass;

@UtilityClass
public final class ClienteEntityMock {

  public ClienteEntity criaClienteEntity() {
    return ClienteEntity.builder().cpf("12345678901").nome("João").build();
  }

  public ClienteEntity criaComCpf(final String cpf) {
    return ClienteEntity.builder().cpf(cpf).telefone("Telefone").nome(
        "Nome").endereco("Endereco").email("Email").build();
  }
}
