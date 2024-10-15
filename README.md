# Conversor de Monedas

Este proyecto es un conversor de monedas desarrollado en Java, que permite convertir diferentes tipos de monedas utilizando la **Exchange Rate API**. El proyecto funciona desde la consola e imprime los resultados de la conversión de manera clara.

## Funcionalidades
- Convertir diferentes tipos de moneda (ej. de dólares a colones, de euros a yenes).
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

### Interfaz de la consola
![Captura de pantalla 2024-10-15 010435](https://github.com/user-attachments/assets/a1109c19-44df-4624-a23c-5881ceddb194)
### Resultado de una conversión
![Captura de pantalla 2024-10-15 122214](https://github.com/user-attachments/assets/bec74c7d-bbbf-4e38-975c-4894679c51f2)

## Video de Demostración

[![Video Demostración](ruta/a/captura-video.png)](https://github.com/user-attachments/assets/9bc02bb8-1a68-43ba-a3a2-7058d9863cf9
)

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

