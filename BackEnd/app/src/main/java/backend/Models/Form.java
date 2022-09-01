package backend.Models;

public class Form {
    private int fId;
    private int oId;
    private String name;
    private String date;
    private String time;
    private String location;
    private String description;
    private int cost;
    private String grade;
    private String eventType;
    private String justification;
    private String mTime;
    private int rAmount;
    private boolean sApproval;
    private boolean hApproval;
    private boolean cApproval;
    private boolean cFApproval;
    private boolean reject;

    public Form() {

    }

    public Form(int fId, int oId, String name, String date, String time, String location, String description, int cost,
            String grade,
            String eventType,
            String justifcation, String mTime, int rAmount, boolean sApproval, boolean hApproval, boolean cApproval,
            boolean cFApproval, boolean reject) {
        this.fId = fId;
        this.oId = oId;
        this.name = name;
        this.date = date;
        this.location = location;
        this.description = description;
        this.time = time;
        this.cost = cost;
        this.grade = grade;
        this.eventType = eventType;
        this.justification = justifcation;
        this.mTime = mTime;
        this.rAmount = rAmount;
        this.sApproval = sApproval;
        this.hApproval = hApproval;
        this.cApproval = cApproval;
        this.cFApproval = cFApproval;
        this.reject = reject;
    }

    public int getfId() {
        return fId;
    }

    public void setfId(int fId) {
        this.fId = fId;
    }

    public int getoId() {
        return oId;
    }

    public void setoId(int oId) {
        this.oId = oId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getJustifcation() {
        return justification;
    }

    public void setJustifcation(String justifcation) {
        this.justification = justifcation;
    }

    public String getmTime() {
        return mTime;
    }

    public void setmTime(String mTime) {
        this.mTime = mTime;
    }

    public int getrAmount() {
        return rAmount;
    }

    public void setrAmount(int rAmount) {
        this.rAmount = rAmount;
    }

    public boolean issApproval() {
        return sApproval;
    }

    public void setsApproval(boolean sApproval) {
        this.sApproval = sApproval;
    }

    public boolean ishApproval() {
        return hApproval;
    }

    public void sethApproval(boolean hApproval) {
        this.hApproval = hApproval;
    }

    public boolean iscApproval() {
        return cApproval;
    }

    public void setcApproval(boolean cApproval) {
        this.cApproval = cApproval;
    }

    public boolean iscFApproval() {
        return cFApproval;
    }

    public void setcFApproval(boolean cFApproval) {
        this.cFApproval = cFApproval;
    }

    public boolean isReject() {
        return reject;
    }

    public void setReject(boolean reject) {
        this.reject = reject;
    }

    @Override
    public String toString() {
        return "Form [cApproval=" + cApproval + ", cFApproval=" + cFApproval + ", cost=" + cost + ", date=" + date
                + ", eventType=" + eventType + ", fId=" + fId + ", grade=" + grade + ", hApproval=" + hApproval
                + ", justifcation=" + justification + ", mTime=" + mTime + ", name=" + name + ", oId=" + oId
                + ", rAmount=" + rAmount + ", sApproval=" + sApproval + ", time=" + time + "reject=" + reject + "]";
    }

}
