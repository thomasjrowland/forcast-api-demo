package weatherAPI.forcastapp;

import java.util.Arrays;
import java.util.List;

public class Time {
	
	private List<String> startPeriodName;
	private List<String> tempLabel;
	
	public List<String> getStartPeriodName() {
		return startPeriodName;
	}
	public void setStartPeriodName(List<String> startPeriodName) {
		this.startPeriodName = startPeriodName;
	}
	public List<String> getTempLabel() {
		return tempLabel;
	}
	public void setTempLabel(List<String> tempLabel) {
		this.tempLabel = tempLabel;
	}
	@Override
	public String toString() {
		return "Time [startPeriodName=" + startPeriodName + ", tempLabel=" + tempLabel + "]";
	}
	
	
	

}
