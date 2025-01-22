import model.AlwaysRockPlayer
import model.Game
import model.Player
import model.RoundResult
import util.evaluateRound

fun main(args: Array<String>) {

    val playerA = Player()
    val playerB = AlwaysRockPlayer()

    val game: Game = Game(playerA, playerB, 100)
    game.play(true)
}