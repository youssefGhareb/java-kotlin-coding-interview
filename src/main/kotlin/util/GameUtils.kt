package util

import model.Move
import model.RoundResult

// Function that evaluates the result of a single round between Player One and Player Two
fun evaluateRound(playerOneMove: Move, playerTwoMove: Move): RoundResult {
    return when {
        playerOneMove == playerTwoMove -> RoundResult.DRAW  // If both players choose the same move, it's a draw
        playerOneMove == Move.ROCK && playerTwoMove == Move.SCISSORS -> RoundResult.PLAYER_ONE_WIN  // Rock beats Scissors
        playerOneMove == Move.PAPER && playerTwoMove == Move.ROCK -> RoundResult.PLAYER_ONE_WIN  // Paper beats Rock
        playerOneMove == Move.SCISSORS && playerTwoMove == Move.PAPER -> RoundResult.PLAYER_ONE_WIN  // Scissors beats Paper
        else -> RoundResult.PLAYER_TWO_WIN  // If none of the above conditions are met, Player Two wins
    }
}