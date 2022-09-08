package boardgame;

public abstract class Piece {
	protected Position position;
	private Board board;

	public Piece(Board board) {
		this.board = board;
		this.position = null;
	}

	protected Board getBoard() {
		return board;
	}
	
	public abstract boolean[][] possibleMoves();
	
	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}
	
	public boolean isThereAnyPossibleMove() {
		boolean[][] matriz = possibleMoves();
		for(int x = 0; x < matriz.length; x++) {
			for(int y = 0; y < matriz.length; y++) {
				if(matriz[x][y]) {
					return true;
				}
			}
		}
		return false;
	}

}
