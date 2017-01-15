package sf.ecrm.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class WelcomeController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req,
			HttpServletResponse res) throws Exception {
		System.out.println("In the controller");
		ModelAndView mav = new ModelAndView("Welcome");
		mav.addObject("welcomeMessage", "Welcome to Dhawan Family");
		return mav;
	}

}
