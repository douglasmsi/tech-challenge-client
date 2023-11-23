package br.com.fiap.postech.fastfood.client.repository.cliente;

import br.com.fiap.postech.fastfood.client.repository.entities.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface ClienteJpaRepository extends JpaRepository<ClienteEntity, Long> {

  ClienteEntity findByCpf(final String cpf);

  ClienteEntity findByNome(final String nome);

}
