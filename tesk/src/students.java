public class students {
    String name;
    int studentID;
    String course;
    university universityinformation;


    students(String name,int studentID,String course){
      this.name = name;
      this.studentID = studentID;
      this.course = course;
      universityinformation = universityinformation;
    }

    public void showstudentsDetail(){
        System.out.println("the student name is " + name);
        System.out.println("the student ID " + studentID);
        System.out.println("the courses is " + course);

    }
}

