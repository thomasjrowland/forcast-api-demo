package weatherAPI.forcastapp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ForcastService {
	
	private RestTemplate rest = new RestTemplate();
	
	public List<DailyWeather> dailyWeather() {
		
		String url = "https://forecast.weather.gov/MapClick.php?lat=38.4247341&lon=-86.9624086&FcstType=json";
		
		CurrentForcast currentForcast = rest.getForObject(url, CurrentForcast.class);
		
		Time time = currentForcast.getTime();
		Data data = currentForcast.getData();
		
		List<String> startPeriodName = time.getStartPeriodName();
		List<String> tempLabel = time.getTempLabel();
		List<String> temperature = data.getTemperature();
		List<String> weather = data.getWeather();
		List<String> iconLink = data.getIconLink();
		List<String> text = data.getText();
		
		List<DailyWeather> response = new ArrayList<>();
		
		for (int i = 0 ; i < startPeriodName.size() ; i++) {
			DailyWeather day = new DailyWeather();
			day.setStartPeriodName(startPeriodName.get(i));
			day.setTempLabel(tempLabel.get(i));
			day.setTemperature(temperature.get(i));
			day.setWeather(weather.get(i));
			day.setIconLink(iconLink.get(i));
			day.setText(text.get(i));
			
			response.add(day);
			
		}
		
		
		return response;
	}

}
