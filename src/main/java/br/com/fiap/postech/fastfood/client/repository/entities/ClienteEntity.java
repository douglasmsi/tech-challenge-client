package br.com.fiap.postech.fastfood.client.repository.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "clientes", uniqueConstraints = @UniqueConstraint(columnNames = "cpf"))
public class ClienteEntity implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  @Column(name = "id", nullable = false)
  private Long id;

  @Column
  private String cpf;

  @Column
  private String nome;

  @Column
  private String telefone;

  @Column
  private String endereco;

  @Column
  private String email;

}
