package HW1;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseName;
    private List<Instructor> instructors = new ArrayList<>();
    private List<Textbook> textbooks = new ArrayList<>();
    
    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void	makeInstructor(String firstName, String lastName, String officeNumber) {
        Instructor instructor = new Instructor(firstName, lastName, officeNumber);
        addInstructor(instructor);
    }

    public void makeTextbook(String title, String author, String publisher) {
    	Textbook textbook = new Textbook(title, author, publisher);
    	addTextbook(textbook);
    }
   
    public void addInstructor(Instructor instructor) {
        instructors.add(instructor);
    }

    public void addTextbook(Textbook textbook) {
        textbooks.add(textbook);
    }

    public void printCourseDetails() {
        System.out.println("Course Name: " + courseName);
        for (Instructor instructors : instructors) {
            System.out.println("Instructor: " + instructors.getFirstName() + " " + instructors.getLastName() + ", Office: " + instructors.getOfficeNumber());
        }
        for (Textbook textbooks : textbooks) {
            System.out.println("Textbook: " + textbooks.getTitle() + " by " + textbooks.getAuthor());
        }
    }
}
