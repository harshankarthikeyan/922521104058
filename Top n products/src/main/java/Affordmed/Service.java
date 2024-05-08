package Affordmed;
import org.springframework.seterotype.service;

import java.util.Arrays;
import java.util.List;
@Service
public class Service {

	public List<Ecommerce>ecom=new ArrayList<>(Array.asList(new Ecommerce("Laptop 1","2236","4.7","6.3","yes"),
			new Ecommerce("Laptop 13","1244","4.5","6.3","out-of-stock"),
			new Ecommerce("Laptop 3","9182","4.44","98","out-of-stock"),
			new Ecommerce("Laptop 11","2652","4.12","70","yes"),
			new Ecommerce("Laptop 4","1258","3.8","33","yes"),
			new Ecommerce("Laptop 13","8686","3.2","6.3","yes"),
			new Ecommerce("Laptop 14","9254","6.3","yes"),
			new Ecommerce("Laptop 1","1059","2077","2.1","yes"),
			new Ecommerce("Laptop 10","7145","2.74","15","yes"),
			new Ecommerce("Laptop 15","4101","2.67","37","yes"),
			
			);

	}
public List<Ecommerce>getAllEcom(){
	return ecom;
}
public Ecommerce getEcommerce(String productName) {
	return ecom.stream().filter(t->t.getProduction().equals(productName)).findFirst().get();
}
public void addecommerce(Ecommerce ecommerce) {
	ecom.add(ecommerce);
}
public void updateEcommerce(Ecommerce ecommerce,String productName) {
	for(int i=0;i<ecom.size();i++) {
		Ecommerce ecom =ecom.get(i);
		if(ecom.getProductName().equals(productName)) {
			ecom.set(i,ecommerce);
			return;
		}
	}
}
}