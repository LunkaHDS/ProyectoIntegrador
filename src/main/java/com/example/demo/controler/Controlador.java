package com.example.demo.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.demo.modelo.InventarioRegistros;
import com.example.demo.interfaceService.InventarioRegistrosService;
@Controller
@RequestMapping
public class Controlador {
	
		@Autowired
		private InventarioRegistros service;
		
		@GetMapping("/listar")
		public String listar(Model model) {
			List<InventarioRegistros>registros = service.listar();
			model.addAttribute("registros",registros); 
			return "index";
		}
		@RequestMapping("/register")
		public String register () {
			return "register";
		}
		@RequestMapping("/login")
		public String login () {
			return "login";
		}
		@RequestMapping(value = "/login", method = RequestMethod.POST)
		public String FormularioIMC (ModelMap model, @RequestParam String userid, @RequestParam String password) {
			if ( userid.equals("Lunka") && password.equals("admin") ) {
				List<InventarioRegistros>registros = service.listar();
				model.addAttribute("registros",registros);
				return "index";
			}
			model.put("errorMsg","Usuario y/o Contraseña incorrectos.");
			return "login";
}
		
		@PostMapping("/new")
		public String agregar(Model model) {
			model.addAttribute("registro", register ());
			return "form";
		}
		
		@PostMapping("/save")
		public String save(@Validated InventarioRegistros imc, Model model) {
			return "redirect:/listar";
		}
}