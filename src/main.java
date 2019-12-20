public class main {
    public void main(String[] arg) {
        // create Student object
        Student mark = new Student();
        Student firo = new Student();

        //input data to Object
        mark.name = "X Mark";
        mark.id = "001";
        mark.major = "CIS";
        firo.name = "X Mark";
        firo.id = "002";
        firo.major = "CIS";

        //get data from Object
        System.out.println("1. " + mark.name + "" + mark.major);
        System.out.println("1. " + firo.name + "" + mark.major);

        //add student to array
        //array index
        Student[] oppStudent = {mark, firo};

        System.out.println("1. " + oppStudent[0].name);
        System.out.println("1. " + oppStudent[1].name);

        find_CIS_Student(oppStudent);
    }
    // To find CIS Student
    public  void  find_CIS_Student(Student[] students){
        for (int i = 0; i < students.length; i++){
            //check student.major is"CIS") {
            if (students[i].major == "CIS"){
                System.out.println(i+1 + ". "+ students[1].name);
            }
        }
    }
}
