package model

// Open class Player, designed to be inherited by other player types
open class Player() {

    // Method that randomly chooses a move for the player from the available moves
    open fun chooseMove(): Move {
        return Move.values().random();  // Randomly selects a move from the Move enum
    }
}