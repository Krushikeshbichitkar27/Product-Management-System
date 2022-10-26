package com.ProductManagementSystem.DaoImpl;

//importing  packages
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ProductManagementSystem.Dao.ProductDao;
import com.ProductManagementSystem.model.Product;

//declaring class
public class ProductDaoImpl implements ProductDao {
	//
	List<Product> pList = new ArrayList<Product>();
	// creating Scanner Object
	Scanner sc = new Scanner(System.in);

	public void addProduct() {
		// TODO Auto-generated method stub
		List<Product> pl = new ArrayList<Product>();
		pl.add(new Product(121, "Dove Daily Shine Shampoo", 750, 15));
		pl.add(new Product(161, "Dove Fresh Moisture Soap", 234, 30));
		pl.add(new Product(201, "Dove Exfoliating Body Polish Body Scrub", 580, 16));
		pl.add(new Product(23, "Dove Beauty Cream Hand Wash", 1500, 6));
		pl.add(new Product(13, "Dove Beauty Moisture Conditioning Face Wash", 160, 35));

	}

	public boolean deleteProduct(int pid) {
		// TODO Auto-generated method stub
		boolean status = false;
		Product pdel = null;
		// finding the Employees
		for (Product p1 : pList) {
			if (p1.getPid() == pid)
				pdel = p1;
		}
		// check whether the record is present
		if (pdel == null)
			status = false;
		else {
			pList.remove(pdel);
			status = true;
		}

		return status;
	}

	public void displayAll() {
		// TODO Auto-generated method stub
		for (Product p1 : pList) {
			System.out.println(p1);
		}

	}

}
