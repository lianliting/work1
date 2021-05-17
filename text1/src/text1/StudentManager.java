package text1;

import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;
// 问题编号13

import text1.Student;

	public class StudentManager {
	// 问题编号8	
   /**
    * APP method is responsible for the control process of the whole program
    * <p>The APP method is responsible for the whole control process.
    * Firstly, it outputs the selection menu, 
    * waits for the user to input the options, 
    * and performs the functions of insertion, search, deletion, output 
    * and exit according to the options
    * @param array
    */
	// 问题编号4；APP方法，负责整个程序的控制流程	
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
        // 问题编号26
        @SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        switch (a){
                case 1:// 1:插入一个学生信息
                    addStu(array);
                    break;
                case 2:// 2:查找学生
                    selectStu(array);
                    break;
                case 3:// 3:根据姓名删除学生
                    deleteStu(array);
                    break;
                case 4:// 4：输出所有学生信息
                	showStu(array);
                	break;
                case 5:// 5:退出系统
                    System.exit(0);
                    break;
                default:
                    System.out.println("请重新输入");
            }// 问题编号6；这个是Switch语句的}
        }// 问题编号6；这个是while循环的}
    }// 问题编号6；这个是APP方法的}
    // 问题编号13
    
    // 1:插入学生信息
    // 问题编号8
    /**
     * Insert function: used to add student information
     * <P>First, there is no student in the output program, 
     * then the prompt message "please input the student number" will pop up, 
     * and the student number will be input from the keyboard. 
     * After entering, 
     * the prompt message "please input the student's name" will pop up,
     * and the student's name will be input from the keyboard.
     * After entering, 
     * the prompt message "please input the student's birth date" will pop up,
     * and the student's birth date will be input from the keyboard, 
     * After entering, 
     * the prompt "please enter the gender of the student" will pop up. 
     * After entering, the student will be added successfully. 
     * If the name entered coincides with the student's name originally 
     * owned by the program, the prompt message of "already has" will pop up,
     * and only one student's information will be inserted at a time.
     * After each name is inserted,
     * the students are required to sort by student number incrementally
     * @param array
     */
	public void addStu(ArrayList<Student> array) {
		// 问题编号26
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		String n=scanner.nextLine();
		boolean index3=false;
		// 问题编号14；if(array.size()==0){
		if (array.size() == 0){
			System.out.println("没有学生");
			System.out.println("请输入学生的学号:");
			int id = scanner.nextInt();
			System.out.println("请输入学生的姓名:");
			String name = scanner.next();
			System.out.println("请输入学生的出生日期:");
			String birDate = scanner.next();
			System.out.println("请输入学生的性别:");
			boolean gender = scanner.nextBoolean();
			Student stu = new Student();
			stu.setId(id);
			stu.setName(name);
			stu.setGender(gender);
			stu.setBirDate(birDate);
			array.add(stu);
			System.out.println("添加学生成功");
			/*
			 * 问题编号14
			 *}
		     * else{
	         *     for (int i=0;i<array.size();i++){
		     *     Student a=array.get(i);
		     *     if(n.equals(a.getName())){
		     *      index3=true;
		     *     }
		     *     if(index3){
			 *         System.out.println("已经有");
		     *     }
		     *     else{
		     *        System.out.println("请输入学生的学号:");
		     *        int id = scanner.nextInt();
		     *        System.out.println("请输入学生的姓名:");
		     *        String name = scanner.next();
		     *        System.out.println("请输入学生的出生日期:");
		     *        String birDate = scanner.next();
		     *        System.out.println("请输入学生的性别:");
		     *        boolean gender = scanner.nextBoolean();
		     *        Student stu = new Student();
		     *        stu.setId(id);
		     *        stu.setName(name);
		     *        stu.setGender(gender);
		     *        stu.setBirDate(birDate);
		     *        array.add(stu);
		     *        break;
		     *      }
		     * }
		     * Collections.sort(array,new Comparator<Student>(){
			 *     @Override
			 *     public int compare(Student s1,Student s2){
			 *	   return s1.getId()-s2.getId();
			 *       }
		     *    });
		     * }
			 */
			}else{
				for (int i=0;i<array.size();i++){
					Student a=array.get(i);
					if(n.equals(a.getName())){
						index3=true;
						}
					if(index3){
						System.out.println("已经有");
						}else{
							System.out.println("请输入学生的学号:");
							int id = scanner.nextInt();
							System.out.println("请输入学生的姓名:");
							String name = scanner.next();
							System.out.println("请输入学生的出生日期:");
							String birDate = scanner.next();
							System.out.println("请输入学生的性别:");
							boolean gender = scanner.nextBoolean();
							Student stu = new Student();
							stu.setId(id);
							stu.setName(name);
							stu.setGender(gender);
							stu.setBirDate(birDate);
							array.add(stu);
							break;
							}
					}
				// 问题编号4；升序
				Collections.sort(array,new Comparator<Student>(){
					@Override
					public int compare(Student s1,Student s2){
						return s1.getId()-s2.getId();
						}
					});
				}
		}// 问题编号6；这个是addStu方法的}
	// 问题编号13
	
	// 2:根据姓名查找一个学生
	// 问题编号8
	/**
	 * Search function: according to the name to find a student's information
	 * <P>According to the prompt information, 
	 * enter the name of the student you want to search, 
	 * and the program will compare and search. 
	 * If the student is found, 
	 * the student number, name, date of birth, gender 
	 * and other information will be displayed, 
	 * otherwise the prompt is not found
	 * @param array
	 */
	public void selectStu(ArrayList<Student> array){
		// 问题编号26
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要查找的学生的姓名：");
        String name = sc.nextLine();
        int index=-1;
        for (int i = 0; i < array.size(); i++) {
             Student s = array.get(i);
             if (s.getName().equals(name)) {
                System.out.println(s.getId()+"\t"+s.getName()+"\t"+s.getBirDate()+"\t"+s.getGender());
                index=0;
                break;
               }
             }
        // 问题编号14；if(index==-1){
        if (index == -1){
       	 System.out.println("没有找到");
         }
       }// 问题编号6；这个是selectStu方法的}
	// 问题编号13
	
    // 3:根据姓名删除学生
	// 问题编号8
	/**
	 * Delete function: delete students' information according to their names
	 * <P>First, input the name of the student you want to delete 
	 * according to the prompt, 
	 * and compare and search according to the name program. 
	 * If the student is not found, 
	 * the prompt message "the information does not exist, please re-enter" will pop up. 
	 * Otherwise, all the information of the student will be deleted,
	 * and the student will be deleted successfully
	 * @param array
	 */
	/*
	 * 问题编号14
	 * public void deleteStu(ArrayList<Student> array){
     *      @SuppressWarnings("resource")
	 *		Scanner sc = new Scanner(System.in);
     *      System.out.println("请输入你要删除的学生的姓名：");
     *      String name = sc.nextLine();
     *      int index=-1;
     *     for (int i = 0; i < array.size(); i++) {
     *           Student s = array.get(i);
     *           if (s.getName().equals(name)) {
     *               index=i;
     *               break;
     *          }
     *      }
     *       if(index==-1){
     *           System.out.println("该信息不存在，请重新输入");
     *       }else{
     *           array.remove(index);
     *           System.out.println("删除学生成功");
     *       }
     * } 
	 */
    public void deleteStu(ArrayList<Student> array){
    	// 问题编号26
    	@SuppressWarnings("resource")
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
    	if (index == -1){
    		System.out.println("该信息不存在，请重新输入");
    		}else{
    			array.remove(index);
    			System.out.println("删除学生成功");
    			}
    	} 
    // 问题编号13
    
    // 4:打印所有学生信息
    // 问题编号8
    /**
     * Output function: output all students' information
     * <P>If there is no student information in the program, 
     * the user will execute the output function, 
     * and will prompt "no student". Otherwise, 
     * the student number, name, birth date, 
     * gender and other information will be output 
     * according to the increment of the student number
     * @param array
     */
    public void showStu(ArrayList<Student> array){
    	// 问题编号14；if(array.size()==0){
    	if (array.size() == 0) {
    		System.out.println("没有学生");
    	}
    	else{
    		// 问题14；for(int i=0;i<array.size();i++){
    		for (int i = 0;i<array.size();i++){
    			Student a=array.get(i);
    			System.out.println(a.getId()+"\t"+a.getName()+"\t"+a.getGender()+"\t"+a.getBirDate());
    		}
    	}
    }
}  // 问题编号6；这个是StudentManager类的} 