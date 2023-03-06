// created by team in KL
public class Student {
    // data/attributes
    private Name name;
    private String kp;
    private Address address;
    private String schoolname;
    private float marks[] = new float[5];
    private float markah=100;
    private float sum=0;
    private float average=0;
    private int i;
    
    public Student(){
    }
    
    /*public int[] getMarks() {
        return mark;
    }*/
    
    void setMark(float mark, int i){
        marks[i] = mark;
    }

    public void setKp(String kp) {
        this.kp = kp;
    }
    
    public String getKp(){
        return kp;
    }

    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname;
    }
    
    public String getSchoolname(){
        return schoolname;
    }
    
    // methods or operations
    float calcAvg() {
         for(i=0;i<5;i++){
          sum+= marks[i];
        }
        average = sum/5;
        return 0;
    }

    float calcMin() {
        for(i=0;i<5;i++){
            if (marks[i]<markah)
            markah=marks[i];
        }
        return 0;
    }

    void setName(Name name) {
        this.name = name;
    }

    /*void setMark(float mark, int i) throws Exception {
        if (mark < 0)
            throw new Exception("Error in mark detected");

        marks[i] = mark;
    }*/

    void displayMarks() {
        // print the marks
        for (int i=0; i<marks.length; i++) {
            System.out.println("marks at index "+i+" :"+marks[i]);
        }
    }

    public static void main(String args[]) {
        Student stud0 = new Student();
        try {  // try block.. something in here can cause exception
            stud0.setMark(10, 0);
            stud0.setMark(-10, 1);
        } catch (Exception ex) {  // catch block.. action to be taken
                                    // in case of Exception
            System.out.println("Cannot continue");
            ex.printStackTrace();
        }

        stud0.displayMarks();
    }

}