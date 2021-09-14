package org.anirudh.example.restexample;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.anirudh.example.restexample.controller.CrudController;
import org.anirudh.example.restexample.model.Student;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources")
public class StudentEnrollment extends CucumberSpringConfiguration{
    @Autowired
    CrudController controller;

    Student student;

    String result;

    @Given("A student enrolls")
    public void aStudentEnrolls() {
        student = new Student();
    }

    @When("The data is collected")
    public void theDataIsCollected() {
        student.setSid("111");
        student.setFname("Alpha");
        student.setLname("Beta");
        student.setAddress("nowhere, 123");
        student.setDob("1991-05-05");
        result = controller.insertStudent(student);
    }

    @Then("Data is added in the database")
    public void dataIsAddedInTheDatabase() {
        assertEquals(result, "Data is Inserted");
    }
}
