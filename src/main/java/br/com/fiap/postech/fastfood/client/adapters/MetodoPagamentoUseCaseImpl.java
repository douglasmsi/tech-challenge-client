package br.com.fiap.postech.fastfood.client.adapters;

import br.com.fiap.postech.fastfood.client.adapters.request.MetodoPagamentoRequest;
import br.com.fiap.postech.fastfood.client.adapters.response.MetodoPagementoResponse;

import java.util.List;

public class MetodoPagamentoUseCaseImpl implements MetodoPagamentoPort {
    @Override
    public List<MetodoPagementoResponse> getFormasPagamento(String cpf) {
        return null;
    }

    @Override
    public void cadastrarMetodoPagamento(MetodoPagamentoRequest metodoPagamentoRequest) {

    }


}
