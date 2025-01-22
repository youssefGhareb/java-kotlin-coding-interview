package model

data class Round(
    val roundNumber: Int,
    val playerOneMove: Move,
    val playerTwoMove: Move,
    val result: RoundResult
)
