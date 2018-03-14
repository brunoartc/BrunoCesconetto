package br.pro.hashi.ensino.desagil.tequilada;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
public class View extends JPanel {
	private static final long serialVersionUID = 1L;


	private static final int CELL_SIZE = 50;


	private Model model;
	private Image cpuPlayerImage;
	private Image humanPlayerImage;


	public View(Model model) {
		this.model = model;

		cpuPlayerImage = loadImage("cpuPlayer");
		humanPlayerImage = loadImage("humanPlayer");

		setPreferredSize(new Dimension(model.getBoard().getNumCols() * CELL_SIZE, model.getBoard().getNumRows() * CELL_SIZE));
	}

	private Image loadImage(String filename) {
		URL url = getClass().getResource("/" + filename + ".png");
		ImageIcon icon = new ImageIcon(url);
		return icon.getImage();
	}


	private void drawImage(Graphics g, Image image, Player player) {
		g.drawImage(image, player.getCol() * CELL_SIZE, player.getRow() * CELL_SIZE, CELL_SIZE, CELL_SIZE, null);
	}

	@Override
	public void paintComponent(Graphics g) {
		int numCols = model.getBoard().getNumCols();
		int numRows = model.getBoard().getNumRows();
		g.setColor(Color.WHITE);		
		g.fillRect(0, 0, numCols* CELL_SIZE, numRows* CELL_SIZE);
		g.setColor(Color.BLACK);
		for(int x=0; x < numCols;x++){
			for(int y=0; y < numRows;y++){
				if(model.getBoard().isWall(y, x)){
					g.fillRect(x*CELL_SIZE, y*CELL_SIZE, CELL_SIZE, CELL_SIZE);
				}
			}
		}
		drawImage(g, cpuPlayerImage, model.getCpuPlayer());
		drawImage(g, humanPlayerImage, model.getHumanPlayer());

		getToolkit().sync();
    }
}
