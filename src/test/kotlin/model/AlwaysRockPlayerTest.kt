package model

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class AlwaysRockPlayerTest {

    @Test
    fun `AlwaysRockPlayer should always play ROCK`() {
        val playerA = AlwaysRockPlayer()
        assertEquals(Move.ROCK, playerA.chooseMove())
    }
}