# AlgorithmExercisesJava

Este repositorio contiene una colección de ejercicios de algoritmos resueltos en Java. Está diseñado para practicar lógica de programación, estructuras de datos y técnicas de resolución de problemas.

Es un proyecto Maven organizado por temas (siguiendo los de [NeetCode](https://neetcode.io/roadmap)): cada técnica o estructura de datos tiene su paquete en `src/main/java/` (`twopointers`, `trees`, ...), con una clase por problema y su prueba unitaria en espejo en `src/test/java/`. Los tipos auxiliares compartidos (como `TreeNode`) viven en el paquete `common`.

## Ejercicios

| Tema | Ejercicio | Problema | Técnica | Complejidad |
|---|---|---|---|---|
| `twopointers` | [`TwoSumLessThanK`](src/main/java/twopointers/TwoSumLessThanK.java) | [Two Sum Less Than K (LeetCode 1099)](https://leetcode.com/problems/two-sum-less-than-k/) | Ordenamiento + dos punteros | O(n log n) |
| `trees` | [`SumOfLeftLeaves`](src/main/java/trees/SumOfLeftLeaves.java) | [Sum of Left Leaves (LeetCode 404)](https://leetcode.com/problems/sum-of-left-leaves/) | Recursión sobre árbol binario | O(n) |

## Requisitos

- JDK 25 o superior (el código compila con `release` 25, la versión LTS más reciente).
- No hace falta instalar Maven: el proyecto incluye el Maven Wrapper (`mvnw`).

## Estructura del proyecto

```
src/main/java/
├── common/           Tipos compartidos (TreeNode, ...)
├── twopointers/      Ejercicios de dos punteros
└── trees/            Ejercicios de árboles
src/test/java/        Pruebas unitarias (JUnit Jupiter), espejo de main
.github/              CI (GitHub Actions) y Dependabot
pom.xml               Configuración de Maven
```

## Compilar y ejecutar las pruebas

```bash
./mvnw test           # Linux/macOS
mvnw.cmd test         # Windows
```

(O `mvn test` si tienes Maven instalado.) También puedes abrir el proyecto en cualquier IDE con soporte Maven (IntelliJ, Eclipse, NetBeans, VS Code).

## Agregar un ejercicio nuevo

1. Crea la clase de la solución en el paquete del tema que corresponda (p. ej. `src/main/java/slidingwindow/`), creando el paquete si no existe. Documenta la clase con un Javadoc que incluya la URL del problema y la complejidad.
2. Crea la prueba correspondiente en `src/test/java/` bajo el mismo paquete. Usa `@ParameterizedTest` para agrupar casos.
3. Si necesitas un tipo auxiliar reutilizable (`ListNode`, `TreeNode`, ...), ponlo en `common`.
4. Añade la fila del ejercicio a la tabla de este README.

## Licencia

[MIT](LICENSE)
