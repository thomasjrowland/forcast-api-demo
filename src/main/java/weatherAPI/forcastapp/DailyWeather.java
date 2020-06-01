package weatherAPI.forcastapp;

import java.util.List;

public class DailyWeather {
	
	private String startPeriodName;
	private String tempLabel;
	private String temperature;
	private String weather;
	private String iconLink;
	private String text;
	
	public String getStartPeriodName() {
		return startPeriodName;
	}
	public void setStartPeriodName(String startPeriodName) {
		this.startPeriodName = startPeriodName;
	}
	public String getTempLabel() {
		return tempLabel;
	}
	public void setTempLabel(String tempLabel) {
		this.tempLabel = tempLabel;
	}
	public String getTemperature() {
		return temperature;
	}
	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}
	public String getWeather() {
		return weather;
	}
	public void setWeather(String weather) {
		this.weather = weather;
	}
	public String getIconLink() {
		return iconLink;
	}
	public void setIconLink(String iconLink) {
		this.iconLink = iconLink;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	@Override
	public String toString() {
		return "DailyWeather [startPeriodName=" + startPeriodName + ", tempLabel=" + tempLabel + ", temperature="
				+ temperature + ", weather=" + weather + ", iconLink=" + iconLink + ", text=" + text + "]";
	}
	
	
	

}
