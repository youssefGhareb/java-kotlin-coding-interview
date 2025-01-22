package model

// Enum class representing the possible moves in the game
enum class Move {

    // Each constant defines its own toString method to return a custom string representation
    ROCK {
        override fun toString(): String = "Rock"
    },

    PAPER {
        override fun toString(): String = "Paper"
    },

    SCISSORS {
        override fun toString(): String = "Scissors"
    };
}
