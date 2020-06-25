package com.optimal.web;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.Mockito.when;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.optimal.web.api.enums.Gender;
import com.optimal.web.api.model.Student;
import com.optimal.web.api.model.Subject;
import com.optimal.web.api.repository.StudentRepository;
import com.optimal.web.api.repository.SubjectRepository;
import com.optimal.web.api.service.StudentService;
import com.optimal.web.api.service.SubjectService;

@SpringBootTest
class SchoolWebAppApplicationTests {

	@Autowired
	private StudentService studentService;
	@MockBean
	private StudentRepository studentRepository;

	@Autowired
	private SubjectService subjectService;
	@MockBean
	private SubjectRepository subjectRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void savingSubjectTest() {
		Subject subject = new Subject();
		subject.setId(1);
		subject.setName("Web Development");
		subject.setCode("IT 412");
		subject.setCreatedDate(new Date(2020 - 06 - 25));
		subject.setUpdatedAt(new Date());

		when(subjectRepository.save(subject)).thenReturn(subject);

		assertSame(subject, subjectService.saveSubject(subject));
	}

	@Test
	public void savingStudentTest() {
//		List<Subject> subjects = Stream
//				.of(new Subject(1, "Web Development", "IT 412", new Date(2020 - 06 - 25), new Date(), null),
//						new Subject(2, "Database Management", "IT 321", new Date(2020 - 06 - 25), new Date(), null))
//				.collect(Collectors.toList());
		
		
		Subject subject = new Subject();
		subject.setId(1);
		subject.setName("Web Development");
		subject.setCode("IT 412");
		subject.setCreatedDate(new Date(2020 - 06 - 25));
		subject.setUpdatedAt(new Date());
		//subject.setStudents();
		
		Student student = new Student();
		
		
		student.setId(1);
		student.setFirstName("Carlix");
		student.setLastName("Principe");
		student.setGender(Gender.MALE);
		student.setCreatedDate(new Date(2020-06-25));
		student.addSubject(subject);
		student.setUpdatedAt(new Date());

		when(studentRepository.save(student)).thenReturn(student);
		assertSame(student, studentService.saveStudent(student));
		
	}
	
	@Test
	public void getSubjectTest() {
		Subject subject = new Subject();
		subject.setId(1);
		subject.setName("Web Development");
		subject.setCode("IT 412");
		subject.setCreatedDate(new Date(2020 - 06 - 25));
		subject.setUpdatedAt(new Date());
		
		subjectRepository.save(subject);
		assertSame(subjectRepository.getOne((long)1), subjectService.getSubjectById(1));	
	}
	
	
	
	
	

//	@Test
//	public void savingDepartmentTest() {
//		Department dept = new Department(4,"ICS",null,null);
//		when(departmentRepository.save(dept)).thenReturn(dept);
//		
//		assertSame(dept, departmentService.saveDepartment(dept));
//	}

//	@Test
//	public void getAllDepartmentTest() {
//		when(departmentRepository.findAll()).thenReturn(Stream.of(new Department(2,"ICS",null,null),new Department(2,"ILAS",null,null)).collect(Collectors.toList()));
//		
//		assertEquals(2, departmentService.getAllDepartments().size());
//	}

//	@Test
//	public void getDepartmentById() {
//		Department dept = new Department(3, "ICS",null,null);
//		when(departmentRepository.getOne((long) 3)).thenReturn(new Department(3, "ICS",null,null));
//		
//		assertEquals(departmentRepository.getOne((long)3), dept);
//	}

//	@Test
//	public void getAllStudentsTest() {
//		when(studentRepository.findAll()).thenReturn(
//				Stream.of(new Student(3, "Carlix", "Principe", Gender.MALE), new Student(4, "John", "Doe", Gender.MALE),
//						new Student(5, "Shaira", "Parilla", Gender.FEMALE)).collect(Collectors.toList()));
//
//		assertEquals(3, studentService.getAllStudents().size());
//	}

//	@Test
//	public void getAllStudentsByFirstNameTest() {
//		when(studentRepository.findAllStudentsByFirstName("Carl")).thenReturn(Stream
//				.of(new Student(3, "Carlix", "Principe", Gender.MALE), new Student(4, "Carlix", "Doe", Gender.MALE),
//						new Student(5, "Carla", "Parilla", Gender.FEMALE))
//				.collect(Collectors.toList()));
//
//		assertEquals(3, studentService.getAllStudentsByFirstName("Carl").size());
//	}

//	@Test
//	public void getStudentByIdtest() {
//		Student student = new Student(3,"Carlix","Principe",Gender.MALE);
//		long id = 3;
//		when(studentRepository.getOne(id)).thenReturn(new Student(3,"Carlix","Principe",Gender.MALE));
//		
//		assertEquals(student, studentService.getStudentById(id));	
//	}
//	
//	

//	@Test
//	public void getAllFemaleStudentsTest() {
//		when(studentRepository.findAllFemaleStudents())
//				.thenReturn(Stream.of(new Student(3, "Shyra", "Martinez", Gender.FEMALE),
//						new Student(4, "Shaira", "Parilla", Gender.FEMALE)).collect(Collectors.toList()));
//		assertEquals(2, studentService.getAllFemaleStudents().size());
//	}	
//
//	@Test
//	public void getAllMaleStudentsTest() {
//		when(studentRepository.findAllMaleStudents()).thenReturn(Stream
//				.of(new Student(3, "Shyra", "Martinez", Gender.FEMALE), new Student(4, "Joana", "Doe", Gender.FEMALE),
//						new Student(5, "Carlos", "Reyes", Gender.MALE))
//				.filter(student -> student.getGender().equals(Gender.MALE)).collect(Collectors.toList()));
//		
//		assertEquals(1, studentService.getAllMaleStudents().size());
//	}

//	@Test
//	public void saveStudentTest() {
//		Student student = new Student(5, "Shaira", "Parilla", Gender.FEMALE);
//		when(studentRepository.save(student)).thenReturn(student);
//		assertEquals(student, studentService.saveStudent(student));
//	}

//	@Test
//	public void deleteStudentTest() {
//		Student student = new Student(5, "Shaira", "Parilla", Gender.FEMALE);
//
//		studentService.deleteStudent(student.getId());
//		verify(studentRepository, times(1)).deleteById(student.getId());
//	}
}
