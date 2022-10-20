## Modificaciones realizadas dentro del proyecto
Antes de comenzar a expplicar las modificaciones realizadas dentro de este proyecto, vamos a nombrarlas: 
- [Idiomas String y String layout](#Idiomas-String-y-String-en-el-layout)
- [Imágenes en drawable](#Imágenes-en-drawable)
- [Función diferente al random](#Función-diferente-al-random)
- [Nuevos botones con Material.io](#Nuevos-botones-con-Material.io)
### Idiomas String y String en el layout
En la creación de nuestra aplicación debemos tomar en cuenta la gran cantidad de personas de distintos 
paises e idiomas que podría utilizarla, para no tener problemas con esto crearemos nuevos documentos
string.xml dentro de la carpeta values, cada uno con un código de país, o idioma.
Estos documentos contendrán las mismas etiquetas, pero con las diferentes traducciones del string 
original que queramos utilizar, de esta manera, y asegurandonos que todo lo que mostremos por pantalla, 
lo que ubicamos en el layout, sea utilizando los strings de siguiente manera: "@string/etiquetaXml", todos estos strings variarían
en la aplicación de cada persona dependiendo del idioma elegido.
### Imágenes en drawable
Para insertar nuevas imágenes dentro de nuestro proyecto debemos introducirlas en la carpeta drawable
como drawable values files. En el caso de este proyecto utilizamos imágenes vectoriales, que tienen 
como ventaja que son reescalables, es decir, que podemos aumentarlas y reducirlas de tamaño sin perder 
calidad, esto debido a que son imágenes compuestas de vectores. 
Una vez escogidas nuestras y descargadas nuestras imágenes, las introducimos en el proyecto en drawable, 
con extensión .xml, y agregando app:srcCompat="@drawable/nombreImagen" estaríamos listos para utilizar 
las imágenes en nuestro proyecto.
### Función diferente al random
La función random, anteriormente utilizada, era la que se encargaba de decidir que imágen se iba a 
mostrar por pantalla cada vez que se presione el botón, esta función ahora es realizada por la función
shuffle(), que es una función que 'mezcla' el rango de números que le pasemos por parámetros, ambos 
incluidos, y nos devolverá el número que quede en primera posición.
### Nuevos botones con Material.io
La utilización de material.io es un supuesto fácil sobre el papel, pero una vez comenzada esta propuesta
hubo un gran cantidad de problemas llegando a un punto final en donde el programa no tenía ningun error
aparente, pero al ser instalada la aplicación esta se abría y cerraba automáticamente.
Este proceso se comienza implementando la libreria Materials de Google, después de la sincronización de
Gradle solo deberíamos cambiar el tema de nuestro proyecto en el documento Styles.xml dentro de la carpeta
values, una vez realizados estos cambios los cambios se pondrán observar en el render de nuestro layout.
En este momento se realizó la primera prueba de ejecución, dando distintos problemas, después de varios
cambios tanto en el build.gradle subiendo y bajando versiones, como varias líneas agregadas al documento
AndroidManifest.xml, para lograr, siquiera, la instalación de nuestro proyecto llegamos al punto anteriormente
mencionado, la aplicación está instalada y no tiene ningún fallo evidente, pero al ser abierta se cierra de
manera automática.