package dynamic_beat3;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class DynamicBeat extends JFrame{
	
	private Image screenImage;
	private Graphics screenGraphic;
	
	private Image introBackground; 
	
	public DynamicBeat() {
		setTitle("Dynamic Beat");
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		setResizable(false);
		//프로그램이 정중앙에 오도록 함
		setLocationRelativeTo(null);
		//창을 끄면 프로그램이 종료되도록 함 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		introBackground = new ImageIcon(Main.class.getResource("../images/introBackground.jpg")).getImage();
		
		Music introMusic = new Music("introMusic.mp3", true);
		introMusic.start();
		
		
	}
	
	//더블 버퍼링 방법 -> 버퍼에 이미지를 담아서 매순간 이미지를 로딩함 
	
	//paint라는 약속된 메소드가 있다. 프로그램 화면크기만큼 이미지를 받아와서 그려준다 - > screenDraw로 그려준다.
	public void paint(Graphics g) {
		screenImage = createImage(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		screenGraphic = screenImage.getGraphics();
		screenDraw(screenGraphic);
		g.drawImage(screenImage, 0, 0, null);
	}
	
	//repaint로 계속 이 프로그램이 돌아가면서 화면에 지속적으로 그려준다. 
	public void screenDraw (Graphics g) {
		g.drawImage(introBackground, 0, 0, null);
		this.repaint();
	}
	
	
}














