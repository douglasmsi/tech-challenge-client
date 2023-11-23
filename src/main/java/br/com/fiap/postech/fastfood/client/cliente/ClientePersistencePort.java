package br.com.fiap.postech.fastfood.client.cliente;

import java.util.List;

public interface ClientePersistencePort {

  Cliente save(Cliente cliente);

  List<Cliente> findAll();

  Cliente findByNome(String nome);

  Cliente findByCpf(String cpf);

}
