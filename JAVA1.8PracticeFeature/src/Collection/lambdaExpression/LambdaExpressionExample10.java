package Collection.lambdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Product{
	int id;
	String name;
	float price;
	public Product(int id, String name,float price){
		super();
		this.id=id;
		this.name=name;
		this.price=price;
		}
}
public class LambdaExpressionExample10 {
	public static void main(String[] args) {
		List<Product> list= new ArrayList<Product>();
		list.add(new Product(1,"HP",5000F));
		list.add(new Product(2,"Lenovo",2000f));
		list.add(new Product(3,"Dell",1000F));
		
		System.out.println("Sorting on the basis of names");
		Collections.sort(list,(p1,p2)->{
			return p1.name.compareTo(p2.name);
		});
		for(Product p:list){
			System.out.println(p.id+" "+p.name+" "+p.price);
		
		}
		
		
	}

}
