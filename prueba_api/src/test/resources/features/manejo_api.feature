#language: es
# Author: jongiraldocad@gmail.com

  Característica: obtencion de la informacion de la api

    Antecedentes:
      Dado el servicio de restful booker https://restful-booker.herokuapp.com/

    Escenario: se traen todos los Booking por bookingsid
      Cuando el usuario obtiene todos los bookingId
      Entonces el usuario vera el codigo de respuesta de 200

    Escenario: se valida la existencia de un booking por id
      Cuando el usuario obtiene el registro con el id 3
      Entonces el usuario vera el codigo de respuesta de 200

    Escenario: creacion de un booking
      Cuando el usuario crea una entrada exitosa
        | firstname | lastname | totalprice | depositpaid | checkin    | checkout   | additionalneeds |
        | Lina      | Lopez    |  2760      | true        | 2020-08-08 | 2021-01-09 | Car rental      |
      Entonces el usuario vera el codigo de respuesta de 200

    Escenario: actualizacion de un booking
      Dado el usuario crea una entrada exitosa
        | firstname | lastname | totalprice | depositpaid | checkin    | checkout   | additionalneeds |
        | Lina      | Lopez    |  2760      | true        | 2020-08-08 | 2021-01-09 | Car rental      |
      Y crea un token para actualizar un booking
      Cuando el usuario actualiza la entrada
        | firstname | lastname | totalprice | depositpaid | checkin    | checkout   | additionalneeds |
        | Juan      | Perez    |  500       | false       | 2021-10-27 | 2021-11-27 | Sauna           |
      Entonces el usuario vera el codigo de respuesta de 200


