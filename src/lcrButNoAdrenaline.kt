fun main() {
    val playerList = getPlayers()

    val totalChips: Int = playerList.size * 3
    print("totalChips: $totalChips")


}

fun getPlayers(): MutableList<Player> {
    var allPlayersEntered = false
    val playerList = mutableListOf<Player>()

    while (!allPlayersEntered) {
        println("Enter player name or 'done' to finish entering players")
        val newPlayerName = readln()
        if (newPlayerName.lowercase() != "done") {
            playerList.add(Player(newPlayerName, 3))
        } else { allPlayersEntered = true }
    }
    for (i in 0..< playerList.size) {
        println("name: ${playerList[i].name},\tchips: ${playerList[i].chips}")
    }
    return playerList
}

class Player(val name: String, var chips: Int)

fun playGame() {

}