### El diagrama se encuentra en la carpeta "otros" junto con una guia y comentarios sobre la aplicacion, es importante el documento Word para un mayor entendimiento del proyecto. ###

# Readme #

Evaluacion Java con SpringBoot, esta aplicacion esta desarrollada con una base de datos H2, en el archivo properties tiene la anotacion
"spring.jpa.hibernate.ddl-auto = update" , por lo que las tablas se crearan de forma automatica.

*La aplicacion debe ser usada por Postman, insomnia, katalon studio o similares.

### Forma de utilizar ###

* En primera instancia se debera rescatar el token de la siguiente url:  "GET: http://localhost:8080/token", luego copiar el token dado por el endpoint
* Posteriormente ingresaremos a la siguiente url: "POST: http://localhost:8080/api/user" , copiaremos el token obtenido anteriormente y ingresaremos el token en la       pestaña "Authorization" y el tipo es "Bearer token", el formato a ingresar por el BODY es un JSON que debe seguir este formato :
  { "name": "Daniel segovia", "email": "dsegoviavega@nisum.cl", "password": "dsegovia", "phones": [ { "number": "1234567", "citycode": "1", "contrycode": "1" } ] }
* Para listar nuestros Usuarios podremos ocupar la siguiente url : "GET: http://localhost:8080/api/user"
### Consola H2 ###

* JDBC URL: jdbc:h2:mem:evaluacion-java
* User name: user
* Password: pass
