package model

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class GameTest {
    @Test
    fun `game should play all rounds`() {
        val player1 = Player()
        val player2 = AlwaysRockPlayer()
        val game = Game(player1, player2, 5)
        game.play(true)
        assertEquals(5,game.draws + game.playerOneWins + game.playerTwoWins)
    }
}