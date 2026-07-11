# AlgorithmExercisesJava

Este repositorio contiene una colección de ejercicios de algoritmos resueltos en Java. Está diseñado para practicar lógica de programación, estructuras de datos y técnicas de resolución de problemas.

Es un proyecto Maven organizado por temas: cada técnica o estructura de datos tiene su paquete en `src/main/java/` (`arrays`, `trees`, ...), con una clase por problema y su prueba unitaria en espejo en `src/test/java/`. Los tipos auxiliares compartidos (como `TreeNode`) viven en el paquete `common`.

## Ejercicios

| Tema | Ejercicio | Problema | Técnica |
|---|---|---|---|
| `arrays` | [`TwoSumLessThanK`](src/main/java/arrays/TwoSumLessThanK.java) | [Two Sum Less Than K](https://leetcode.com/problems/two-sum-less-than-k/) | Ordenamiento + dos punteros |
| `trees` | [`SumOfLeftLeaves`](src/main/java/trees/SumOfLeftLeaves.java) | [Sum of Left Leaves](https://leetcode.com/problems/sum-of-left-leaves/) | Recursión sobre árbol binario |

## Requisitos

- JDK 25 o superior (el código compila con `release` 25, la versión LTS más reciente).
- No hace falta instalar Maven: el proyecto incluye el Maven Wrapper (`mvnw`).

## Estructura del proyecto

```
src/main/java/
├── common/           Tipos compartidos (TreeNode, ...)
├── arrays/           Ejercicios de arreglos
└── trees/            Ejercicios de árboles
src/test/java/        Pruebas unitarias (JUnit 4), espejo de main
pom.xml               Configuración de Maven
```

## Compilar y ejecutar las pruebas

```bash
./mvnw test           # Linux/macOS
mvnw.cmd test         # Windows
```

(O `mvn test` si tienes Maven instalado.) También puedes abrir el proyecto en cualquier IDE con soporte Maven (IntelliJ, Eclipse, NetBeans, VS Code).

## Agregar un ejercicio nuevo

1. Crea la clase de la solución en el paquete del tema que corresponda (p. ej. `src/main/java/strings/`), creando el paquete si no existe. Incluye la URL del problema como comentario de cabecera.
2. Crea la prueba correspondiente en `src/test/java/` bajo el mismo paquete.
3. Si necesitas un tipo auxiliar reutilizable (`ListNode`, `TreeNode`, ...), ponlo en `common`.
4. Añade la fila del ejercicio a la tabla de este README.
