package StudentCrudAppln.Dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import StudentCrudAppln.model.Student;

@Component

public class StudentDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	// create
	@Transactional
	public void createStudent(Student Student) {

		this.hibernateTemplate.saveOrUpdate(Student);

	}

	// get all Students
	public List<Student> getStudents() {
		List<Student> student_list = this.hibernateTemplate.loadAll(Student.class);
		return student_list;
	}

	// delete the single Student
	@Transactional
	public void deleteStudent(int stu_id) {
		Student s = this.hibernateTemplate.load(Student.class, stu_id);
		this.hibernateTemplate.delete(s);
	}

	// get the single Student
	public Student getStudent(int stu_id) {
		return this.hibernateTemplate.get(Student.class, stu_id);
	}
}
