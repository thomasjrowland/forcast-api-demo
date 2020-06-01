package weatherAPI.forcastapp;

import java.util.Arrays;
import java.util.List;

public class Data {
	
	private List<String> temperature;
	private List<String> weather;
	private List<String> iconLink;
	private List<String> text;
	
	public List<String> getTemperature() {
		return temperature;
	}
	public void setTemperature(List<String> temperature) {
		this.temperature = temperature;
	}
	public List<String> getWeather() {
		return weather;
	}
	public void setWeather(List<String> weather) {
		this.weather = weather;
	}
	public List<String> getIconLink() {
		return iconLink;
	}
	public void setIconLink(List<String> iconLink) {
		this.iconLink = iconLink;
	}
	public List<String> getText() {
		return text;
	}
	public void setText(List<String> text) {
		this.text = text;
	}
	
	@Override
	public String toString() {
		return "Data [temperature=" + temperature + ", weather=" + weather + ", iconLink=" + iconLink + ", text=" + text
				+ "]";
	}
	
}
	
	
	
	