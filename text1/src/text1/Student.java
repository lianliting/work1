package text1;

public class Student {
    private int id;// private int ID;������1
    private String name;
    private String birDate;
    private boolean gender;
    
   /*
    * ������1
    * public void setID(int ID){
    * return ID;
    * }
    */
    public int getId() {
        return id;
    }
    // ������13
    
   /*
    * ������1
    * public void setID(int ID){
    * return ID;
    * }
    */
    public void setId(int id) {
        this.id = id;
    }
    // ������13
    
    public String getName() {
        return name;
    }
    // ������13
    
    public void setName(String name) {
        this.name = name;
    }
    // ������13
    
    /*
     * ������1
     * public String getbirDate(){
     * return birDate;
     * }
     */
    public String getBirDate() {
        return birDate;
    }
    // ������13
    
    /*
     * ������1
     * public void setbirDate(String birDate){
     * this.birDate = birDate;
     * }
     */
    public void setBirDate(String birDate) {
        this.birDate = birDate;
    }
    // ������13
    
    /*
     * ������1
     * public boolean getgender(){
     * return gender;
     * }
     */
    public boolean getGender() {
        return gender;
    }
    // ������13
    
    /*
     * ������1
     * public void setgender(boolean gender){
     * this.gender = gender;
     * }
     */
    public void setGender(boolean gender) {
        this.gender = gender;
    }
    // ������13
    
    // ������8
    /**
     * Set up a toString method to display the basic information of the program
     * <P>In this method, 
     * the values of ID, name, date and gender are continuously displayed in turn
     */
    public String toString(){
        String msg="\t"+this.id+"\t"+this.name+"\t"+this.birDate+"\t"+this.gender;
        return msg;
    }
}  // ������6�� �����Student���}
