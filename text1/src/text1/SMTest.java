package text1;
import text1.StudentManager;
import java.util.ArrayList;
/**
 * �����࣬����Main������ִ��StudentManager��app����
 */

public class SMTest {
    public static void main(String[] args){
    	ArrayList<Student> array=new ArrayList<Student>();
        StudentManager manage=new StudentManager();
        manage.app(array);
    }

}