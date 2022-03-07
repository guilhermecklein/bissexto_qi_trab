fun main() {val Bissexto = Bissexto()}

fun Bissexto(): Unit{
    println("Digite um ano que deseja:")
    val ano = readLine()!!.toInt()
if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 4 == 0 && ano % 100 == 0 && ano % 400 == 0))
    println("Este ano é um ano bissexto!")
    else
        println("Este ano não é bissexto!")

}

