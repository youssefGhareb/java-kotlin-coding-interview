import model.Player
import model.RoundResult
import util.evaluateRound

fun main(args: Array<String>) {
    println("Hello World!")
    val playerA = Player(false)
    val playerB = Player(true)

    var playerAWins = 0
    var playerBWins = 0

   repeat(100) {
       val result = evaluateRound(playerA.chooseMove(), playerB.chooseMove())
       if(result == RoundResult.WIN){
           playerAWins++
       } else {
           playerBWins++
       }
   }
}