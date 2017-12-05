package project;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class BoardPanel extends JPanel
{
	protected Square [][] _square;
	protected Img [][] _BoardImg;
	protected Img [] _SoldierImg;
	
	public BoardPanel()
	{
		int i, j, x,y, width ;
		_square = new Square[8][8];
		_SoldierImg = new Img [24];
		_BoardImg = new Img [8][8];
		setLayout(null);
		setSize(1000,1000);
		setVisible(true);

		for (x = 0,i = 0, y =0; i < 64; i++, x += 50, y+=4)
			if ((i/8)%2 == 1)
			{
				if ((i%8)%2 == 1) //black
					_BoardImg[i/8][i%8] = new Img("Images\\blackboard.png", x, y, 100, 100);
					else //white
						_BoardImg[i/8][i%8] = new Img("Images\\whiteboard.png", x, y,100, 100);
			}
			else
			{
				if ((i%8)%2 == 1) // white
					_BoardImg[i/8][i%8] = new Img("Images\\whiteboard.png", x, y, 100, 100);
				else //black
					_BoardImg[i/8][i%8] = new Img("Images\\blackboard.png", x, y, 100, 100);
					
			}
	}

}
