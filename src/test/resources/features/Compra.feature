Feature: E2E


  @E2E
  Scenario Outline: Compra
    Given Login <url> <user> <password>
    When Agregar dos productos al carrito
    And Visualizar el carrito <texto>
    And Completar el formulario de compra <nombre> <apellido> <codigopostal>
    Then Finalizar la compra hasta la confirmación "Thank you for your order!"
    Examples:
      | url                          | user            | password       | texto       | nombre    | apellido | codigopostal |
      | "https://www.saucedemo.com/" | "standard_user" | "secret_sauce" | "Your Cart" | "Rodrigo" | "Teran"  | "170252"     |