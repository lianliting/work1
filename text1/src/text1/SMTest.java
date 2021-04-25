package text1;
import text1.StudentManager;
import java.util.ArrayList;
/**
 * 测试类，在其Main方法中执行StudentManager的app方法
 */

public class SMTest {
    public static void main(String[] args){
    	ArrayList<Student> array=new ArrayList<Student>();
        StudentManager manage=new StudentManager();
        manage.app(array);
    }

}