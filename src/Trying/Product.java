package Trying;

public class Product {

private int amount;
private String type;
private String category;
private String product;



public Product(String category, String product, String type, int amount) {
	
	
		this.category = category;
		this.product = product;
		this.type = type;
		this.amount = amount;
		
}



public int getAmount() {
	return amount;
}



public void setAmount(int amount) {
	this.amount = amount;
}



public String getType() {
	return type;
}



public void setType(String type) {
	this.type = type;
}



public String getCategory() {
	return category;
}



public void setCategory(String category) {
	this.category = category;
}



public String getProduct() {
	return product;
}



public void setProduct(String product) {
	this.product = product;
}




@Override
public String toString() {
	
	if(amount == 0)
		return category + "\n    " +  product + "\n         " + type ;
	
	else if (category.equals("") && product.equals("") && amount == 0) {
		return "\n    " +  product;
	}
	else
		return   "                       " +type + String.format( "%20s" ,"Amount: ") +  amount;
			
}





}
