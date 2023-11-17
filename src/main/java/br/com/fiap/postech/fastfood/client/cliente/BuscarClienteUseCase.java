package br.com.fiap.postech.fastfood.client.cliente;




import java.util.List;

public interface BuscarClienteUseCase {
  List<Cliente> findAll();
  Cliente findByCpf(String cpf);
  Cliente findByNome(String nome);
}
