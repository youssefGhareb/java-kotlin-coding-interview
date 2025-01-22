package model

// Data class representing a round in the game
data class Round(
    val roundNumber: Int,            // The round number (e.g., 1st round, 2nd round, etc.)
    val playerOneMove: Move,         // The move made by player one (Rock, Paper, or Scissors)
    val playerTwoMove: Move,         // The move made by player two (Rock, Paper, or Scissors)
    val result: RoundResult          // The result of the round (WIN, DRAW, or LOSS)
)