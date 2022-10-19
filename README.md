## Modificaciones realizadas dentro del proyecto
Antes de comenzar a expplicar las modificaciones realizadas dentro de este proyecto, vamos a nombrarlas:
    - Idiomas String
    - String en el layout
    - Imagenes en drawable
    - Función diferente al random
    - Nuevos botones con Material.io
### Idiomas String
En la creación de nuestra aplicación debemos tomar en cuenta la gran cantidad de personas de distintos 
paises e idiomas que podría utilizarla, para no tener problemas con esto crearemos nuevos documentos
string.xml dentro de la carpeta values, cada uno con un código de país, o idioma.
Estos documentos contendrán las mismas etiquetas, pero con las diferentes traducciones del string 
original que queramos utilizar, de esta manera, y asegurandonos que todo lo que mostremos por pantalla
sea utilizando los strings de siguiente manera: "@string/etiquetaXml", todos estos strings variarían
en la aplicación de cada persona dependiendo del idioma elegido.
