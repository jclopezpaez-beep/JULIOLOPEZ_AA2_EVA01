📌 TELEP_APP – Módulo Backend Java (JDBC + MySQL)

Proyecto académico desarrollado como evidencia GA7-220501096-AA2-EV01 del programa Tecnología en Análisis y Desarrollo de Software – SENA, cuyo objetivo es construir un módulo Java que implemente un CRUD completo a través de JDBC según los requerimientos funcionales definidos en el proyecto TELEP.

🎯 Objetivo General

Construir un módulo en Java capaz de conectarse a una base de datos MySQL mediante JDBC, permitiendo realizar operaciones de Inserción, Consulta, Actualización y Eliminación (CRUD) sobre las entidades definidas previamente en el proyecto.

🧩 Objetivos Específicos

Utilizar Eclipse + Maven para gestionar dependencias.

Implementar conexión a MySQL usando JDBC.

Aplicar estándares de nombramiento (clases, métodos, variables, paquetes).

Generar código limpio, modular y legible.

Realizar pruebas unitarias de los métodos CRUD.

Manejar errores con try-catch y SQLExceptions.

Documentar el módulo técnico para entrega académica.

🚀 Tecnologías Utilizadas
Elemento	Versión
Java	17
Eclipse IDE	2024
MySQL	8
JDBC	8.3
Maven	Última versión
XAMPP	opcional
🗃 Requisitos Previos

✔ Java 17
✔ Eclipse IDE
✔ MySQL y servidor activo
✔ Conector JDBC

🔧 Dependencias Maven
<dependencies>
    <dependency>
        <groupId>mysql</groupId>
        <artifactId>mysql-connector-j</artifactId>
        <version>8.3.0</version>
    </dependency>
</dependencies>

🏗 Estructura del Proyecto
telep_app/
 └─ backend_jdbc/
     ├─ src/main/java/
     │   ├─ com.telep.app.config
     │   │     └─ DBConnection.java
     │   ├─ com.telep.app.models
     │   │     └─ UsuarioFinal.java
     │   │     └─ RegistrosAnalistas.java
     │   ├─ com.telep.app.dao
     │   │     └─ UsuarioFinalDAO.java
     │   │     └─ RegistrosAnalistasDAO.java
     │   ├─ com.telep.app.tests
     │         └─ TestUsuarioFinal.java
     │         └─ TestRegistrosAnalistas.java
     └─ pom.xml

🟦 Configuración DBConnection

Ruta:

src/main/java/com/telep/app/config/DBConnection.java

private static final String URL = "jdbc:mysql://localhost:3306/telep_app_jdbc";
private static final String USER = "root";
private static final String PASSWORD = "";


⚠ Cambia si tu MySQL usa otro puerto:

jdbc:mysql://localhost:3307/telep_app_jdbc

📥 Restaurar la base de datos

Importar el archivo SQL ubicado en:

telep_app/backend_jdbc/sql/telep_app_jdbc.sql

🧪 Ejecutar pruebas CRUD
Insertar
dao.insert(model);

Consultar
dao.getAll();
dao.getById();

Actualizar
dao.update(model);

Eliminar
dao.delete(id);

🧠 Principales Aprendizajes

Uso real de JDBC

Gestión de errores SQL

Relaciones con claves foráneas

Validación de datos en capa DAO

Patrones DAO y MVC

Pruebas integradas en Java

📎 Licencia

Este proyecto se desarrolla con fines académicos dentro del SENA. No se permite su uso comercial sin autorización previa.

🧑 Autor

Julio López
Proyecto TELEP 2025
SENA – Tecnólogo ADS