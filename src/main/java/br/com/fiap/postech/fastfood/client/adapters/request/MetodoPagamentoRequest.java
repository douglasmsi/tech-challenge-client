package br.com.fiap.postech.fastfood.client.adapters.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MetodoPagamentoRequest {

    private String cvv;
    private String dataExpiracao;
    private String numeroCartao;

    private String cpf;
}
