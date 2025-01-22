package model

import util.evaluateRound

class Game(
    private val playerOne: Player,
    private val playerTwo: Player,
    private val numOfRounds: Int,
) {
    private val rounds: MutableList<Round> = mutableListOf()
    private var playerOneWins = 0
    private var playerTwoWins = 0

    fun play(detailedResult: Boolean) {
        var playerOneWins = 0
        var playerTwoWins = 0
        var draws = 0

        repeat(numOfRounds){ roundNumber ->
            val playerOneMove = playerOne.chooseMove()
            val playerTwoMove = playerTwo.chooseMove()
            val result = evaluateRound(playerOneMove, playerTwoMove)

            when(result) {
                RoundResult.PLAYER_ONE_WIN -> playerOneWins++
                RoundResult.PLAYER_TWO_WIN -> playerTwoWins++
                RoundResult.DRAW -> draws++
            }

            rounds.add(
                Round(
                    roundNumber + 1,
                    playerOneMove,
                    playerTwoMove,
                    result
                )
            )
        }

        if (detailedResult) {
            detailedResultPrint();
        }

        println("Player A wins $playerOneWins of $numOfRounds rounds")
        println("Player B wins $playerTwoWins of $numOfRounds rounds")
        println("Draws: $draws of $numOfRounds rounds")
        when{
            playerOneWins > playerTwoWins -> println("The winner is Player One!")
            playerTwoWins > playerOneWins -> println("The winner is Player Two!")
            else -> println("The final result is a draw!")
        }

    }

    private fun detailedResultPrint(){
        println("Detailed Game Summary:")
        rounds.forEach { round ->
            println(
                "Round ${round.roundNumber}: " +
                        "Player One chose ${round.playerOneMove}, " +
                        "Player Two chose ${round.playerTwoMove} -> "
            )

            when (round.result) {
                RoundResult.PLAYER_ONE_WIN -> println("Player one wins this round!")
                RoundResult.PLAYER_TWO_WIN -> println("Player two wins this round!")
                RoundResult.DRAW -> println("This round ends in a draw!")
            }
        }
    }
}