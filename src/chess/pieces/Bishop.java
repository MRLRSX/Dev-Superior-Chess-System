package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.enums.Color;

public class Bishop extends ChessPiece{
  
	public Bishop(Board board, Color color) {
		super(board, color);
	}
	
	@Override
	public String toString() {
		return "B";
	}
	
	@Override
	public boolean[][] possibleMoves(){
		boolean[][] matriz= new boolean[getBoard().getRows()][getBoard().getColumns()];
		Position position = new Position(0, 0);
		
		position.setValues(position.getRow() - 1, position.getColumn() - 1);
		while (getBoard().positionExists(position) && !getBoard().thereIsAPiece(position)) {
			matriz[position.getRow()][position.getColumn()] = true;
			position.setValues(position.getRow() - 1, position.getColumn() - 1);
		}
		if (getBoard().positionExists(position) && isThereOpponentPiece(position)) {
			matriz[position.getRow()][position.getColumn()] = true;
		}
		
		
		position.setValues(position.getRow() - 1, position.getColumn() + 1);
		while (getBoard().positionExists(position) && !getBoard().thereIsAPiece(position)) {
			matriz[position.getRow()][position.getColumn()] = true;
			position.setValues(position.getRow() - 1, position.getColumn() + 1);
		}
		if (getBoard().positionExists(position) && isThereOpponentPiece(position)) {
			matriz[position.getRow()][position.getColumn()] = true;
		}
		
		
		position.setValues(position.getRow() + 1, position.getColumn() + 1);
		while (getBoard().positionExists(position) && !getBoard().thereIsAPiece(position)) {
			matriz[position.getRow()][position.getColumn()] = true;
			position.setValues(position.getRow() + 1, position.getColumn() + 1);
		}
		if (getBoard().positionExists(position) && isThereOpponentPiece(position)) {
			matriz[position.getRow()][position.getColumn()] = true;
		}
		
		
		position.setValues(position.getRow() + 1, position.getColumn() - 1);
		while (getBoard().positionExists(position) && !getBoard().thereIsAPiece(position)) {
			matriz[position.getRow()][position.getColumn()] = true;
			position.setValues(position.getRow() + 1, position.getColumn() - 1);
		}
		if (getBoard().positionExists(position) && isThereOpponentPiece(position)) {
			matriz[position.getRow()][position.getColumn()] = true;
		}
		
		return matriz;
		
	}
}
