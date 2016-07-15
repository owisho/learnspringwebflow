package per.owisho.learn.springwebflow.entity;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Product implements Serializable{
	
	private static final long serialVersionUID = -6900010219930430433L;
	
	private int id;
	
	private String description;
	
	private int price;

	public Product(int id, String description, int price) {
		super();
		this.id = id;
		this.description = description;
		this.price = price;
	}
	
}
