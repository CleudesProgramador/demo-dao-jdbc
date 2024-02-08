package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		/*
		System.out.println("=== Test 1: Department findById ===");
		Department department = departmentDao.findById(4);
		System.out.println(department);
		
		System.out.println("=== Test 2: Department findAll ===");
		List<Department> list = departmentDao.findAll();
		for(Department dep:list) {
			System.out.println(dep);
		}
		
		System.out.println("=== Test 3: Department insert ===");
		Department newDepartment = new Department(null, "Music");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! new id: " + newDepartment.getId());
		
		System.out.println("=== Test 4: Department update ===");
		Department dep = departmentDao.findById(1);
		dep.setName("Food");
		departmentDao.update(dep);
		System.out.println("Update completed");
		*/
		System.out.println("=== Test 5: Department delete ===");
		System.out.print("Enter id for delete: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed");
		
		
		
		
		sc.close();
	}

}
