package backend.Controller;

import java.util.List;

import com.google.gson.Gson;

import backend.Models.Form;
import backend.Models.Grades;
import backend.Models.Reimbursments;
import backend.Models.Users;
import backend.Services.Serve;
import io.javalin.http.Handler;

public class Control {
    Serve s;
    Gson gson = new Gson();

    public Control(Serve s) {
        this.s = s;
    }

    public Handler createUser = ctx -> {
        Users u = gson.fromJson(ctx.body(), Users.class);

        u = s.createUser(u);
        if (u != null) {
            ctx.status(200);
            ctx.result(gson.toJson(u));
        } else {
            ctx.result("Could Not Create User");
            ctx.status(400);
        }

    };

    public Handler login = ctx -> {
        Users u = gson.fromJson(ctx.body(), Users.class);

        u = s.login(u);
        if (u != null) {
            ctx.status(200);
            ctx.result(gson.toJson(u));
        } else {
            ctx.result("Could Not Login User");
            ctx.status(400);
        }

    };

    public Handler getUser = ctx -> {

        try {
            int userId = Integer.parseInt(ctx.pathParam("id"));
            Users u = s.getUser(userId);
            if (u != null) {
                ctx.result(gson.toJson(u));
                ctx.status(200);
            } else {
                ctx.status(400);
                ctx.result("User Not found");
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

    };

    public Handler createForm = ctx -> {
        Form f = gson.fromJson(ctx.body(), Form.class);
        f = s.createForm(f);
        if (f != null) {
            ctx.status(200);
            ctx.result(gson.toJson(f));
        } else {
            ctx.result("Could Not Create Form");
            ctx.status(400);
        }

    };

    public Handler getForm = ctx -> {
        try {
            int formId = Integer.parseInt(ctx.pathParam("id"));
            Form f = s.getForm(formId);
            if (f != null) {
                ctx.result(gson.toJson(f));
                ctx.status(200);
            } else {
                ctx.status(400);
                ctx.result("Form Not found");
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    };

    public Handler getEForm = ctx -> {
        try {
            int formId = Integer.parseInt(ctx.pathParam("id"));
            List<Form> formList = s.getEForm(formId);
            if (formList != null) {
                ctx.result(gson.toJson(formList));
                ctx.status(200);
            } else {
                ctx.status(400);
                ctx.result("Could Not Find Form List");
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
      
    };

    public Handler getFormSApproval = ctx -> {
        List<Form> formList = s.getFormSApproval();
        if (formList != null) {
            ctx.result(gson.toJson(formList));
            ctx.status(200);
        } else {
            ctx.status(400);
            ctx.result("Could Not Find Form List");
        }
    };

    public Handler getFormHApproval = ctx -> {
        List<Form> formList = s.getFormHApproval();
        if (formList != null) {
            ctx.result(gson.toJson(formList));
            ctx.status(200);
        } else {
            ctx.status(400);
            ctx.result("Could Not Find Form List");
        }
    };

    public Handler getFormCApproval = ctx -> {
        List<Form> formList = s.getFormCApproval();
        if (formList != null) {
            ctx.result(gson.toJson(formList));
            ctx.status(200);
        } else {
            ctx.status(400);
            ctx.result("Could Not Find Form List");
        }
    };

    public Handler getFormCFApproval = ctx -> {
        List<Form> formList = s.getFormCFApproval();
        if (formList != null) {
            ctx.result(gson.toJson(formList));
            ctx.status(200);
        } else {
            ctx.status(400);
            ctx.result("Could Not Find Form List");
        }
    };

    public Handler updateFormAmount = ctx -> {
        try {
            int formId = Integer.parseInt(ctx.pathParam("id"));
            Form f = gson.fromJson(ctx.body(), Form.class);
            f.setfId(formId);

            f = s.updateFormAmount(f);
            if (f != null) {
                ctx.status(200);
            } else {
                ctx.status(400);
                ctx.result("Form Not found");
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    };

    public Handler rejectForm = ctx -> {
        try {
            int formId = Integer.parseInt(ctx.pathParam("id"));
            Form f = gson.fromJson(ctx.body(), Form.class);
            f.setfId(formId);

            f = s.rejectForm(f);
            if (f != null) {
                ctx.status(200);
            } else {
                ctx.status(400);
                ctx.result("Form Not found");
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    };

    public Handler updateFormSApproval = ctx -> {
        try {
            int formId = Integer.parseInt(ctx.pathParam("id"));
            Form f = gson.fromJson(ctx.body(), Form.class);
            f.setfId(formId);

            f = s.updateFormSApproval(f);
            if (f != null) {
                ctx.status(200);
            } else {
                ctx.status(400);
                ctx.result("Form Not found");
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    };

    public Handler updateFormHApproval = ctx -> {
        try {
            int formId = Integer.parseInt(ctx.pathParam("id"));
            Form f = gson.fromJson(ctx.body(), Form.class);
            f.setfId(formId);

            f = s.updateFormHApproval(f);
            if (f != null) {
                ctx.status(200);
            } else {
                ctx.status(400);
                ctx.result("Form Not found");
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    };

    public Handler updateFormCApproval = ctx -> {
        try {
            int formId = Integer.parseInt(ctx.pathParam("id"));
            Form f = gson.fromJson(ctx.body(), Form.class);
            f.setfId(formId);

            f = s.updateFormCApproval(f);
            if (f != null) {
                ctx.status(200);
            } else {
                ctx.status(400);
                ctx.result("Form Not found");
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    };

    public Handler updateFormCFApproval = ctx -> {
        try {
            int formId = Integer.parseInt(ctx.pathParam("id"));
            Form f = gson.fromJson(ctx.body(), Form.class);
            f.setfId(formId);

            f = s.updateFormCFApproval(f);
            if (f != null) {
                ctx.status(200);
            } else {
                ctx.status(400);
                ctx.result("Form Not found");
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    };

    public Handler createReimbursments = ctx -> {
        try {
            Reimbursments r = gson.fromJson(ctx.body(), Reimbursments.class);
            r = s.createReimbursments(r);
            if (r != null) {
                ctx.status(200);
            } else {
                ctx.status(400);
                ctx.result("Form Not found");
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

    };

    public Handler createGrades = ctx -> {
        try {
            int formId = Integer.parseInt(ctx.pathParam("id"));
            Grades g = gson.fromJson(ctx.body(), Grades.class);
            g.setfId(formId);
            g = s.createGrades(g);
            if (g != null) {
                ctx.status(200);
                ctx.result(gson.toJson(g));
            } else {
                ctx.status(400);
                ctx.result("Form Not found");
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    };

    public Handler getGrades = ctx -> {
        try {
            int formId = Integer.parseInt(ctx.pathParam("id"));
            Grades g = s.getGrades(formId);
            if (g != null) {
                ctx.result(gson.toJson(g));
                ctx.status(200);
            } else {
                ctx.status(400);
                ctx.result("Form Not found");
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    };
}
