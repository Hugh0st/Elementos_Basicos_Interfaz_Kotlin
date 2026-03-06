======================================================
TAREA 1: ELEMENTOS BÁSICOS DE INTERFAZ EN KOTLIN
======================================================

DESCRIPCIÓN DE LA APP:
Esta aplicación es un proyecto educativo para Android desarrollado en Kotlin. Su objetivo es demostrar de forma práctica e interactiva el funcionamiento de los elementos básicos de la interfaz de usuario (UI). 
La arquitectura utiliza una Activity principal con un menú de navegación inferior (BottomNavigationView) que permite alternar entre 5 Fragments distintos, además de implementar navegación hacia una Activity 
secundaria mediante un Intent.

INSTRUCCIONES DE USO:
1. Al iniciar la aplicación, encontrarás una barra de navegación en la parte inferior con 5 opciones.
2. Pestaña 1 (Textos): Escribe tu nombre y una contraseña en los campos de texto (EditText) y presiona el botón para leer los datos en pantalla.
3. Pestaña 2 (Botones): Toca el botón normal, el botón con icono (ImageButton) y el botón flotante (FAB) para detonar mensajes emergentes (Toasts).
4. Pestaña 3 (Selección): Interactúa con el CheckBox, elige un nivel en los RadioButtons y enciende el Switch. El cuadro gris actualizará tus respuestas en tiempo real, adaptándose tanto al modo claro como al modo oscuro del sistema.
5. Pestaña 4 (Listas): Desplázate por el RecyclerView. Al tocar cualquier elemento de la lista, la aplicación te llevará a una pantalla completamente nueva (DetailActivity) mostrando el dato que seleccionaste.
6. Pestaña 5 (Info): Presiona el botón inferior para ver cómo aparece un indicador de carga (ProgressBar). Después de 2 segundos, la imagen de muestra cambiará automáticamente indicando que la carga finalizó.
