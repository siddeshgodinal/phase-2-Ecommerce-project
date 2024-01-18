package com.app.ecommerce.Test;

import org.testng.annotations.Test;

import com.app.com.app.DatabaseConnecttion.ProductDAO;

public class ECommerceApp {
	@Test
	public void testCheckStockAvailability() {
        String productName = "tablet";
        ProductDAO productDAO = new ProductDAO();
        int stockQuantity = productDAO.getStockQuantity(productName);

        // Display stock information
        System.out.println("====================================");
        System.out.println("|   Stock Availability           |");
        System.out.println("====================================");
        System.out.println("| Product Name | Stock Quantity   |");
        System.out.println("====================================");
        System.out.printf("| %-13s | %-15d |%n", productName, stockQuantity);
        System.out.println("====================================");
    }
}
