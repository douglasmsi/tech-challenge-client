package br.com.fiap.postech.fastfood.client.cliente.impl;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import br.com.fiap.postech.fastfood.client.cliente.Cliente;
import br.com.fiap.postech.fastfood.client.cliente.ClientePersistencePort;
import br.com.fiap.postech.fastfood.client.repository.entities.ClienteEntity;
import br.com.fiap.postech.fastfood.mock.ClienteEntityMock;
import br.com.fiap.postech.fastfood.mock.ClienteMock;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

@ExtendWith(MockitoExtension.class)
class CriarClienteUseCaseImplTest {

  @Mock
  private ClientePersistencePort clientePersistencePort;

  @InjectMocks
  private CriarClienteUseCaseImpl criarClienteUseCaseImpl;

  @Test
  void whenSaveCliente_shouldReturnClienteSaved() {
    when(clientePersistencePort.save(any(Cliente.class))).thenReturn(ClienteMock.create());

    criarClienteUseCaseImpl.save(ClienteMock.create());

    verify(clientePersistencePort).save(any(Cliente.class));
  }
}
