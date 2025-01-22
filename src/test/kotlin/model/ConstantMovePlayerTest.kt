package model

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ConstantMovePlayerTest {

    @Test
    fun `AlwaysRockPlayer should always play ROCK`() {
        val playerA = ConstantMovePlayer(Move.ROCK)
        assertEquals(Move.ROCK, playerA.chooseMove())
    }
}