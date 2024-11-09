fun main() {
    println("Do you like the color red? (y/n)")
    val likesRed: Boolean = readln() == "y"
    println("Do you like the color blue? (y/n)")
    val likesBlue: Boolean = readln() == "y"
    if (likesRed && likesBlue) {
        println("HOLLOW PURPLE")
    } else {
        if (likesRed) { println("REVERSAL RED") }
        else if (likesBlue) { println("LAPSE BLUE") }
        else { println("bro didn't choose anything D:<") }
    }

}