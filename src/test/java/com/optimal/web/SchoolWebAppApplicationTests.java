package com.optimal.web;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.optimal.web.api.repository.DepartmentRepository;
import com.optimal.web.api.repository.StudentRepository;
import com.optimal.web.api.service.DepartmentService;
import com.optimal.web.api.service.StudentService;

@SpringBootTest
class SchoolWebAppApplicationTests {

	@Autowired
	private StudentService studentService;
	@MockBean
	private StudentRepository studentRepository;

	@Autowired
	private DepartmentService departmentService;
	@MockBean
	private DepartmentRepository departmentRepository;

	@Test
	void contextLoads() {
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
