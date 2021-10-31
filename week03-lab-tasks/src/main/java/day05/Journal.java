package day05;

import java.util.ArrayList;
import java.util.List;

public class Journal {
    private List<String> nameList= new ArrayList<>();

    public boolean addStudent(String studentName){
        if(studentName.contains(" ")){
            nameList.add(studentName);
            return true;
        }
        else{
            return false;
        }
    }

    public List<String> getNameList() {
        return nameList;
    }
}
