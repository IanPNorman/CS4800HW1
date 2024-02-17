package HW1;

public class CourseDriver {

	public class Main {
	    public static void main(String[] args) {
	        Course course = new Course("Software Engineering");

	        course.makeInstructor("Nima", "Davarpanah", "3-2636");
	        course.makeTextbook("Clean Code", "Robert C. Martin", "Prentice Hall");
	        course.makeInstructor("Markus", "Eger", "8-43");
	        course.makeTextbook("The Art of Game Design", "John Johnson", "BookMakers");
	        course.printCourseDetails();
	    }
	}

}
