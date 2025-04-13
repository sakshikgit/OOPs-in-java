package Practise.Composition;

import java.util.ArrayList;

public class University {
    private List<College> colleges;
    private String name;

    public University(String name){
        this.name = name;
        this.colleges = new ArrayList<>();

    }

    public void addCollege(String collegeName, String colleged){
        College college = new College(collegeName, colleged);
        colleges.add(college);
    }

    
}
