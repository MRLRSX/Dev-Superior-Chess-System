package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;
import chess.enums.Color;

public class ChessPiece extends Piece{
   
	private Color color;
	private Integer moveCount;
	
	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}
	
	public Color getColor() {
		return color;
	}
	public Integer getMoveCount() {
		return moveCount;
	}
	
	protected  void increaseMoveCount() {
		this.moveCount++;
	}
	protected void decreaseMoveCount() {
		this.moveCount --;
	}
	
	public ChessPosition getChessPosition() {
		return ChessPosition.fromPosition(position);
	}
	
	protected boolean isThereOpponentPiece(Position position) {
		ChessPiece chessPiece = (ChessPiece)getBoard().piece(position);
		return chessPiece != null && chessPiece.getColor() != this.color;
	}

	@Override
	public boolean[][] possibleMoves() {
		// TODO Auto-generated method stub
		return null;
	}
}
