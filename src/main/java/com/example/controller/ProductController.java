package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.bindings.Product;

@Controller
public class ProductController {
	
	@GetMapping("/")
	public String getProductForm(Model model) {
		Product productobj=new Product();
		model.addAttribute("product",productobj );
		return "index";
	}
	
	@PostMapping("/product")
	public String getProductForm(Product product,Model model) {
		System.out.println(product);
		model.addAttribute("msg", "Product Saved Successfully");
		return "success";
	}

}
