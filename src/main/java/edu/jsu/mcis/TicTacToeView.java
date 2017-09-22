package edu.jsu.mcis;

public class TicTacToeView {

    private TicTacToeModel model;
    
    /* CONSTRUCTOR */
	
    public TicTacToeView(TicTacToeModel model) {
        
        this.model = model;
        
    }
	
    public void viewModel() {
        
        /* Print the board to the console (see examples) */
        
        /* INSERT YOUR CODE HERE */
		
		String firstRow = " ";
		String[] rows = new String[model.getWidth()];
		
		for(int i = 0; i < model.getWidth(); i++) {
			firstRow = firstRow + i;
		}
		System.out.println(firstRow);
		for(int i = 0; i < model.getWidth(); i++) {
			rows[i] = " " + i;
			for(int j = 0; j < model.getWidth(); j++) {
				rows[i] = rows[i] + model.getMark(i, j);
			}
			System.out.println(rows[i]);
		}

    }

    public void showNextMovePrompt() {

        /* Display a prompt for the player's next move (see examples) */

        /* INSERT YOUR CODE HERE */
		
		if(model.isXTurn() == true) {
			System.out.println("Player X's turn: ");
		}
		else System.out.println("Player O's turn: ");

    }

    public void showInputError() {

        /* Display an error if input is invalid (see examples) */

        /* INSERT YOUR CODE HERE */
		
		System.out.println("Invalid input!");

    }

    public void showResult(String r) {

        /* Display final winner */

        System.out.println(r + "!");

    }
	
}