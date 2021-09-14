package org.anirudh.example.restexample;

import org.anirudh.example.restexample.controller.CrudController;
import org.anirudh.example.restexample.controller.GetController;
import org.anirudh.example.restexample.model.Marks;
import org.anirudh.example.restexample.model.Student;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;


import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@RunWith(SpringRunner.class)
@ExtendWith(SpringExtension.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class RestExampleApplicationTests {
	@Autowired
	GetController controller;

	@Autowired
	CrudController crudController;

	@Test
	@Order(1)
	public void testDTOAvailableOrNot(){
		try {
			Student student = new Student();
		} catch (Exception e){
			fail();
		}
	}

	@Test
	@Order(2)
	public void testControllerAllStudentsNotNull(){
		try {
			List<Student> list = controller.getAllStudents();
			assertNotNull(list);
		} catch (Exception e){
			fail();
		}
	}

	@Test
	@Order(3)
	public void testControllerAllStudents(){
		try {
			List<Student> list = controller.getAllStudents();
			assertEquals(list.get(0).getSid(), "101");
		} catch (Exception e){
			fail();
		}
	}

	@Test
	@Order(4)
	public void testControllerStudentById(){
		try {
			Optional<Student> list = controller.getAnyStudent("101");
			assertNotNull(list);
		} catch (Exception e){
			fail();
		}
	}

	@Test
	@Order(5)
	public void testControllerStudentByName(){
		try {
			Optional<Student> list = controller.getStudentByName("anirudh");
			assertNotNull(list);
		} catch (Exception e){
			fail();
		}
	}

	@Test
	@Order(6)
	public void testControllerStudentByFullName(){
		try {
			List<Student> list = controller.getStudentByFullName("anirudh", "r");
			assertNotNull(list);
		} catch (Exception e){
			fail();
		}
	}

	@Test
	@Order(7)
	public void testControllerAllMarks(){
		try {
			List<Marks> list = controller.getAllMarks();
			assertNotNull(list);
		} catch (Exception e){
			fail();
		}
	}

	@Test
	@Order(6)
	public void testControllerMarksById(){
		try {
			Optional<Marks> list = controller.getMarksById("101");
			assertNotNull(list);
		} catch (Exception e){
			fail();
		}
	}

	@Test
	@Order(7)
	public void testController4(){
		try {
			Optional<Student> list = controller.getAnyStudent("5000");
			assertEquals(list, Optional.empty());
		} catch (Exception e){
			fail();
		}
	}

	@Test
	@Order(8)
	public void testCrudControllerInsertion(){
		try {
			Student student = new Student();
			student.setSid("150");
			student.setAddress("abc, def");
			student.setFname("Gamma");
			student.setLname("Delta");
			student.setDob("1991-01-01");
			String result = crudController.insertStudent(student);
			assertEquals(result, "Data is Inserted");
		} catch (Exception e){
			fail();
		}
	}

	@Test
	@Order(9)
	public void testCrudControllerUpdate(){
		try {
			Student student = new Student();
			student.setSid("150");
			student.setAddress("abc, def");
			student.setFname("Zeta");
			student.setLname("Delta");
			student.setDob("1991-01-01");
			String result = crudController.updateStudent(student);
			assertEquals(result, "Data is Updated");
		} catch (Exception e){
			fail();
		}
	}

	@Test
	@Order(10)
	public void testCrudControllerDelete(){
		try {
			String result = crudController.deleteStudent("150");
			assertEquals(result, "Data is Deleted");
		} catch (Exception e){
			fail();
		}
	}

}
