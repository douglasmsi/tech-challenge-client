package br.com.fiap.postech.fastfood.client.cliente.impl;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import br.com.fiap.postech.fastfood.client.cliente.Cliente;
import br.com.fiap.postech.fastfood.client.cliente.ClientePersistencePort;
import br.com.fiap.postech.fastfood.mock.ClienteMock;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(MockitoExtension.class)
class BuscarClienteUseCaseImplTest {

  @InjectMocks
  private BuscarClienteUseCaseImpl buscarClienteUseCaseImpl;

  @Mock
  private ClientePersistencePort clientePersistencePort;

  @Test
  void whenFindAll_shouldReturnNull() {
    when(clientePersistencePort.findAll()).thenReturn(null);

    List<Cliente> actualFindAllResult = buscarClienteUseCaseImpl.findAll();

    verify(clientePersistencePort).findAll();
    assertNull(actualFindAllResult);
  }

  @Test
  void whenFindByCpf_shouldReturnCliente() {
    when(clientePersistencePort.findByCpf(anyString())).thenReturn(ClienteMock.create());

    var cliente = buscarClienteUseCaseImpl.findByCpf("Cpf");

    verify(clientePersistencePort).findByCpf(anyString());
    assertNotNull(cliente);
    assertNotNull(cliente.getCpf());
  }

  @Test
  void whenFindByNome_shouldReturnCliente() {
    when(clientePersistencePort.findByNome(anyString())).thenReturn(ClienteMock.create());

    var cliente = buscarClienteUseCaseImpl.findByNome("Nome");

    verify(clientePersistencePort).findByNome(anyString());
    assertNotNull(cliente);
    assertNotNull(cliente.getCpf());
  }
}
