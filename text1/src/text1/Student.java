package text1;

/**
 * 学生类
 */

public class Student {
    private int ID;
    private String name;
    private String birDate;
    private boolean gender;

    /*Student(int ID ,String name,String birDate,boolean gender){
        this.ID=ID;
        this.name=name;
        this.birDate=birDate;
        this.gender=gender;
    }*/

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getbirDate() {
        return birDate;
    }

    public void setbirDate(String birDate) {
        this.birDate = birDate;
    }
    
    public boolean getgender() {
        return gender;
    }

    public void setgender(boolean gender) {
        this.gender = gender;
    }

    public String toString(){
        String msg="\t\t"+this.ID+"\t\t"+this.name+"\t\t"+this.birDate+"\t\t"+this.gender;
        return msg;
    }
}   
enum Gender{男,女}