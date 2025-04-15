# gestion
Proposito del API 
Responsable de la gestión de usuarios de un aplicativo generico

Metodo para consumir el API
Entrar a la herramienta POSTMAN
Seleccionar el metodo 
Escribir la URL 
Enviar

Get
localhost:8081/gestion/v1/usuarios/busquedas
Nos permite buscar los usuarios existentes en la base de datos
Parametro de entrada: No existe

Parametros de salida:
{
    "mensaje": "Operacion exitosa",
    "resultado": [
        {
            "idUsuario": 1,
            "nombre": "uriel",
            "apellido_paterno": "lopez",
            "apellido_materno": "ramirez",
            "edad": "30"
        },
        {
            "idUsuario": 1,
            "nombre": "johany",
            "apellido_paterno": "Flores",
            "apellido_materno": "Mateos",
            "edad": "30"
        }
    ]
}



Post
localhost:8081/gestion/v1/usuarios/registro
Nos permitira crear usuarios en la base de datos.
Parametros de entrada:
{
            "idUsuario": 1,
            "nombre": "uriel",
            "apellido_paterno": "lopez",
            "apellido_materno": "ramirez",
            "edad": "30"
        }
Parametros de salida:
{
    "mensaje": "Registro creado correctamente"
}


Delete
localhost:8081/gestion/v1/usuarios/elimina
Nos permitira borrar usuarios de la base de datos
gestion.
Parametro de entrada: No existe

Parametro de salida: {
    "mensaje": "Registro eliminado correctamente"
}


