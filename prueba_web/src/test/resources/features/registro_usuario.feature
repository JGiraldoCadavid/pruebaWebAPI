#language: es
# Author: jongiraldocad@gmail.com

  Característica: Yo como usuario deseo validar el registro en la pagina demoblaze

    Antecedentes: ingresar a la pagina web
      Dado el usuario ingresa a la pagina web

      Esquema del escenario: El usuario valida el registro exitoso de la pagina
        Cuando el usuario ingresa informacion para el registro
        | username    | password    |
        | <username>  | <password>  |
        Y el usuario ingresa esta informacion para el logueo
        Entonces el usuario ve el mensaje de bienvenida Welcome <username>

        Ejemplos:
        | username   | password  |
        | trky2557878| Hola1234* |