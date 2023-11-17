package br.com.fiap.postech.fastfood.client.cliente;

import lombok.*;


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
