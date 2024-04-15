# Control de armas
En la película *Regreso al Futuro III* todos los protagonistas se reunen en la *Fiesta de inauguración del reloj*, un momento muy emotivo en la saga por la importancia de ese reloj desde la primera película. La escena ocurre en 1885 en Hill Valey, una ciudad ficticia del Oeste americano. En ese momento, había una gran cantidad de vándalos armados, de modo que el Sheriff Strickland puso un control de armas a la entrada.

Cada vez que llegaba un nuevo grupo, les pedía a todos amablemente que entregaran sus armas, y apuntaba en su lista el nombre y el número de pertenencias entregadas. A veces lo hacían a regañadientes y tenía que pedírselas en varias iteraciones, de modo que la misma persona podía aparecer varias veces en la lista.

Cuando alguien salía, se revisaba la lista y se le devolvían todas sus armas.

## Entrada
El programa deberá procesar múltiples casos de prueba. Cada uno comienza con el número de operaciones sobre la lista (hasta 300.000). Hay dos tipos de operaciones. El primer tipo indica la llegada de una persona y se compone del nombre de la persona y el número de armas que entraga (como mucho 9). Cada nombre está formado por un máximo de 10 letras del alfabeto inglés. Como los forajidos son reticentes a entregar todas sus armas, a veces aparecen más de una vez porque se les reclaman armas adicionales tras la primera entrega, por lo que al final podrán entregar más de 9.

El segundo tipo de operación indica una salida. Comienza con un cierre de interrogación (?) seguido de la cantidad de personas que salen juntas. A continuación aparece esa cantidad de nombres. Tras esta operación se considera que todas las personas reciben sus armas y no volverán a salir, salvo que antes entren otra vez y entreguen sus armas de nuevo. En ese caso volverán a aparecer sus registros.

Se garantiza que el uso de mayúscula de los nombres es consistente, es decir que el mismo nombre aparecerña siempre igual (no aparecerá en el mismo caso de prueba McMillan y Mcmillan, por ejemplo).

La entrada termina con un 0.

## Salida
Por cada operación de salida se indicará la cantidad de armas devueltas en conjunto a todo el grupo. Tras cada caso de prueba se escribirá una línea con tres guiones (---).

## Entrada de ejemplo
```
9
Buford 1
Stubble 1
Ceegar 1
Buford 2
Buck 1
? 2 Buford Buck
Needles 1
Buford 1
? 3 Ceegar Stubble Buford
0
```

## Salida de ejemplo
```
4
3
---
```
---
<img src="https://cdn.hobbyconsolas.com/sites/navi.axelspringer.es/public/media/image/2023/03/regreso-futuro-iii-perro-rabioso-tannen-tom-wilson-2995886.jpg?tf=3840x">