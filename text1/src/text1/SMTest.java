package text1;
// ������13

import text1.StudentManager;
// ������13

import java.util.ArrayList;

public class SMTest {
    public static void main(String[] args){
    	ArrayList<Student> array=new ArrayList<Student>();
        StudentManager manage=new StudentManager();
        manage.app(array);
    }

}