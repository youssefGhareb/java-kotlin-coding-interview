import model.ConstantMovePlayer
import model.Game
import model.Move
import model.Player

fun main(args: Array<String>) {

    val playerA = Player()
    val playerB = ConstantMovePlayer(Move.ROCK)

    val game = Game(playerA, playerB, 100)
    game.play(true)
}