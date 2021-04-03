package ransuApl.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ransuApl.Service.RansuService;

@Controller
@RequestMapping("/ransuApl")
public class RansuAplController {

	private final RansuService ransuService;
	
	@Autowired
	public RansuAplController(RansuService ransuService) {
		this.ransuService = ransuService;
	}
	
	
	@GetMapping
	public String index(Model model) {
		
		return "ransuApl/ransu_top";
	}
	
	
}
