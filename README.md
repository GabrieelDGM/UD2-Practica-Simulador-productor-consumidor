# Experimento Tres
✔️ Cambio:

Las prioridades de los productores se aumentan:

hiloProductor.setPriority(Thread.MAX_PRIORITY);

✔️ Resultado:

Los productores trabajan más rápido, similar al experimento 2, pero con diferencias:

La producción gana prioridad.

El consumo ocurre después.

No es exactamente igual al experimento 2 pero se parece.

✔️ Captura:

![salida](src/net/images/salida.png)
✔️ Explicación:

Debido a la prioridad alta, el sistema operativo ejecuta más tiempo el hilo productor, lo que acelera la llegada de productos al almacén.
El consumidor consume apenas tiene oportunidad.
