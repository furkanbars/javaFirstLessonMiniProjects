package oop1;

public class Main {
	
	public static void main(String[] args) {
		Product product1 = new Product();
		product1.setId(1);
		product1.setBrand("nike");
		product1.setName("air");
		product1.setUnitPrice(500);
		product1.setDiscount(5);
		product1.setColor("red");
		
		Product product2 = new Product();
		product2.setId(2);
		product2.setBrand("adidas");
		product2.setName("something");
		product2.setUnitPrice(550);
		product2.setDiscount(7);
		product2.setColor("blue");
		
		Product product3 = new Product();
		product3.setId(3);
		product3.setBrand("kinetix");
		product3.setName("pro");
		product3.setUnitPrice(300);
		product3.setDiscount(2);
		product3.setColor("black");

		Product[] products = {product1,product2,product3};
		
		for(Product product:products) {
			System.out.println(product.getBrand());
		}
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		
		individualCustomer.setId(1);
		individualCustomer.setFirstName("Abdullah Furkan");
		individualCustomer.setLastName("Barış");
		individualCustomer.setCustomerNumber("1546");
		individualCustomer.setPhone("05419031298");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("Doğuş Ltd. Şti.");
		corporateCustomer.setCustomerNumber("5464");
		corporateCustomer.setTaxNumber("11111111111");
		corporateCustomer.setPhone("05413659875");
		
		Customer[] customers = {individualCustomer,corporateCustomer};
		
		for(Customer customer:customers) {
			System.out.println(customer.getCustomerNumber() );
		}
		
		
		
	}
}
