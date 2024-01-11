package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		LocalDate birthDate = LocalDate.parse("15/04/1988",DateTimeFormatter.ofPattern("dd/MM/yyyy"));

		Department obj = new Department(1, "Books");
		
		Seller seller = new Seller(21,"Bob", "bob@gmail.com", birthDate, 3000.0, obj);
		
		System.out.println(seller);
		
		

	}

}
