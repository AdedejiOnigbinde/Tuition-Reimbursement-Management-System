package backend.Models;

public class Grades {
    private int gId;
    private int fId;
    private String grade;

    public Grades() {
    }

    public int getgId() {
        return gId;
    }

    public void setgId(int gId) {
        this.gId = gId;
    }

    public int getfId() {
        return fId;
    }

    public void setfId(int fId) {
        this.fId = fId;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Grades [fId=" + fId + ", gId=" + gId + ", grade=" + grade + "]";
    }

}
