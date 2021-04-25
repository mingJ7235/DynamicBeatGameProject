package dynamic_beat11;

public class Track {
	private String titleImage; //제목
	private String startImage ; //게임 선택 창 표지 이미지
	private String gameimage; //해당곡 실행 시 표징 이미지
	private String startMusic; //게임 선택 창 음악
	private String gameMusic;//해당곡 실행했을 때 음악
	
	public String getTitleImage() {
		return titleImage;
	}
	public void setTitleImage(String titleImage) {
		this.titleImage = titleImage;
	}
	public String getStartImage() {
		return startImage;
	}
	public void setStartImage(String startImage) {
		this.startImage = startImage;
	}
	public String getGameimage() {
		return gameimage;
	}
	public void setGameimage(String gameimage) {
		this.gameimage = gameimage;
	}
	public String getStartMusic() {
		return startMusic;
	}
	public void setStartMusic(String startMusic) {
		this.startMusic = startMusic;
	}
	public String getGameMusic() {
		return gameMusic;
	}
	public void setGameMusic(String gameMusic) {
		this.gameMusic = gameMusic;
	}
	
	public Track(String titleImage, String startImage, String gameimage, String startMusic, String gameMusic) {
		super();
		this.titleImage = titleImage;
		this.startImage = startImage;
		this.gameimage = gameimage;
		this.startMusic = startMusic;
		this.gameMusic = gameMusic;
	} 
	
	
}
