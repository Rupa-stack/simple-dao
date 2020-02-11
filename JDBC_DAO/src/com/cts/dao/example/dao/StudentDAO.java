package com.cts.dao.example.dao;

import com.cts.dao.example.model.Student;

public interface StudentDAO {
	public void add(Student student);
	public void update(Student student);
	public void delete(int rollNo);
	public void findAll();

}
