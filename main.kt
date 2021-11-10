fun main() {
    val input = readLine()!!.toString()
    for (element in 0..input.length-1) {
        if (input[element].isDigit()) {
            println(input[element])
            break
        }
    }
}
