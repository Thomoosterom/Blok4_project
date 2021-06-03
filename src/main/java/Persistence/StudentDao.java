package Persistence;


import nl.hu.blok4.v2.Student;

import java.util.List;

public interface StudentDao {
	public Student findbyGebruikersName(String name);
	public boolean delete(Student student);
	public List<Student> findAll();
}
