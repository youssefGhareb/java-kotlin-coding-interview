package model

import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

class PlayerTest {

    @Test
    fun `player always plays random moves`() {
        val player = Player()
        val move = player.chooseMove()
        assertTrue(move in listOf(Move.ROCK, Move.PAPER, Move.SCISSORS))
    }
}