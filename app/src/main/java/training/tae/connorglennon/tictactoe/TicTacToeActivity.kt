package training.tae.connorglennon.tictactoe

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_tic_tac_toe.*

class TicTacToeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tic_tac_toe)
        val ticTacToeLogic: TicTacToeLogic = object : TicTacToeLogic{
            var currentPiece = "X"

            override fun newGame() {

            }

            override fun placePiece(x: Int, y: Int): String {
                when(currentPiece){
                    "X" -> {
                        currentPiece = "O"
                        return "X"
                    }
                    else-> {
                        currentPiece = "X"
                        return "O"
                    }
                }
            }

            override fun checkResult(): String {
                return "ONGOING"
            }

        }
        btn_00.setOnClickListener(OnGridSpaceSelected(0, 0, ticTacToeLogic))
        btn_01.setOnClickListener(OnGridSpaceSelected(0, 1, ticTacToeLogic))
        btn_02.setOnClickListener(OnGridSpaceSelected(0, 2, ticTacToeLogic))
        btn_10.setOnClickListener(OnGridSpaceSelected(1, 0, ticTacToeLogic))
        btn_11.setOnClickListener(OnGridSpaceSelected(1, 1, ticTacToeLogic))
        btn_12.setOnClickListener(OnGridSpaceSelected(1, 2, ticTacToeLogic))
        btn_20.setOnClickListener(OnGridSpaceSelected(2, 0, ticTacToeLogic))
        btn_21.setOnClickListener(OnGridSpaceSelected(2, 1, ticTacToeLogic))
        btn_22.setOnClickListener(OnGridSpaceSelected(2, 2, ticTacToeLogic))
    }

    class OnGridSpaceSelected(val x: Int, val y: Int, val logic: TicTacToeLogic): View.OnClickListener {
        override fun onClick(view: View?) {
            (view as Button).text = logic.placePiece(x, y)
        }
    }
}
