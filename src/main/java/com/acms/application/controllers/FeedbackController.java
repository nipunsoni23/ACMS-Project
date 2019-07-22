package com.acms.application.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.acms.application.model.Feedback;
import com.acms.application.repository.FeedbackMongoRepository;
import com.acms.application.repository.FeedbackSearchRepository;

@Controller
public class FeedbackController {

	@Autowired
	FeedbackMongoRepository feedbackrepository;
	
	@Autowired
	FeedbackSearchRepository feedbackSearchRepository;
	
	@RequestMapping(value="/home/{s_id}",method = RequestMethod.GET)
	public String home(@PathVariable String s_id, Model model) {
		return "home";
	} 
	
	@RequestMapping(value = "/addFeedback", method = RequestMethod.POST)
	public String addFeedback(@ModelAttribute Feedback feedback) {
		feedbackrepository.save(feedback);
		return "redirect:Submit";
	}
	@RequestMapping(value = "/Submit", method = RequestMethod.GET)
		public String Submit() {
			return "Submit";
		
	}
	@RequestMapping(value = "/Search", method = RequestMethod.GET)
	public String Search() {
		return "Search";
	
}

	@RequestMapping(value = "/search")
	public String search(Model model, @RequestParam String search) {
		model.addAttribute("feedbackList", feedbackSearchRepository.searchFeedback(search));
		model.addAttribute("search", search);
		return "search";
	}
	
}
