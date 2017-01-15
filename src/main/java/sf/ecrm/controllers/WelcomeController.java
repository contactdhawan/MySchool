package sf.ecrm.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

@Controller
public class WelcomeController {

@RequestMapping("/welcome")
	protected ModelAndView handleRequestInternal() {
		System.out.println("In the controller");
		ModelAndView mav = new ModelAndView("Welcome");
		mav.addObject("welcomeMessage", "Welcome to Dhawan Family");
		return mav;
	}

}
