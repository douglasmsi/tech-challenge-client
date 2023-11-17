package br.com.fiap.postech.fastfood.client.config;

import br.com.fiap.postech.fastfood.client.TechChallengeClienteApplication;
import br.com.fiap.postech.fastfood.client.cliente.BuscarClienteUseCase;
import br.com.fiap.postech.fastfood.client.cliente.ClientePersistencePort;
import br.com.fiap.postech.fastfood.client.cliente.CriarClienteUseCase;
import br.com.fiap.postech.fastfood.client.cliente.impl.BuscarClienteUseCaseImpl;
import br.com.fiap.postech.fastfood.client.cliente.impl.CriarClienteUseCaseImpl;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = TechChallengeClienteApplication.class)
public class BeanConfig {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

    @Bean
    public CriarClienteUseCase criarClienteUseCase(ClientePersistencePort persistence) {
        return new CriarClienteUseCaseImpl(persistence);
    }

    @Bean
    public BuscarClienteUseCase buscarClienteUseCase(ClientePersistencePort persistence) {
        return new BuscarClienteUseCaseImpl(persistence);
    }



}
