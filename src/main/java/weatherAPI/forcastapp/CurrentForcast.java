package weatherAPI.forcastapp;

public class CurrentForcast {
	
	private Time time;
	private Data data;
	
	
	public Time getTime() {
		return time;
	}
	public void setTime(Time time) {
		this.time = time;
	}
	public Data getData() {
		return data;
	}
	public void setData(Data data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "CurrentForcast [time=" + time + ", data=" + data + "]";
	}
	
	
	

}
