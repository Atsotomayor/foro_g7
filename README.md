# Foro G7 Atsotomayor
Este proyecto es una API REST diseñada para gestionar temas en un foro. Es un proyecto de desafío con el objetivo de practicar y mejorar habilidades en el desarrollo backend.

## Cómo ejecutar el proyecto
Sigue estos pasos para poner en marcha el proyecto:

1. **Clona el repositorio** en tu máquina local.
2. **Crea una base de datos PostgreSQL** para almacenar la información.
3. **Configura la conexión a la base de datos** en el archivo `application.properties`.
    - Asegúrate de incluir las credenciales de acceso correctas (usuario, contraseña y nombre de la base de datos).
4. **Instala las dependencias del proyecto** usando el comando:
   ```bash
   mvn install
   ```  
5. **Inicia la aplicación** con el comando:
   ```bash
   mvn spring-boot:run
   ```  
6. **Accede a la documentación de la API** en el navegador en:  
   [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html).

---

## Endpoints disponibles

### Usuarios
- **`POST /auth/login`**: Permite a los usuarios iniciar sesión.
> Nota: Actualmente, no existe un endpoint para crear usuarios. Los usuarios deben ser creados directamente en la base de datos.

### Temas
- **`GET /topics`**: Obtiene todos los temas con paginación.
- **`GET /topics/{id}`**: Obtiene un tema específico por su ID.
- **`POST /topics`**: Crea un nuevo tema.
- **`PUT /topics/{id}`**: Actualiza un tema específico por su ID.
- **`DELETE /topics/{id}`**: Elimina un tema específico por su ID.
- **`GET /ten-most-recent`**: Obtiene los diez temas más recientes.

---

## Autenticación
La API utiliza **JWT (JSON Web Token)** para autenticar a los usuarios.  
Para acceder a los endpoints, debes incluir el token en el encabezado de tus solicitudes.

---

## Base de datos
- La base de datos se crea y gestiona utilizando **Flyway**.
- Los archivos de migración se encuentran en la carpeta:
  ```
  resources/db.migration
  ```  

---

## Pruebas
- Las pruebas del proyecto están ubicadas en la carpeta:
  ```
  src/test
  ```  
- El proyecto incluye pruebas unitarias para los servicios y controladores.

---

## Mejoras futuras
Estas son algunas áreas donde se puede mejorar el proyecto:
- Crear un endpoint para permitir la creación de usuarios.
- Agregar pruebas de integración.
- Incluir más validaciones.
- Mejorar el manejo de errores.
- Ampliar la documentación.
- Implementar configuraciones adicionales de seguridad.

---

## Tecnologías utilizadas
- **Kotlin**: Lenguaje principal del proyecto.
- **Spring Boot**: Framework para construir la API REST.
- **PostgreSQL**: Base de datos para almacenar los datos.
- **Maven**: Herramienta para gestionar las dependencias.

---
