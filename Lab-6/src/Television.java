
public class Television {
	private String manufacturer = "";
	private int screenSize;
	private boolean powerOn;
	private int volume;
	private int channel;
	
	public Television(String manufacturer, int screenSize) {
		this.manufacturer = manufacturer;
		this.screenSize = screenSize;
		powerOn = false;
		volume = 20;
		channel = 2;
	}
	
	public void setChannel(int channel) {
		this.channel = channel;
	}
	
	public void power() {
		this.powerOn = true;
	}
	
	public void increaseVolume() {
		if(volume!=100)
			volume++;
	}
	
	public void decreaseVolume() {
		if(volume != 0)
			volume--;
	}
	
	public int getChannel() {
		return channel;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public String getManufacturer() {
		return manufacturer;
	}
	
	public int getScreenSize() {
		return screenSize;
	}
	

}
