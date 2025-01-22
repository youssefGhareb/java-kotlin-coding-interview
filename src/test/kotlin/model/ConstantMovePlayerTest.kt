package model

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ConstantMovePlayerTest {

    @Test
    fun `ConstantMovePlayer should always play the given move`() {
        var player = ConstantMovePlayer(Move.ROCK)
        assertEquals(Move.ROCK, player.chooseMove())
        player = ConstantMovePlayer(Move.PAPER)
        assertEquals(Move.PAPER, player.chooseMove())
        player = ConstantMovePlayer(Move.SCISSORS)
        assertEquals(Move.SCISSORS, player.chooseMove())
    }
}