package uy.com.s4b.manejorerror.test;

import com.google.gson.Gson;

import uy.com.s4b.vo.EmployeeVO;

/**
 * @author arpela
 *
 */
public class PruebaServicio {

	/**
	 * 
	 */
	public PruebaServicio() {
		
	}
	
	
	public static void main(String[] args) {
		EmployeeVO employer = new EmployeeVO();
		employer.setEmail("alfre@s4b.com.uy");
		employer.setFirstName("Alfredo");
		employer.setLastName("Rodriguez");
		Gson json = new Gson();
		System.out.println(json.toJson(employer));
	}
	
	
	
}
