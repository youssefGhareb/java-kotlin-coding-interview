package util

import model.Move
import model.RoundResult
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals

class GameUtilsTest {
    @Test
    fun `evaluate round should return correct result`() {
        assertEquals(RoundResult.PLAYER_ONE_WIN, evaluateRound(Move.ROCK, Move.SCISSORS))
        assertEquals(RoundResult.PLAYER_ONE_WIN, evaluateRound(Move.SCISSORS, Move.PAPER))
        assertEquals(RoundResult.PLAYER_ONE_WIN, evaluateRound(Move.PAPER, Move.ROCK))
        assertEquals(RoundResult.PLAYER_TWO_WIN, evaluateRound(Move.ROCK, Move.PAPER))
        assertEquals(RoundResult.PLAYER_TWO_WIN, evaluateRound(Move.SCISSORS, Move.ROCK))
        assertEquals(RoundResult.PLAYER_TWO_WIN, evaluateRound(Move.PAPER, Move.SCISSORS))
        assertEquals(RoundResult.DRAW, evaluateRound(Move.ROCK, Move.ROCK))
        assertEquals(RoundResult.DRAW, evaluateRound(Move.SCISSORS, Move.SCISSORS))
        assertEquals(RoundResult.DRAW, evaluateRound(Move.PAPER, Move.PAPER))
    }
}