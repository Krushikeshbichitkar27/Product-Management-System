package com.ProductManagementSystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.ProductManagementSystem.model.Product;

/**
 * program :Product Management System code by :krushikesh date: 26-10-2022
 *
 */
public class App {

	// calling main method
	public static void main(String[] args) {
		List<Product> pl = new ArrayList<Product>();
		pl.add(new Product(121, "Dove Daily Shine Shampoo", 750, 15));
		pl.add(new Product(161, "Dove Fresh Moisture Soap", 234, 30));
		pl.add(new Product(201, "Dove Exfoliating Body Polish Body Scrub", 580, 16));
		pl.add(new Product(23, "Dove Beauty Cream Hand Wash", 1500, 6));
		pl.add(new Product(13, "Dove Beauty Moisture Conditioning Face Wash", 160, 35));
		// sorting using AIC
		System.out.println("============ Using AIC =============");
		Comparator<Product> dove = new Comparator<Product>() {

			public int compare(Product p1, Product p2) {
				// TODO Auto-generated method stub
				return p1.getProductName().compareTo(p2.getProductName());
			}

		};

		Collections.sort(pl, dove);

		for (Product p : pl) {
			System.out.println(p);
		}

	}
}
