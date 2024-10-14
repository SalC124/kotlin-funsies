//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val name = "Kotlin"
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    println("Hello, " + name + "!")

    // name = "you can't change a val"

    println("Hello, $name!")


    for (i in 1..5) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        println("i + 1 = ${i + 1}")
    }
    var money: Float = 1000.0F

    println("money = \$$money")

    var dollarBills: Int? = 1000

    println("dollar bills = \$$dollarBills")

    dollarBills = null

    println("null safety with Int? (it isnt by default) -> $dollarBills")
}