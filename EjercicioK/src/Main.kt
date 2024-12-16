import kotlin.math.PI

fun main() {
    do {
        println("Calculadora de Áreas \nElija una figura geométrica:")
        println("1. Cuadrado")
        println("2. Círculo")
        println("3. Triángulo")
        println("4. Salir")

        val opcion = readLine()!!.toInt()
        when (opcion) {
            1 -> { // Cuadrado
                println("Ingrese el lado del cuadrado:")
                val lado = readLine()!!.toDouble()
                println("Área del cuadrado: ${areaCuadrado(lado, lado)}")
            }
            2 -> { // Circulo
                println("Ingrese el radio del círculo:")
                val radio = readLine()!!.toDouble()
                println("Área del círculo: ${areaCirculo(radio)}")
            }
            3 -> { // Triángulo
                println("Ingrese la base del triángulo:")
                val base = readLine()!!.toDouble()
                println("Ingrese la altura del triángulo:")
                val altura = readLine()!!.toDouble()
                println("Área del triángulo: ${areaTriangulo(base, altura)}")
            }
            4 -> println("Saliendo de la calculadora.")
            else -> println("Opción no válida, por favor intente de nuevo.")
        }
    } while (opcion != 4)
}

fun areaCuadrado(a: Double, b: Double): Double {
    return a * b
}

fun areaCirculo(radio: Double): Double {
    return PI * radio * radio
}

fun areaTriangulo(base: Double, altura: Double): Double {
    return (base * altura) / 2
}
