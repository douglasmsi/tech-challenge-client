package br.com.fiap.postech.fastfood.client.cliente;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Cliente {

  private String cpf;
  private String nome;
  private String telefone;
  private String endereco;
  private String email;

}
