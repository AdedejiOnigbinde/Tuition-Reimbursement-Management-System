package backend.Services;

import java.util.List;

import backend.Models.Form;
import backend.Models.Grades;
import backend.Models.Reimbursments;
import backend.Models.Users;

public interface Serve {
    public Users createUser(Users u);
    
    public Users getUser(int id);

    public Form createForm(Form f);

    public Form getForm(int id);

    public Form rejectForm(Form f);

    public Users login(Users u);

    public List<Form> getEForm(int id);

    public List<Form> getFormSApproval();
    
    public List<Form> getFormHApproval();

    public List<Form> getFormCApproval();

    public List<Form> getFormCFApproval();

    public Form updateFormAmount(Form f);
    
    public Form updateFormSApproval(Form f);

    public Form updateFormHApproval(Form f);

    public Form updateFormCApproval(Form f);

    public Form updateFormCFApproval(Form f);

    public Reimbursments createReimbursments(Reimbursments r);

    public Grades createGrades(Grades g);

    public Grades getGrades(int id);
}
