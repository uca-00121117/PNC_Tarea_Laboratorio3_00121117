package com.uca.capas.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.domain.Product;

@Controller 
public class ProductController 
{
private List<Product> productos = new ArrayList<>();
	
	@GetMapping("/comprarProducto")
	public ModelAndView comprarProducto() {
		ModelAndView mav = new ModelAndView();
		productos.add(new Product(0, "Fifa 20", 100));
		productos.add(new Product(1, "GTA 5", 40));
		productos.add(new Product(2, "COD MW3", 9999));
		productos.add(new Product(3, "PES 20", 0));
		productos.add(new Product(4, "SSB", 15));
		
		mav.setViewName("select");
		mav.addObject("product", new Product());
		mav.addObject("producto", productos);

		return mav;
	}
	
	@PostMapping("/validar")
	public ModelAndView validar(Product product) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("product", productos.get(product.getId()).getNombre());
		if(productos.get(product.getId()).getCantidad() >= product.getCantidad() && product.getCantidad() > 0) {
			mav.setViewName("compra");
		}else {
			mav.setViewName("error");
		}
		return mav;
	}
}
