package br.com.unipe.exercicio.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.unipe.gabriel.moeda.Dinheiro;

@Controller
public class ConversorController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView conversor() {
		ModelAndView view = new ModelAndView("Conversor");
		return view;
	}
	
	public ModelAndView get(Model model) {
		model.addAttribute("Dinheiro", new Dinheiro());
		return new ModelAndView("Conversor");
	}
	
	public ModelAndView calculo(@ModelAttribute Dinheiro dinheiro) {
		ModelAndView view = new ModelAndView("Conversor");
		
		view.addObject("mensagem", "Valor em Dolar:" + dinheiro.Calculo());
		
		return view;
	}

}
