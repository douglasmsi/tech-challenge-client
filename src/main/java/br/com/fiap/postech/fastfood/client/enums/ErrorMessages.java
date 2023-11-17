package br.com.fiap.postech.fastfood.client.enums;

public enum ErrorMessages {
  CLIENTE_NOT_FOUND("Cliente não encontrado"),
  CLIENTE_ALREADY_EXISTS("Cliente já cadastrado"),
  CLIENTE_CPF_ALREADY_EXISTS("CPF já cadastrado"),
  CLIENTE_CPF_NOT_FOUND("CPF não encontrado");

  private final String message;

  ErrorMessages(final String message) {
    this.message = message;
  }

  public String getMessage() {
    return message;
  }
}
