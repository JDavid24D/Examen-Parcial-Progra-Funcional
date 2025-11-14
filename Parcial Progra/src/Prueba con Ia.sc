//pregunta 1
def myMethod(datos: List[Double]): Double = {
  val promedio = datos.sum / datos.size
  val sumaCuadrados = datos.map(d => math.pow(d - promedio, 2)).sum
  math.sqrt(sumaCuadrados / datos.size)
}
//use la ia para verificar el primer ejercicio
//Perfecto, ahora sí queda clarísimo 👍
//✔️ Sí, tu versión con valores por defecto funciona
//Poner:
//def metodo(datos: List[Double] = List(7.8,5.6,8.8)): Double = { ... }
//está bien SOLO para verificar que el cálculo funciona.
//Eso no es un error.
//❗ Pero para responder la pregunta del ejercicio, debes dejarlo sin valores por defecto, porque:
//el método original en Java recibe una lista, no la crea
//la transformación debe mantener la firma
//el objetivo es pasar de imperativo a funcional

// use valores solo para verificar el uso del programa