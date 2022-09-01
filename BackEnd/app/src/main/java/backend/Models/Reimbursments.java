package backend.Models;

public class Reimbursments {
    private int r_id;
    private int f_id;
    private int amount;

    public Reimbursments() {

    }

    public Reimbursments(int r_id, int f_id, int amount) {
        this.r_id = r_id;
        this.f_id = f_id;
        this.amount = amount;
    }

    public int getR_id() {
        return r_id;
    }

    public void setR_id(int r_id) {
        this.r_id = r_id;
    }

    public int getF_id() {
        return f_id;
    }

    public void setF_id(int f_id) {
        this.f_id = f_id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Reimbursments [amount=" + amount + ", f_id=" + f_id + ", r_id=" + r_id + "]";
    }

}
