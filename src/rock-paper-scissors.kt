import kotlin.random.Random

var playerScore: Int = 0
var computerScore: Int = 0

fun main() {
    val roundCount = enterRoundCount()
    println("You entered: $roundCount rounds")

    var roundNum = 0
    //    same as -> for (int roundNum = 1; roundNum <= roundCount; roundNum++)
    for (i in 1..roundCount) {
        println("ROUND $i\n\nChoose one:\n(r) rock\n(p) paper\n(s) scissors")
        round(i, roundCount)
        println("\nScore is $playerScore - $computerScore")
        roundNum = i
    }

    while (playerScore == computerScore) {
        roundNum++
        println("TIE BREAKER ROUND\n\nChoose one:\n(r) rock\n(p) paper\n(s) scissors")
        round(roundNum, roundCount)
        println("\nScore is $playerScore - $computerScore")
    }
    winOrLose()
}

//take in the user input and make sure it is an integer greater than 0
fun enterRoundCount(): Int {
    var roundCount: Int? = null
    while (roundCount == null) {
        print("Enter the number of rounds: ")
        val input = readln()

        try {
            roundCount = input.toInt()
        } catch (e: NumberFormatException) {
            println("Invalid input. Please enter an integer that is greater than 0.")
        }

        if (roundCount != null && roundCount < 1) {
            println("$roundCount is less than 1. Please enter an integer that is greater than 0.")
            roundCount = null
        }
    }
    return roundCount
}

fun round(roundNum: Int, roundCount: Int) {
    var userChoice: String = readln()
    while((userChoice != "r") && (userChoice != "p") && (userChoice != "s")) {
        println("choose either r, p, or s")
        userChoice = readln()
    }

    val computerNum = Random.nextInt(1, 4)
    val computerSelection: String = when (computerNum) {
        1 -> "r"
        2 -> "p"
        else -> "s"
    }

    print("You choose $userChoice. The computer chose $computerSelection.")

    val round: String = when {
        roundNum > roundCount ->  "Bonus Round ${roundNum - roundCount}"
        else -> "Round $roundNum"
    }

    if (userChoice == computerSelection) { println("\nYou tied $round!"); }
    else if (userChoice == "r" && computerSelection == "s") { println("\nYou won $round!"); playerScore++ }
    else if (userChoice == "p" && computerSelection == "r") { println("\nYou won $round!"); playerScore++ }
    else if (userChoice == "s" && computerSelection == "p") { println("\nYou won $round!"); playerScore++ }
    else { println("\nYou lost $round!"); computerScore++ }
}

fun winOrLose() {
    if (playerScore > computerScore) {
        println("\n" +
                "\n" +
                "     __      __  ______   __    __        __       __  ______  __    __  __  __ \n" +
                "    /  \\    /  |/      \\ /  |  /  |      /  |  _  /  |/      |/  \\  /  |/  |/  |\n" +
                "    \$\$  \\  /\$\$//\$\$\$\$\$\$  |\$\$ |  \$\$ |      \$\$ | / \\ \$\$ |\$\$\$\$\$\$/ \$\$  \\ \$\$ |\$\$ |\$\$ |\n" +
                "     \$\$  \\/\$\$/ \$\$ |  \$\$ |\$\$ |  \$\$ |      \$\$ |/\$  \\\$\$ |  \$\$ |  \$\$\$  \\\$\$ |\$\$ |\$\$ |\n" +
                "      \$\$  \$\$/  \$\$ |  \$\$ |\$\$ |  \$\$ |      \$\$ /\$\$\$  \$\$ |  \$\$ |  \$\$\$\$  \$\$ |\$\$ |\$\$ |\n" +
                "       \$\$\$\$/   \$\$ |  \$\$ |\$\$ |  \$\$ |      \$\$ \$\$/\$\$ \$\$ |  \$\$ |  \$\$ \$\$ \$\$ |\$\$/ \$\$/ \n" +
                "        \$\$ |   \$\$ \\__\$\$ |\$\$ \\__\$\$ |      \$\$\$\$/  \$\$\$\$ | _\$\$ |_ \$\$ |\$\$\$\$ | __  __ \n" +
                "        \$\$ |   \$\$    \$\$/ \$\$    \$\$/       \$\$\$/    \$\$\$ |/ \$\$   |\$\$ | \$\$\$ |/  |/  |\n" +
                "        \$\$/     \$\$\$\$\$\$/   \$\$\$\$\$\$/        \$\$/      \$\$/ \$\$\$\$\$\$/ \$\$/   \$\$/ \$\$/ \$\$/ \n" +
                "                                                                                \n" +
                "                                                                                \n" +
                "                                                                                \n" + "\n")
    }
    if (playerScore < computerScore) {
        println("\n" +
                " __      __  ______   __    __        __         ______    ______   ________  __  __ \n" +
                "/  \\    /  |/      \\ /  |  /  |      /  |       /      \\  /      \\ /        |/  |/  |\n" +
                "\$\$  \\  /\$\$//\$\$\$\$\$\$  |\$\$ |  \$\$ |      \$\$ |      /\$\$\$\$\$\$  |/\$\$\$\$\$\$  |\$\$\$\$\$\$\$\$/ \$\$ |\$\$ |\n" +
                " \$\$  \\/\$\$/ \$\$ |  \$\$ |\$\$ |  \$\$ |      \$\$ |      \$\$ |  \$\$ |\$\$ \\__\$\$/ \$\$ |__    \$\$ |\$\$ |\n" +
                "  \$\$  \$\$/  \$\$ |  \$\$ |\$\$ |  \$\$ |      \$\$ |      \$\$ |  \$\$ |\$\$      \\ \$\$    |   \$\$ |\$\$ |\n" +
                "   \$\$\$\$/   \$\$ |  \$\$ |\$\$ |  \$\$ |      \$\$ |      \$\$ |  \$\$ | \$\$\$\$\$\$  |\$\$\$\$\$/    \$\$/ \$\$/ \n" +
                "    \$\$ |   \$\$ \\__\$\$ |\$\$ \\__\$\$ |      \$\$ |_____ \$\$ \\__\$\$ |/  \\__\$\$ |\$\$ |_____  __  __ \n" +
                "    \$\$ |   \$\$    \$\$/ \$\$    \$\$/       \$\$       |\$\$    \$\$/ \$\$    \$\$/ \$\$       |/  |/  |\n" +
                "    \$\$/     \$\$\$\$\$\$/   \$\$\$\$\$\$/        \$\$\$\$\$\$\$\$/  \$\$\$\$\$\$/   \$\$\$\$\$\$/  \$\$\$\$\$\$\$\$/ \$\$/ \$\$/ \n" +
                "                                                                                     \n" +
                "                                                                                     \n" +
                "                                                                                     \n")
    }
}