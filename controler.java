package Affordmed;

import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.*;

@ResetController
public class controler {
	
	EcommerceService ec;
	public List<Ecommerce>getAllEcommerce(){
		return ec.getAllEcommerce();
	}
	@RequestMapping("/getall/(productName)")
	public Ecommerce getEcommerce(@pathVaribale String productName) {
		return ec.getEommerce(productName);
		
	}
	@RequestMapping(method=RequestMethod.POST,value="/getall")
	public void addEcommerce(@RequestBody eommerce ecommerce) {
		ec.addEcommerce(ecommerce);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/getall/(productName)")
	public void addEcommerce(@Requestbody Ecommerce ecommerce,@PathVariable String productname) {
		ec.updateEcommerce(ecommerce,productName);
	}
	 
}
