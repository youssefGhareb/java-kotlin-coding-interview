package model

class AlwaysRockPlayer : Player(){
    override fun chooseMove(): Move {
        return Move.ROCK
    }
}