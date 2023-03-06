// createed by team in Bangalore
public class Teacher {
    // data
    private String name;
    private String ic;
    private String address;
    private int numyearexp;
    private String qualification;
    
    // op
     
    public Teacher()
    {
        
    }
    public Teacher(String name, String ic, int numyearexp, String qualification) {
        this.name = name;
        this.ic = ic;
        this.numyearexp = numyearexp;
        this.qualification = qualification;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setIc(String ic) {
        this.ic = ic;
    }

    public String getIc() {
        return ic;
    }

    public void setNumyearexp(int numyearexp) {
        this.numyearexp = numyearexp;
    }

    public int getNumyearexp() {
        return numyearexp;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getQualification() {
        return qualification;
    }

    
    
    
}