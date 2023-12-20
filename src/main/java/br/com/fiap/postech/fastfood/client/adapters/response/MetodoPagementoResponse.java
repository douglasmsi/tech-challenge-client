package br.com.fiap.postech.fastfood.client.adapters.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MetodoPagementoResponse {

    private Long id;
    private String cvv;
    private String dataExpiracao;
    private String numeroCartao;

}
