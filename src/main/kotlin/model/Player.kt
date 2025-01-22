package model

open class Player() {
    open fun chooseMove(): Move {
        return Move.values().random();
    }
}