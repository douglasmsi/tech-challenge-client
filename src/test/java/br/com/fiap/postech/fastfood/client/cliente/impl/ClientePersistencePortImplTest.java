package br.com.fiap.postech.fastfood.client.cliente.impl;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

import br.com.fiap.postech.fastfood.client.repository.cliente.ClienteJpaRepository;
import br.com.fiap.postech.fastfood.mock.ClienteEntityMock;
import br.com.fiap.postech.fastfood.mock.ClienteMock;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;
import org.modelmapper.ModelMapper;

@ExtendWith(MockitoExtension.class)
class ClientePersistencePortImplTest {

  @InjectMocks
  private ClientePersistencePortImpl clientePersistencePortImpl;

  @Mock
  private ClienteJpaRepository clienteJpaRepository;

  @Spy
  private ModelMapper modelMapper;

  @Test
  void whenCallSave_shouldReturnClienteSaved() {
    var cliente = ClienteEntityMock.criaClienteEntity();
    when(clienteJpaRepository.save(any())).thenReturn(cliente);

    final var clienteSaved = clientePersistencePortImpl.save(ClienteMock.create());

    assertNotNull(clienteSaved);
    assertNotNull(clienteSaved.getCpf());
    assertNotNull(clienteSaved.getNome());
  }

  @Test
  void whenCallFindAll_shouldReturnClientes() {
    var clientesMock = List.of(ClienteEntityMock.criaClienteEntity(),
        ClienteEntityMock.criaComCpf("123"));
    when(clienteJpaRepository.findAll()).thenReturn(clientesMock);

    final var clientes = clientePersistencePortImpl.findAll();

    Assertions.assertFalse(clientes.isEmpty());
    Assertions.assertEquals(2, clientes.size());
  }

  @Test
  void whenCallFindAll_shouldReturnEmpty() {
    when(clienteJpaRepository.findAll()).thenReturn(List.of());

    final var clientes = clientePersistencePortImpl.findAll();

    Assertions.assertTrue(clientes.isEmpty());
  }

  @Test
  void whenCallFindByCpf_shouldReturnCliente() {
    final var expectedCPF = "12345678901";
    final var expectedCliente = ClienteEntityMock.criaComCpf(expectedCPF);

    when(clienteJpaRepository.findByCpf(anyString())).thenReturn(expectedCliente);

    final var cliente = clientePersistencePortImpl.findByCpf("12345678901");

    assertNotNull(cliente);
    Assertions.assertEquals(expectedCPF, cliente.getCpf());
  }

  @Test
  void whenCallFindByCpf_shouldReturnNull() {
    final var cpf = "12345678901";

    when(clienteJpaRepository.findByCpf(anyString())).thenReturn(null);

    final var cliente = clientePersistencePortImpl.findByCpf("12345678901");

    assertNull(cliente);
  }

  @Test
  void whenCallFindByNome_shouldReturnCliente() {
    final var expectedNome = "João";
    final var expectedCliente = ClienteEntityMock.criaClienteEntity();

    when(clienteJpaRepository.findByNome(anyString())).thenReturn(expectedCliente);

    final var cliente = clientePersistencePortImpl.findByNome("Joao");

    assertNotNull(cliente);
    Assertions.assertEquals(expectedNome, cliente.getNome());
  }

  @Test
  void whenCallFindByNome_shouldReturnNull() {
    final var nome = "João";

    when(clienteJpaRepository.findByNome(anyString())).thenReturn(null);

    final var cliente = clientePersistencePortImpl.findByNome("Joao");

    assertNull(cliente);
  }
}
