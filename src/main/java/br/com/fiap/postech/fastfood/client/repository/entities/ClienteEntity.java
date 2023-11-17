package br.com.fiap.postech.fastfood.client.repository.entities;

import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;

@Data
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
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


        @Override
        public String toString() {
                return "ClienteEntity{" +
                    "id=" + id +
                    ", cpf='" + cpf + '\'' +
                    ", nome='" + nome + '\'' +
                    ", telefone='" + telefone + '\'' +
                    ", endereco='" + endereco + '\'' +
                    ", email='" + email + '\'' +

                    '}';
        }

}
