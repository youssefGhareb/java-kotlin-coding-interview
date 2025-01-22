package util

import model.Move
import model.RoundResult

fun evaluateRound(playerOneMove: Move, playerTwoMove: Move): RoundResult {
    return when {
        playerOneMove == playerTwoMove -> RoundResult.DRAW
        playerOneMove == Move.ROCK && playerTwoMove == Move.SCISSORS -> RoundResult.PLAYER_ONE_WIN
        playerOneMove == Move.PAPER && playerTwoMove == Move.ROCK -> RoundResult.PLAYER_ONE_WIN
        playerOneMove == Move.SCISSORS && playerTwoMove == Move.PAPER -> RoundResult.PLAYER_ONE_WIN
        else -> RoundResult.PLAYER_TWO_WIN
    }
}