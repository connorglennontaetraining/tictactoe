package training.tae.connorglennon.tictactoe

/**
 * Created by Connor Glennon on 09/03/2018.
 * Code belongs to The App Experts.
 * Do not use/copy/redistribute unless you have been given permission to do so.
 */
interface TicTacToeLogic {
    fun newGame()
    fun placePiece(x: Int, y: Int): String
    fun checkResult(): String
}