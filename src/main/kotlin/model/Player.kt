package model

class Player(private var isRockPlayer: Boolean) {
    fun chooseMove(): Move {
        return if (isRockPlayer){
            Move.ROCK
        } else {
            Move.values().random()
        }
    }
}