package com.Controller;
import java.util.HashMap;

import javax.servlet.ServletException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;
import com.Bean.Login;
public class ControllerClass extends SimpleFormController{
	public ModelAndView onSubmit(Object command) throws ServletException
	{
		Login detail=(Login)command;
		HashMap<String, String> hashmap=new HashMap<String,String>();
		hashmap.put("karthi", "karthi20@");
		hashmap.put("velmani", "velmani20@");
		hashmap.put("arun", "arun20@");
		hashmap.put("sabari", "sabari20@");
		hashmap.put("kapil", "kapil20@");
		String username=detail.getUsername();
		String password=detail.getPassword();
		if(hashmap.get(username) != null){
			if(hashmap.get(username).equals(password)){
				ModelAndView model = new ModelAndView("success");
				return model.addObject("msg", "success");
			}
		}
		ModelAndView model = new ModelAndView("failure");
		return model.addObject("msg", "failure");
	}    
	
}
