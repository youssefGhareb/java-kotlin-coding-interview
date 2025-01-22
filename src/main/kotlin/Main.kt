import model.ConstantMovePlayer
import model.Game
import model.Move
import model.Player

fun main(args: Array<String>) {

    // Creating Player A as a random move player
    val playerA = Player()

    // Creating Player B as a constant move player who always plays Rock
    val playerB = ConstantMovePlayer(Move.ROCK)

    // Creating a Game instance with Player A, Player B, and 100 rounds
    val game = Game(playerA, playerB, 100)

    // Starting the game and printing detailed results
    // set parameter to false for final game summary only
    game.play(true)
}