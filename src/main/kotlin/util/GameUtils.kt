package util

import model.Move
import model.RoundResult

fun evaluateRound(move1: Move, move2: Move): RoundResult {
    return when {
        move1 == move2 -> RoundResult.DRAW
        move1 == Move.ROCK && move2 == Move.SCISSORS -> RoundResult.WIN
        move1 == Move.PAPER && move2 == Move.ROCK -> RoundResult.WIN
        move1 == Move.SCISSORS && move2 == Move.PAPER -> RoundResult.WIN
        else -> RoundResult.LOSE
    }
}