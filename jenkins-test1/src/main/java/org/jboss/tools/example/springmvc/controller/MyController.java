package org.jboss.tools.example.springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.loits.bank.pawn.mvc.FireRules;
import com.loits.sample.new_test1.Person;



@Controller
@RequestMapping(value="/mc")
public class MyController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String displayRecords(Model model, HttpServletRequest request) {
		

		FireRules test=new FireRules();
		
		Person person=new Person();
		person.setName("Initial");
		person.setAge(25);
		test.runRules(person, "Person", "com.acme.hello.helloproject");
		System.out.println("Calling rule Helloworld : " + person.getName() + person.getAge());
		
		return "mc";
	}
	
}
