package text1;

public class Student {
    private int id;// private int ID;问题编号1
    private String name;
    private String birDate;
    private boolean gender;
    
   /*
    * 问题编号1
    * public void setID(int ID){
    * return ID;
    * }
    */
    public int getId() {
        return id;
    }
    // 问题编号13
    
   /*
    * 问题编号1
    * public void setID(int ID){
    * return ID;
    * }
    */
    public void setId(int id) {
        this.id = id;
    }
    // 问题编号13
    
    public String getName() {
        return name;
    }
    // 问题编号13
    
    public void setName(String name) {
        this.name = name;
    }
    // 问题编号13
    
    /*
     * 问题编号1
     * public String getbirDate(){
     * return birDate;
     * }
     */
    public String getBirDate() {
        return birDate;
    }
    // 问题编号13
    
    /*
     * 问题编号1
     * public void setbirDate(String birDate){
     * this.birDate = birDate;
     * }
     */
    public void setBirDate(String birDate) {
        this.birDate = birDate;
    }
    // 问题编号13
    
    /*
     * 问题编号1
     * public boolean getgender(){
     * return gender;
     * }
     */
    public boolean getGender() {
        return gender;
    }
    // 问题编号13
    
    /*
     * 问题编号1
     * public void setgender(boolean gender){
     * this.gender = gender;
     * }
     */
    public void setGender(boolean gender) {
        this.gender = gender;
    }
    // 问题编号13
    
    // 问题编号8
    /**
     * Set up a toString method to display the basic information of the program
     * <P>In this method, 
     * the values of ID, name, date and gender are continuously displayed in turn
     */
    public String toString(){
        String msg="\t"+this.id+"\t"+this.name+"\t"+this.birDate+"\t"+this.gender;
        return msg;
    }
}  // 问题编号6； 这个是Student类的}
