package rocks.zipcode.io.quiz3.arrays;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {

    private String[][] board;

    public TicTacToe(String[][] board) {
        this.board = board;
    }

    public TicTacToe() {
    }

    public String[] getRow(Integer value) {
        String [] row = {board[value][0], board[value][1], board[value][2]};
        return row;
    }

    public String[] getColumn(Integer value) {
        String [] column = {board[0][value], board[1][value], board[2][value]};
        return column;
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        if(board[rowIndex][0] == board [rowIndex][1] && board[rowIndex][1] == board [rowIndex][2]){
            return true;
        } else { return false;
        }
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        if (board[0][columnIndex] == board [1][columnIndex] && board[1][columnIndex] == board[2][columnIndex]){
            return true;
        }

        return false;
    }

    public String getWinner() {
        for (int index = 0; index < 3; index++) {
            if (isRowHomogenous(index)) {
                String[] rowWins = {board[index][0]};
              if (ArrayUtils.contains(rowWins, "X")){
                  return "X";
              }else if(ArrayUtils.contains(rowWins, "O")){
                  return "O";
              }
            }
            if (isColumnHomogeneous(index)) {
                String[] columnWins = {board[0][index]};
                if (ArrayUtils.contains(columnWins, "X")){
                    return "X";
                }else if(ArrayUtils.contains(columnWins, "O")){
                    return "O";
                }
            }
        }
            if (isDiagonalHomogeneous()){
                String [] diagonalWins = {board[1][1]};
                if (ArrayUtils.contains(diagonalWins, "X")){
                    return "X";
                }else if(ArrayUtils.contains(diagonalWins, "O")){
                    return "O";
                }
            }

            return "tie";
        }


//        int counterX = 0;
//        int counterO = 0;
//        int counterEmpty = 0;
//        char inFavorOfX = 'x';
//        char inFavorOfO = '0';
//        char inFavorOfEmpty = ' ';
//        if (board[0][0] == board [0][1] && board[0][1] == board[0][2]) { //row 1 win
//            if (board[0][0].contentEquals("x") == true){
//                counterX += 1;
//            } else if (board[0][0].contentEquals("o") == true){
//                counterO += 1;
//            } else { counterEmpty += 1;
//            }
//        }else if (board[1][0] == board [1][1] && board[1][1] == board[1][2]) { //row 2 win
//            if (board[1][0].contentEquals("x") == true) {
//                counterX += 1;
//            } else if (board[1][0].contentEquals("o") == true) {
//                counterO += 1;
//            } else {
//                counterEmpty += 1;
//            }
//        }else if (board[2][0] == board [2][1] && board[2][1] == board[2][2]) { //row 3 win
//            if (board[2][0].contentEquals("x")== true) {
//                counterX += 1;
//            } else if (board[2][0].contentEquals("o") == true) {
//                counterO += 1;
//            } else {
//                counterEmpty += 1;
//            }
//        }else if (board[0][0] == board [1][0] && board[1][0] == board[2][0]) { //column 1 win
//            if (board[0][0].contentEquals("x") == true) {
//                counterX += 1;
//            } else if (board[0][0].contentEquals("o") == true) {
//                counterO += 1;
//            } else {
//                counterEmpty += 1;
//            }
//        }else if (board[0][1] == board [1][1] && board[1][1] == board[2][1]) { //column 2 win
//            if (board[0][1].contentEquals("x") == true) {
//                counterX += 1;
//            } else if (board[0][1].contentEquals("o")== true) {
//                counterO += 1;
//            } else {
//                counterEmpty += 1;
//            }
//        }else if (board[0][2] == board [1][2] && board[1][2] == board[2][2]) { //column 3 win
//            if (board[0][2].contentEquals("x") == true) {
//                counterX += 1;
//            } else if (board[0][2].contentEquals("o") == true) {
//                counterO += 1;
//            } else {
//                counterEmpty += 1;
//            }
//        }else if (board[0][0] == board [1][1] && board[1][1] == board[2][2]) { //diagonal top to bottom win
//            if (board[0][0].contentEquals("x") == true) {
//                counterX += 1;
//            } else if (board[0][0].contentEquals("o") == true) {
//                counterO += 1;
//            } else {
//                counterEmpty += 1;
//            }
//        }else if (board[2][0] == board [1][1] && board[1][1] == board[0][2]) { //diagonal bottom to top win
//            if (board[2][0].contentEquals("x") == true) {
//                counterX += 1;
//            } else if (board[2][0].contentEquals("o") == true) {
//                counterO += 1;
//            } else {
//                counterEmpty += 1;
//            }
//        }else{
//        }
//        if (counterX > counterO){
//            return String.valueOf(inFavorOfX);
//        }else if ( counterO > counterX){
//            return String.valueOf(inFavorOfO);
//        }else {
//            return "";
//        }


    

    public String [] getDiagonal(Integer firstRow){
        String [] diagonal1 = {board[0][0], board[1][1], board[2][2]};
        String [] diagonal2 = {board[2][0], board[1][1], board[0][2]};
        if (firstRow == 0){
            return diagonal1;
        } else if(firstRow == 2){
            return diagonal2;
        }else{
            return null;
        }
    }
    
    public Boolean isDiagonalHomogeneous(){
        if (board[0][0] == board [1][1] && board[1][1] == board [2][2]){
            return true;
        }else if (board[2][0] == board[1][1] && board[1][1] == board[0][2]){
            return true;
        }else{
            return false;
        }
        
        
    }

    public String[][] getBoard() {
        return null;
    }
}
