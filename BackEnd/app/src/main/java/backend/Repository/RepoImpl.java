package backend.Repository;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

import backend.Models.Form;
import backend.Models.Grades;
import backend.Models.Reimbursments;
import backend.Models.Users;
import backend.util.JBDC;

public class RepoImpl implements Repo{

    public static Connection conn = JBDC.getConnection();

    @Override
    public Users createUser(Users u) {
        String sql = "INSERT INTO users VALUES (default,?,?,default,?) RETURNING *";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, u.getName());
            ps.setString(2, u.getPassword());
            ps.setString(3, u.getRole());

            ResultSet rs = ps.executeQuery();

            if(rs.next()){
                return buildUser(rs);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Users login(Users u) {
        String sql = "SELECT * FROM users WHERE name=? AND passwords=? ";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, u.getName());
            ps.setString(2, u.getPassword());

            ResultSet rs = ps.executeQuery();

            if(rs.next()){
                return buildUser(rs);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Users getUser(int id) {
        String sql = "SELECT * FROM users WHERE e_id=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if(rs.next()){
                return buildUser(rs);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Form createForm(Form f) {
        String sql = "INSERT INTO r_form VALUES (default,?,?,?,?,?,?,?,?,?,?,?,?,default,default,default,default,default) RETURNING *";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, f.getoId());
            ps.setString(2, f.getName());
            ps.setDate(3, Date.valueOf(f.getDate()));
            ps.setTime( 4, Time.valueOf(f.getTime()));
            ps.setString(5, f.getLocation());
            ps.setString(6, f.getDescription());
            ps.setInt(7, f.getCost());
            ps.setString(8, f.getGrade());
            ps.setString(9, f.getEventType());
            ps.setString(10, f.getJustifcation());
            ps.setString(11, f.getmTime());
            ps.setInt(12, f.getrAmount());
            ResultSet rs = ps.executeQuery();

            if(rs.next()){
                return buildForm(rs);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Form getForm(int id) {
        String sql = "SELECT * FROM r_form WHERE f_id=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if(rs.next()){
                return buildForm(rs);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Form> getEForm(int id) {
        String sql = "SELECT * FROM r_form WHERE owner_id=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            List<Form> forms = new ArrayList<>();
            while(rs.next()){
                forms.add(buildForm(rs));
            }
            return forms;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Form> getFormSApproval() {
        String sql = "SELECT * FROM r_form WHERE s_approval=false";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            List<Form> forms = new ArrayList<>();
            while(rs.next()){
                forms.add(buildForm(rs));
            }
            return forms;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Form> getFormHApproval() {
        String sql = "SELECT * FROM r_form WHERE h_approval=false AND s_approval=true AND reject=false";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            List<Form> forms = new ArrayList<>();
            while(rs.next()){
                forms.add(buildForm(rs));
            }
            return forms;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Form> getFormCApproval() {
        String sql = "SELECT * FROM r_form WHERE c_approval=false AND h_approval=true AND s_approval=true AND reject=false";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            List<Form> forms = new ArrayList<>();
            while(rs.next()){
                forms.add(buildForm(rs));
            }
            return forms;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Form> getFormCFApproval() {
        String sql = "SELECT * FROM r_form WHERE cf_approval=false AND c_approval=true AND h_approval=true AND s_approval=true AND reject=false";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            List<Form> forms = new ArrayList<>();
            while(rs.next()){
                forms.add(buildForm(rs));
            }
            return forms;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Form updateFormAmount(Form f) {
        String sql = "UPDATE r_form SET r_amount=? WHERE f_id=? RETURNING *";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, f.getrAmount());
            ps.setInt(2, f.getfId());
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                return buildForm(rs);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Form rejectForm(Form f) {
        String sql = "UPDATE r_form SET reject=? WHERE f_id=? RETURNING *";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setBoolean(1, f.isReject());
            ps.setInt(2, f.getfId());
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                return buildForm(rs);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Form updateFormSApproval(Form f) {
        String sql = "UPDATE r_form SET s_approval=? WHERE f_id=? RETURNING *";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setBoolean(1, f.issApproval());
            ps.setInt(2, f.getfId());
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                return buildForm(rs);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Form updateFormHApproval(Form f) {
        String sql = "UPDATE r_form SET h_approval=? WHERE f_id=? RETURNING *";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setBoolean(1, f.ishApproval());
            ps.setInt(2, f.getfId());
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                return buildForm(rs);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Form updateFormCApproval(Form f) {
        String sql = "UPDATE r_form SET c_approval=? WHERE f_id=? RETURNING *";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setBoolean(1, f.iscApproval());
            ps.setInt(2, f.getfId());
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                return buildForm(rs);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Form updateFormCFApproval(Form f) {
        String sql = "UPDATE r_form SET cf_approval=? WHERE f_id=? RETURNING *";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setBoolean(1, f.iscFApproval());
            ps.setInt(2, f.getfId());
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                return buildForm(rs);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Reimbursments createReimbursments(Reimbursments r) {
        String sql = "INSERT INTO reimbursements VALUES (default,?,?) RETURNING *";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, r.getF_id());
            ps.setInt(2, r.getAmount());
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                return buildReimbursments(rs);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Grades createGrades(Grades g) {
        String sql = "INSERT INTO grade_upload VALUES (default,?,?) RETURNING *";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, g.getfId());
            ps.setString(2, g.getGrade());
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                return buildGrades(rs);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Grades getGrades(int id) {
        String sql = "SELECT * FROM grade_upload WHERE form_id=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                return buildGrades(rs);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    private Users buildUser(ResultSet rs) throws SQLException{
        Users u = new Users();
        u.seteId(rs.getInt("e_id"));
        u.setName(rs.getString("name"));
        u.setPassword(rs.getString("passwords"));
        u.setBalance(rs.getInt("r_balance"));
        u.setRole(rs.getString("e_role"));
        return u;
    }

    private Form buildForm(ResultSet rs) throws SQLException{
        Form f = new Form();
        f.setfId(rs.getInt("f_id"));
        f.setoId(rs.getInt("owner_id"));
        f.setName(rs.getString("name"));
        f.setDate(rs.getDate("course_date").toString());
        f.setTime(rs.getTime("sub_time").toString());
        f.setLocation(rs.getString("locations"));
        f.setDescription(rs.getString("description"));
        f.setCost(rs.getInt("costs"));
        f.setGrade(rs.getString("grading"));
        f.setEventType(rs.getString("event_type"));
        f.setJustifcation(rs.getString("justification"));
        f.setmTime(rs.getString("work_time"));
        f.setrAmount(rs.getInt("r_amount"));
        f.setsApproval(rs.getBoolean("s_approval"));
        f.sethApproval(rs.getBoolean("h_approval"));
        f.setcApproval(rs.getBoolean("c_approval"));
        f.setcFApproval(rs.getBoolean("cf_approval"));
        f.setReject(rs.getBoolean("reject"));
        return f;
    }

    private Grades buildGrades(ResultSet rs) throws SQLException{
        Grades g = new Grades();
        g.setgId(rs.getInt("g_id"));
        g.setfId(rs.getInt("form_id"));
        g.setGrade(rs.getString("grade"));
        return g;
    }

    private Reimbursments buildReimbursments(ResultSet rs) throws SQLException{
        Reimbursments r = new Reimbursments();
        r.setR_id(rs.getInt("r_id"));
        r.setF_id(rs.getInt("form_id"));
        r.setAmount(rs.getInt("amount"));
        return r;
    }
    
}
