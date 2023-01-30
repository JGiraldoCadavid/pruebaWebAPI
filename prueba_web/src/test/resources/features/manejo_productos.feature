#language: es
# Author: jongiraldocad@gmail.com

  Característica: Yo como usuario deseo validar el total de la compra de productos de la pagina demoblaze

    Antecedentes: ingresar a la pagina web
      Dado el usuario ingresa a la pagina web

    Escenario: el usuario agrega productos al carrito
      Cuando el usuario agrega varios productos al carrito
      Entonces el usuario valida que la suma de todos los productos sea igual al total

    Escenario: el usuario compra productos
      Cuando el usuario agrega varios productos al carrito
      Y el usuario ingresa los datos de la compra
        | name              | country   | city      | creditCard      | month | year  |
        | Jonathan Giraldo C| Colombia  | Medellin  | 45852356524578  | 10    | 2029  |
      Entonces el usuario ve el texto Thank you for your purchase!
