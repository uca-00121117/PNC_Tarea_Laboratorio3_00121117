# PNC_Tarea_Laboratorio3_00121117

Evento de curso
Crear un formulario en productos.html que contenga:

Listado de productos existentes.
Campo para colocar la cantidad de productos que se deseen.
Al enviar el formulario este debe llevar a "/validar".
Crear dominio llamado "Product.java" que contendrá:

Integer id.
String nombre.
String cantidad.
Crear un ProductController donde:

Se creará una lista de Productos de su preferencia (Libros, juegos, artículos de hogar, etc..).
Dicha lista servirá para alimentar la lista de productos.html
Habrá un método validar en donde: usando el Id recibido del formulario, ubicar el producto al que corresponde y validar si la cantidad ingresada en el formulario se puede adquirir.
Si el producto tiene 10 de cantidad y en el formulario se coloca 20, deberá enviar a error.html dicha página contendra:

Un mensaje de error. -> "El producto <nombre_producto> no se puede adquirir."
Si el producto tiene 10 de cantidad y en el formulario se coloca 10 o menos, deberá enviar a compra.html dicha página contendra:

Un mensaje. -> "El producto <nombre_producto> se adquirió.
