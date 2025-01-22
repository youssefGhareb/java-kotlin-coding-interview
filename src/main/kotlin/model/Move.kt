package model

enum class Move {
    ROCK {
        override fun toString(): String = "Rock"
    },
    PAPER {
        override fun toString(): String = "Paper"
    },
    SCISSORS {
        override fun toString(): String = "Scissors"
    };

    abstract override fun toString(): String
}