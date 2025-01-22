package model

import util.evaluateRound

// Represents a game between two players, tracking the results of each round and determining the final outcome
class Game(
    private val playerOne: Player,      // Player One who will participate in the game
    private val playerTwo: Player,      // Player Two who will participate in the game
    private val numOfRounds: Int        // Total number of rounds to play in the game
) {
    val rounds: MutableList<Round> = mutableListOf()  // List to store the results of each round
    var playerOneWins = 0  // Counter to track Player One's wins
    var playerTwoWins = 0  // Counter to track Player Two's wins
    var draws = 0          // Counter to track the number of draws

    // Main method to simulate the game, plays all rounds and prints the results
    fun play(detailedResult: Boolean) {
        repeat(numOfRounds) { roundNumber ->
            // Each player chooses their move
            val playerOneMove = playerOne.chooseMove()
            val playerTwoMove = playerTwo.chooseMove()

            // Evaluate the round result based on the chosen moves
            val result = evaluateRound(playerOneMove, playerTwoMove)

            // Update win/draw counters based on the round result
            when (result) {
                RoundResult.PLAYER_ONE_WIN -> playerOneWins++
                RoundResult.PLAYER_TWO_WIN -> playerTwoWins++
                RoundResult.DRAW -> draws++
            }

            // Store round details in the rounds list
            rounds.add(
                Round(
                    roundNumber + 1,
                    playerOneMove,
                    playerTwoMove,
                    result
                )
            )
        }

        // Optionally print detailed round-by-round results
        if (detailedResult) {
            detailedResultPrint()
        }

        // Print overall game statistics
        println("Player A wins $playerOneWins of $numOfRounds rounds")
        println("Player B wins $playerTwoWins of $numOfRounds rounds")
        println("Draws: $draws of $numOfRounds rounds")

        // Print the final winner or declare a draw if applicable
        when {
            playerOneWins > playerTwoWins -> println("The winner is Player One!")
            playerTwoWins > playerOneWins -> println("The winner is Player Two!")
            else -> println("The final result is a draw!")
        }
    }

    // Helper method to print detailed results of each round
    private fun detailedResultPrint() {
        println("Detailed Game Summary:")
        rounds.forEach { round ->
            println(
                "Round ${round.roundNumber}: " +
                        "Player One chose ${round.playerOneMove}, " +
                        "Player Two chose ${round.playerTwoMove} -> "
            )

            // Print round outcome
            when (round.result) {
                RoundResult.PLAYER_ONE_WIN -> println("Player one wins this round!")
                RoundResult.PLAYER_TWO_WIN -> println("Player two wins this round!")
                RoundResult.DRAW -> println("This round ends in a draw!")
            }

            println("-----------------------------------------------")
        }
    }
}