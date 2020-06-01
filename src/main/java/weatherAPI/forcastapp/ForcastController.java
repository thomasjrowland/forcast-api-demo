package weatherAPI.forcastapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ForcastController {
	
	@Autowired
	private ForcastService service;
	
	@RequestMapping("/")
	public String currentForcast(Model model) {
		
		List<DailyWeather> forcast = service.dailyWeather();
		
		model.addAttribute("forcast", forcast);
		
		return "current-forcast";
	}

}
