
# Trabajo Practico Integrador - “Desarrollador Java Intermedio”  - UTN


## Torneo de futbol

Escenario: Se tiene necesidad de modelar el concepto de Equipos de Fútbol de Argentina, por medio de un programa informático.

Interesan almacenar características como: el nombre del Equipo, cuántos jugadores posee (tanto titulares como suplentes), quién es su Director Técnico, cuántos puntos acumula por partidos ganados o empatados, y cuántos partidos jugó.

Consigna: La propuesta del trabajo práctico consiste en implementar un programa que arroje la información solicitada.

Alcance: En este Trabajo Práctico nos limitaremos a almacenar los datos de cada Equipo, para generar un ABM (CRUD) por consola. 

A continuación, se propone un diagrama de Clases UML inicial que puede ser modificado con
total libertad de criterio.

    ---------------------------
    EQUIPO
    ---------------------------
    - nombre : String
    - titulares : int
    - suplentes : int
    - directorTecnico : String
    - puntos : int
    - partidosJugados : int
    ---------------------------
    - Equipo():
    - Equipo(nombre, titulares, 
    suplentes, directorTecnico, 
    puntos, partidosJugados):
    ---------------------------





## Authors

- [@JoelFiare](https://github.com/JoelFiare)


## Tecnologias

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white) ![Hibernate](https://img.shields.io/badge/Hibernate-59666C?style=for-the-badge&logo=Hibernate&logoColor=white) ![MySQL](https://img.shields.io/badge/mysql-%2300f.svg?style=for-the-badge&logo=mysql&logoColor=white)
## Capturas de Pantalla

![UML](https://github.com/JoelFiare/TorneoDeFutbol/blob/master/TorneoDeFutbol.jpg?raw=true)

![UML](https://github.com/JoelFiare/TorneoDeFutbol/blob/master/sql.png?raw=true)