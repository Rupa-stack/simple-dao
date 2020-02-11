package com.cts.dao.example;

import com.cts.dao.example.dao.StudentDAO;
import com.cts.dao.example.dao.StudentDAOImpl;
import com.cts.dao.example.model.Student;

public class Main {
	public static void main(String[] args) {
		Student student = new Student();
		Student alok = new Student();
		alok.setName("Alok");
		alok.setRollNo(8);
		alok.setCourse("MBA");
		alok.setAddress("Ranchi");
		Student tinkoo = new Student();
		tinkoo.setName("Arvind");
		tinkoo.setRollNo(6);
		// Adding Data
		StudentDAO sdao = new StudentDAOImpl();
		sdao.add(alok);
		// Deleting Data
		sdao.delete(7);
		// Updating Data
		sdao.update(tinkoo);
		// Displaying Data
		sdao.findAll();
	}
}
