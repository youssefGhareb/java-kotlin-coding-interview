package model

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals

class MoveTest {
    @Test
    fun `toString should return formatted move names`() {
        assertEquals("Rock", Move.ROCK.toString())
        assertEquals("Paper", Move.PAPER.toString())
        assertEquals("Scissors", Move.SCISSORS.toString())
    }
}