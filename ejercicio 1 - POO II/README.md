# **1. Crear una clase llamada Círculo la cual contiene:**

a. Dos variables de instancia privada: radio (de tipo double) y color (de tipo String), con valor por defecto de 12.5 y "azul", respectivamente.
b. Dos constructores sobrecargados (overloaded): un constructor predeterminado o por default sin argumentos y otro constructor que tiene un argumento de input double para el valor del radio.
c. Dos métodos públicos: getRadio() y getArea(), que devuelven el radio y el área de esta instancia, respectivamente. Para calcular el área de un círculo, deberás seguir la siguiente fórmula: area = radius*radius*Math.PI

## **2. Compilar y ejecutar la clase "Circulo.java". ¿Puedes ejecutar la clase “Circulo.java”? ¿Por qué?**

No, porque no tiene un método principal definido.

## **3. Crear una clase CirculoTest, esta clase contendrá el método main() para poder visualizar los siguientes datos:**

Utilizando un constructor por defecto para imprimir:
a. El radio de un círculo.
b. El área de un círculo. 
Utilizando un constructor sobrecargado, donde radio es igual a 6.55, para imprimir:
a. El radio de un círculo.
b. El área de un círculo. 

## **¿Qué pasos en común debe realizaste para ejecutar cada uno de los ejercicios?**

Describir conceptos del paradigma orientada a objetos.
Se crearon dos objetos llamados “circulo 1” y “circulo2”, ambos pertenecen a la clase circulo, se le otorga los valores de sus atributos llamando a los constructores de la clase. Para poder observar los valores de los radios y las areas se llama al metodo “getRadio()” y al método “getArea()” respectivamente, ambos los colocamos en System.out.print para poder imprimirlos.

## **4. Ejecutar la clase “CirculoTest.java” y responde las siguientes preguntas:**

## **a. ¿Qué es el constructor y para qué sirve?**

Permite inicializar los valores de los objetos.

## **b. ¿Con qué método recupero el radio del círculo?**

getRadio()

## **c. ¿Por qué los atributos son privados y los métodos son públicos?**

Se utiliza el encapsulamiento para la protección de los valores de los atributos y que estos solo puedan modificarse a través de los métodos que definimos, los cuales si son accesibles.

## **d. ¿Qué pasa si accedes directamente a los atributos del círculo desde el método main()?**

No se podría compilar ya que los valores de los atributos solo pueden ser accedidos directamente dentro de la clase Circulo y otra clase no puede tener acceso ya que son privados.

## **e. ¿Qué pasa si modificas directamente el atributo area del círculo desde el método main()?**

Podría asignarle un valor al área que no sigue la lógica del calculo de área, lo cual hace a mi programa poco fiable.

## **Diagrama de clases en PlantUML:**

//www.plantuml.com/plantuml/png/RO_12i8m343l_OgmqqGSUFKW4_z0lOc7s8PIxHP9Mo_3VtV3RHHSZk-HHrA7Y19JuzKBzHCjGK4F4ksqusq1dO9-jCSGuEX49yy36sS3XjFT4mWQnna-Ht6j1SsUPSRhgL2k5bXUolt8BSNJeCfbTn32KNtK_yqN2X6wRFFDpa23hYr_frvlW6B3LEWR-MPLxUVlTv02gffQanh_1G00



## ** f. En la clase “CirculoTest.java”, ejecuta la siguiente instrucción: System.out.println(c1.radius), donde c1 es una instancia del objeto Círculo. ¿Qué ocurió?. Explique el mensaje de error.** 
No se puede llamar a los valores directamente, solo mediante getters.
## ** g. En la clase “CirculoTest.java”, ejecuta la siguiente instrucción: c1.radius=42.0, donde c1 es una instancia del objeto Círculo. ¿Qué ocurió?. Explique el mensaje de error. **
No se puede asignar valores directamente.
## ** h. ¿Con qué método modificas el valor de un atributo de la clase “Circulo.java”? **
Mediante el constructor se puede asignar el valor del radio, no directamente.
## ** i. Crear un objeto de tipo Círculo y modifica los valores por defecto. **
## ** j. ¿Para qué sirve la palabra reservada “this”?. Modifique el constructor con argumentos (radio y color) y utiliza “this” y métodos setters en la clase “Circulo.java”. ** 
para diferenciar el nombre del argumento con el atributo de la clase
## ** k. ¿Para qué sirve el método toString()?  **
Devuelve los datos en string
## ** l. Incluir el método toString() en la clase “Circulo.java”. **