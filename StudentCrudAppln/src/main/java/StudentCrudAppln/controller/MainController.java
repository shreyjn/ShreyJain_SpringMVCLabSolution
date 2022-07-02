package StudentCrudAppln.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import StudentCrudAppln.Dao.StudentDao;
import StudentCrudAppln.model.Student;

@Controller
public class MainController {

	@Autowired
	private StudentDao stu_dao;

	@GetMapping("/")
	public String home(Model m) {
		List<Student> studentlist = stu_dao.getStudents();
		m.addAttribute("students", studentlist);
		return "index";

	}

	// Show add student form
	@RequestMapping("/add-student")
	public String addStudent(Model m) {
		m.addAttribute("title", "Add Student");
		return "add_student_form";

	}

	// handle add student form
	@RequestMapping(value = "/handle-student", method = RequestMethod.POST)
	public RedirectView handleStudent(@ModelAttribute Student s, HttpServletRequest request) {
		System.out.println(s);
		stu_dao.createStudent(s);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/");
		return redirectView;
	}

	// Delete handler
	@RequestMapping("/delete/{studentID}")
	public RedirectView deleteStudent(@PathVariable("studentID") int studentID, HttpServletRequest request) {

		this.stu_dao.deleteStudent(studentID);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/");
		return redirectView;
	}

	// Update handler

	@RequestMapping("/update/{studentID}")
	public String updateForm(@PathVariable("studentID") int studentID, Model m) {

		Student student = this.stu_dao.getStudent(studentID);
		m.addAttribute("student", student);
		return "update-form";
	}

}
