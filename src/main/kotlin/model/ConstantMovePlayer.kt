package model

// Represents a player who always chooses one specific move
class ConstantMovePlayer(private val move: Move) : Player(){
    // Override the chooseMove method to always return the constant move
    override fun chooseMove(): Move {
        return move
    }
}