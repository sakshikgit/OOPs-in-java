
class Students
{
    int rollno;
    String name;
    int marks;
}


public class ArrayOfObjects{
    public static void main(String args[]){
        Students s1 = new Students();
        s1.rollno = 1;
        s1.name = "sakshi";
        s1.marks = 99;

        Students s2 = new Students();
        s2.rollno = 2;
        s2.name = "sakshi";
        s2.marks = 99;

        Students s3 = new Students();
        s3.rollno = 3;
        s3.name = "sakshi";
        s3.marks = 99;

        

        // array of students
        Students student[] = new Students[3]; 
        // in this line we are not creating student object ,
        // we are creating an array which can hold student refrences , 
        //we have to mannuly create the objects ans assign to an array  
        
        student[0] = s1;
        student[1] =s2;
        student[2] = s3;

        for(int i=0; i<student.length; i++){
            System.out.println(student[i].name + " : " + student[i].marks);

        }


    }
}