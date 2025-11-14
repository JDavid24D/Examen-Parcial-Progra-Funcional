def metodo(datos: List[Double] = List(7.8,5.6,8.8)): Double = {
  val promedio = datos.sum / datos.size
  val sumaCuadrados = datos.map(diferencia => math.pow(diferencia - promedio, 2)).sum
  math.sqrt(sumaCuadrados / datos.size)
}

//pregunta 2

val Lista: List[Double] = List(10,8,5,8)
def politicas(n: List(Double)): Double =
  if(n>9)-1


//pregunta 3
def saludo(nombre : String):String = "Hola como estas, " + nombre
saludo("David")




