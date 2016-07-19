package per.owisho.learn.springwebflow.entity;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CartItem implements Serializable{

	private static final long serialVersionUID = 1L;

	private Product product;
	
	private int quantity;

	public CartItem(Product product, int quantity) {
		super();
		this.product = product;
		this.quantity = quantity;
	}
	
	public int getTotalPrice(){
		return this.quantity* this.product.getPrice();
	}
	
	public void increaseQuantity(){
		this.quantity++;
	}
	
}
