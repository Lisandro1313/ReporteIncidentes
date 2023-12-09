# Sistema de Reporte de Incidentes

Este proyecto es un sistema diseñado para la generación y seguimiento de incidentes en una empresa de soporte operativo. La empresa brinda soporte sobre diversas aplicaciones y sistemas operativos. El sistema se enfoca en la gestión de incidentes, asignación de técnicos y reportes para el área de Recursos Humanos.

## Funcionalidades Principales

- **Gestión de Técnicos**: RRHH puede dar de alta, baja y modificar información de los técnicos encargados de resolver incidentes.
  
- **Especialidades Técnicas**: Cada técnico puede tener una o varias especialidades y solo se le pueden asignar incidentes relacionados con esas especialidades.

- **Gestión de Clientes**: El área comercial administra las altas, bajas y modificaciones de los datos de los clientes que solicitan soporte.

- **Ciclo de Vida de un Incidente**: Desde la identificación del cliente hasta la resolución por parte de un técnico, pasando por la asignación y seguimiento.

- **Reportes Diarios de RRHH**: Emisión diaria de reportes con los incidentes asignados a cada técnico y sus estados.

- **Colchón de Horas**: Los operadores pueden agregar un colchón de horas estimadas para la resolución de problemas considerados "complejos".

- **Incidentes con Conjunto de Problemas**: Posibilidad de dar de alta incidentes que involucren un conjunto de problemas relacionados.

- **Informes sobre Técnicos**: Posibilidad de obtener informes sobre el desempeño de los técnicos.

## Modelo de Datos

El modelo de datos se ha diseñado considerando las entidades principales como Técnico, Cliente, Incidente, Especialidad, Problema, Servicio, etc. El diseño se presenta en un Diagrama de Entidad-Relación (DER) físico.

## Tecnologías Utilizadas

- **Java**: Desarrollo del sistema en el lenguaje de programación Java.
- **Hibernate**: Framework de persistencia para mapear objetos Java a bases de datos relacionales mediante anotaciones JPA.
- **Base de Datos H2**: Utilizada para almacenar datos de forma temporal durante el desarrollo.
- **Maven**: Herramienta de gestión de proyectos utilizada para la compilación y gestión de dependencias.

## Configuración del Proyecto

### Requisitos

- Java 8 o superior
- Maven

### Configuración de la Base de Datos

El proyecto utiliza una base de datos H2 en memoria. No se requiere configuración adicional.

### Ejecución

1. Clonar el repositorio: `git clone https://github.com/tu-usuario/sistema-reporte-incidentes.git`
2. Ingresar al directorio del proyecto: `cd sistema-reporte-incidentes`
3. Ejecutar la aplicación: `mvn clean install`
