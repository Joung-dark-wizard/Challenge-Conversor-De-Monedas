# Conversor de Monedas

Este proyecto es un conversor de monedas desarrollado en Java, que permite convertir diferentes tipos de monedas utilizando la **Exchange Rate API**. El proyecto funciona desde la consola e imprime los resultados de la conversión de manera clara.

## Funcionalidades
- Convertir diferentes tipos de moneda (ej. de dólares a peso brasileño, de dólar a peso colombiano).
- Interacción con la API para obtener tipos de cambio actualizados.
- Interfaz interactiva en la consola para ingresar el tipo de moneda y el monto a convertir.

## Requisitos
- **Java 11** o superior.
- **Maven** para la gestión de dependencias.
- Dependencias externas: [Gson](https://github.com/google/gson) para el manejo de JSON.

## Instalación y Uso
1. Clona este repositorio.
    ```bash
    git clone https://github.com/tu-usuario/conversor-de-monedas.git
    cd conversor-de-monedas
    ```

2. Compila y ejecuta el programa usando Maven:
    ```bash
    mvn clean install
    mvn exec:java
    ```

3. Sigue las instrucciones en la consola para ingresar el tipo de moneda y el monto que deseas convertir.

## Capturas de Pantalla

### Pruba de la aplicación
![Captura de pantalla 2024-10-15 010435](https://github.com/user-attachments/assets/571e8553-d569-4a21-b309-ddf77fbe4907)

### Resultado de una conversión
![Captura de pantalla 2024-10-15 122214](https://github.com/user-attachments/assets/cd501acb-30dc-4370-84c0-05c940efb7c8)

## Video de Demostración

[![Video Demostración](ruta/a/captura-video.png)](https://github.com/user-attachments/assets/fb060b0b-42da-4e39-a2e1-44b971f230c4)

## Cómo Funciona
Este proyecto utiliza la **API de Exchange Rate** para obtener tipos de cambio actuales y calcular la conversión de monedas en tiempo real. Usa la librería **Gson** para manejar los datos en formato JSON obtenidos de la API.

1. **Solicitar Tipo de Cambio**: El programa realiza una solicitud a la API y obtiene los tipos de cambio.
2. **Convertir la Moneda**: A partir del valor obtenido de la API, realiza la conversión solicitada por el usuario.
3. **Mostrar Resultado**: Imprime el resultado en la consola.

## Estructura del Proyecto
```bash
src/
├── main/
│   ├── java/
│   │   ├── ConversorMonedas.java
│   │   └── ApiClient.java
├── test/
│   └── java/
