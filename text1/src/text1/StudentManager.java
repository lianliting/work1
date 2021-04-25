package text1;

import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;
import text1.Student;

/**
 * 学生管理类，实现插入 、查找、删除、输出、退出等功能
 */

	public class StudentManager {
    String msg="\t\t学号\t\t姓名\t\t出生日期";
    public void app(ArrayList<Student> array){
    	boolean index1=true;
    	while (index1){
        System.out.println("请选择操作:");
        System.out.println("*******************");
        System.out.println("*      1:插入                   *");
        System.out.println("*      2:查找                   *");
        System.out.println("*      3:删除                   *");
        System.out.println("*      4:输出                   *");
        System.out.println("*      5:退出                   *");
        System.out.println("*******************");
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        switch (a){
                case 1://1:插入一个学生信息
                    addStu(array);
                    break;
                case 2://2:查找学生
                    selectStu(array);
                    break;
                case 3://3:根据姓名删除学生
                    deleteStu(array);
                    break;
                case 4://输出所有学生信息
                	showStu(array);
                	break;
                case 5://5:退出系统
                    System.exit(0);
                    break;
                default:
                    System.out.println("请重新输入");
            }
        }
    }
    Scanner scanner=new Scanner(System.in);
    //1:插入学生信息
	public void addStu(ArrayList<Student> array) {
		Scanner scanner=new Scanner(System.in);
		String n=scanner.nextLine();
		boolean index3=false;
		if(array.size()==0){
			System.out.println("没有学生");
			System.out.println("请输入学生的学号:");
			int ID = scanner.nextInt();
			System.out.println("请输入学生的姓名:");
			String name = scanner.next();
			System.out.println("请输入学生的出生日期:");
			String birDate = scanner.next();
			System.out.println("请输入学生的性别:");
			boolean gender = scanner.nextBoolean();
			Student stu = new Student();
			stu.setID(ID);
			stu.setName(name);
			stu.setgender(gender);
			stu.setbirDate(birDate);
			array.add(stu);
			System.out.println("添加学生成功");
		}
		else{
		for(int i=0;i<array.size();i++){
		Student a=array.get(i);
		if(n.equals(a.getName())){
			index3=true;
		}
		if(index3){
			System.out.println("已经有");
		}
		else{
		System.out.println("请输入学生的学号:");
		int ID = scanner.nextInt();
		System.out.println("请输入学生的姓名:");
		String name = scanner.next();
		System.out.println("请输入学生的出生日期:");
		String birDate = scanner.next();
		System.out.println("请输入学生的性别:");
		boolean gender = scanner.nextBoolean();
		Student stu = new Student();
		stu.setID(ID);
		stu.setName(name);
		stu.setgender(gender);
		stu.setbirDate(birDate);
		array.add(stu);
		break;
		}
		}
		Collections.sort(array,new Comparator<Student>(){
			@Override
			public int compare(Student s1,Student s2){
				return s1.getID()-s2.getID();
			}
		});
		}
		
	}
	//2:根据姓名查找一个学生
	public void selectStu(ArrayList<Student> array){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要查找的学生的姓名：");
        String name = sc.nextLine();
        int index=-1;
        for (int i = 0; i < array.size(); i++) {
             Student s = array.get(i);
             if (s.getName().equals(name)) {
                System.out.println(s.getID()+s.getName()+s.getbirDate()+s.getgender());
                index=0;
                break;
               }
             }
        if(index==-1){
       	 System.out.println("没有找到");
         }
       }
    //3:根据姓名删除学生
    public void deleteStu(ArrayList<Student> array){
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入你要删除的学生的姓名：");
            String name = sc.nextLine();
            int index=-1;
            for (int i = 0; i < array.size(); i++) {
                Student s = array.get(i);
                if (s.getName().equals(name)) {
                    index=i;
                    break;
                }
            }
            if(index==-1){
                System.out.println("该信息不存在，请重新输入");
            }else{
                array.remove(index);
                System.out.println("删除学生成功");
            }
    } 
  //4:打印所有学生信息
    public void showStu(ArrayList<Student> array){
    	if(array.size()==0){
    		System.out.println("没有学生");
    	}
    	else{
    		for(int i=0;i<array.size();i++){
    			Student a=array.get(i);
    			System.out.println(a.getID()+"\t"+a.getName()+"\t"+a.getgender()+"\t"+a.getbirDate());
    		}
    	}
    }
}   