package backend.Services;

import java.util.List;

import backend.Models.Form;
import backend.Models.Grades;
import backend.Models.Reimbursments;
import backend.Models.Users;
import backend.Repository.Repo;

public class ServeImpl implements Serve{

    Repo re;


    public ServeImpl(Repo re) {
        this.re = re;
    }

    @Override
    public Users createUser(Users u) {
        return re.createUser(u);
    }

    @Override
    public Users getUser(int id) {
        return re.getUser(id);
    }

    @Override
    public Form createForm(Form f) {
        return re.createForm(f);
    }

    
    @Override
    public Form getForm(int id) {
        return re.getForm(id);
    }

    @Override
    public List<Form> getFormSApproval() {
        return re.getFormSApproval();
    }

    @Override
    public List<Form> getFormHApproval() {
        return re.getFormHApproval();
    }

    @Override
    public List<Form> getFormCApproval() {
        return re.getFormCApproval();
    }

    @Override
    public List<Form> getFormCFApproval() {
        return re.getFormCFApproval();
    }

    @Override
    public Form updateFormAmount(Form f) {
        return re.updateFormAmount(f);
    }

    @Override
    public Form updateFormSApproval(Form f) {
        return re.updateFormSApproval(f);
    }

    @Override
    public Form updateFormHApproval(Form f) {
        return re.updateFormHApproval(f);
    }

    @Override
    public Form updateFormCApproval(Form f) {
        return re.updateFormCApproval(f);
    }

    @Override
    public Form updateFormCFApproval(Form f) {
        return re.updateFormCFApproval(f);
    }

    @Override
    public Reimbursments createReimbursments(Reimbursments r) {
        return re.createReimbursments(r);
    }

    @Override
    public Grades createGrades(Grades g) {
        return re.createGrades(g);
    }

    @Override
    public Grades getGrades(int id) {
        return re.getGrades(id);
    }

    @Override
    public Form rejectForm(Form f) {
        return re.rejectForm(f);
    }

    @Override
    public Users login(Users u) {
        return re.login(u);
    }

    @Override
    public List<Form> getEForm(int id) {
        return re.getEForm(id);
    }
    
}
