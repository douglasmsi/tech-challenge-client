package br.com.fiap.postech.fastfood.client.adapters;

import br.com.fiap.postech.fastfood.client.adapters.request.MetodoPagamentoRequest;
import br.com.fiap.postech.fastfood.client.adapters.response.MetodoPagementoResponse;

import java.util.List;

public interface MetodoPagamentoPort {

    public List<MetodoPagementoResponse> getFormasPagamento(String cpf);

    public void cadastrarMetodoPagamento(MetodoPagamentoRequest metodoPagamentoRequest);
}
