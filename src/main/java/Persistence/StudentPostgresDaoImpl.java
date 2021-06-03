package Persistence;

import nl.hu.blok4.v2.Student;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentPostgresDaoImpl extends PostgresDao implements StudentDao {
	private StudentDao studentDao = new StudentPostgresDaoImpl();

	/***************************** CREATE & UPDATE methods *****************************/

	/***************************** READ methods *****************************/

	private List<Student> selectStudents(String query) {
		List<Student> results = new ArrayList<Student>();

		try (Connection con = super.getConnection()) {
			Statement stmt = con.createStatement();
			ResultSet dbResultSet = stmt.executeQuery(query);

			while (dbResultSet.next()) {
				String studnaam = dbResultSet.getString("naam");
				String email = dbResultSet.getString("email");
				String gebruikersnaam = dbResultSet.getString("gebruikersnaam");
                String wachtwoord = dbResultSet.getString("wachtwoord");


				Student address = studentDao.findbyGebruikersName(gebruikersnaam);
				Student newStudent = new Student(studnaam, email, gebruikersnaam, wachtwoord);
				Student.setDeStudent(address);

				results.add(newStudent);
			}
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}

		return results;
	}

	public List<Student> findAll() {
		return selectStudents("SELECT name, email, gebruikersnaam, wachtwoord");
	}

	public Student findbyGebruikersName(String name) {
		return selectStudents("SELECT name, email, gebruikersnaam, wachtwoord = " +name).get(0);
	}



	/***************************** DELETE methods *****************************/

	public boolean delete(Student student) {
		boolean result = false;
		boolean customerExists = findbyGebruikersName(student.getGebruikersnaam()) != null;

		if (customerExists) {
			String query = "DELETE FROM student WHERE gebruikersnaam = " +student.getGebruikersnaam();

			try (Connection con = getConnection()) {

				Statement stmt = con.createStatement();
				if (stmt.executeUpdate(query) == 1) { // 1 row updated!
					result = studentDao.delete(student);
				}
			} catch (SQLException sqle) {
				sqle.printStackTrace();
			}
		}

		return result;
	}

}
