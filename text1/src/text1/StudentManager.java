package text1;

import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;
import text1.Student;

/**
 * ѧ�������࣬ʵ�ֲ��� �����ҡ�ɾ����������˳��ȹ���
 */

	public class StudentManager {
    String msg="\t\tѧ��\t\t����\t\t��������";
    public void app(ArrayList<Student> array){
    	boolean index1=true;
    	while (index1){
        System.out.println("��ѡ�����:");
        System.out.println("*******************");
        System.out.println("*      1:����                   *");
        System.out.println("*      2:����                   *");
        System.out.println("*      3:ɾ��                   *");
        System.out.println("*      4:���                   *");
        System.out.println("*      5:�˳�                   *");
        System.out.println("*******************");
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        switch (a){
                case 1://1:����һ��ѧ����Ϣ
                    addStu(array);
                    break;
                case 2://2:����ѧ��
                    selectStu(array);
                    break;
                case 3://3:��������ɾ��ѧ��
                    deleteStu(array);
                    break;
                case 4://�������ѧ����Ϣ
                	showStu(array);
                	break;
                case 5://5:�˳�ϵͳ
                    System.exit(0);
                    break;
                default:
                    System.out.println("����������");
            }
        }
    }
    Scanner scanner=new Scanner(System.in);
    //1:����ѧ����Ϣ
	public void addStu(ArrayList<Student> array) {
		Scanner scanner=new Scanner(System.in);
		String n=scanner.nextLine();
		boolean index3=false;
		if(array.size()==0){
			System.out.println("û��ѧ��");
			System.out.println("������ѧ����ѧ��:");
			int ID = scanner.nextInt();
			System.out.println("������ѧ��������:");
			String name = scanner.next();
			System.out.println("������ѧ���ĳ�������:");
			String birDate = scanner.next();
			System.out.println("������ѧ�����Ա�:");
			boolean gender = scanner.nextBoolean();
			Student stu = new Student();
			stu.setID(ID);
			stu.setName(name);
			stu.setgender(gender);
			stu.setbirDate(birDate);
			array.add(stu);
			System.out.println("���ѧ���ɹ�");
		}
		else{
		for(int i=0;i<array.size();i++){
		Student a=array.get(i);
		if(n.equals(a.getName())){
			index3=true;
		}
		if(index3){
			System.out.println("�Ѿ���");
		}
		else{
		System.out.println("������ѧ����ѧ��:");
		int ID = scanner.nextInt();
		System.out.println("������ѧ��������:");
		String name = scanner.next();
		System.out.println("������ѧ���ĳ�������:");
		String birDate = scanner.next();
		System.out.println("������ѧ�����Ա�:");
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
	//2:������������һ��ѧ��
	public void selectStu(ArrayList<Student> array){
        Scanner sc = new Scanner(System.in);
        System.out.println("��������Ҫ���ҵ�ѧ����������");
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
       	 System.out.println("û���ҵ�");
         }
       }
    //3:��������ɾ��ѧ��
    public void deleteStu(ArrayList<Student> array){
            Scanner sc = new Scanner(System.in);
            System.out.println("��������Ҫɾ����ѧ����������");
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
                System.out.println("����Ϣ�����ڣ�����������");
            }else{
                array.remove(index);
                System.out.println("ɾ��ѧ���ɹ�");
            }
    } 
  //4:��ӡ����ѧ����Ϣ
    public void showStu(ArrayList<Student> array){
    	if(array.size()==0){
    		System.out.println("û��ѧ��");
    	}
    	else{
    		for(int i=0;i<array.size();i++){
    			Student a=array.get(i);
    			System.out.println(a.getID()+"\t"+a.getName()+"\t"+a.getgender()+"\t"+a.getbirDate());
    		}
    	}
    }
}   