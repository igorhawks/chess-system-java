package Aplication;
import BoardGame.Board;
import BoardGame.Position;
import Chess.ChessMatch;

import java.lang.*;

public class Main {
    public static void main(String[] args) {
        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());

    }
}
