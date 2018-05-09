package Chapter3;

public class Student {
    String name;
    float examScore;
    String gradeLetter;


    public static void main(String args[]) {

        //Creating the Arrays - one for students, one for the student names and one for the examScores
        Student[] Students = new Student[5];
        String[] names = new String[]{"Fred", "Sally", "Timmy", "Pat", "Phil"};
        float[] examScores = new float[]{87.9f, 90.0f, 12.1f, 75.5f, 61.8f};

        int numStudents = 0;

        //Creating the student objects, updating their fields and adding them to the Students array
        while (numStudents < Students.length) {
            Student thisStudent = new Student();
            thisStudent.name = names[numStudents];
            thisStudent.examScore = examScores[numStudents];
            //Calling the addGrade Method which returns a String letter grade from a float exam score
            thisStudent.gradeLetter = thisStudent.addGrade(thisStudent.examScore);
            Students[numStudents] = thisStudent;
            numStudents++;

        }

        int studentCounter = 0;

        while (studentCounter < Students.length) {
            System.out.println(Students[studentCounter].name + " " + Students[studentCounter].examScore + " " + Students[studentCounter].gradeLetter);
            studentCounter++;
        }
    }


    public String addGrade(float myStudentGrade) {

        if (myStudentGrade >= 90) {
            return gradeLetter = "A";
        } else if (myStudentGrade >= 80) {
            return gradeLetter = "B";
        } else if (myStudentGrade >= 70) {
            return gradeLetter = "C";
        } else if (myStudentGrade >= 60) {
            return gradeLetter = "D";
        } else {
            return gradeLetter = "F";
        }


    }

}