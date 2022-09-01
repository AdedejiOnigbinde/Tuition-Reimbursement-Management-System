import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { CookieService } from 'ngx-cookie-service';
import { Form } from 'src/app/models/Form';
import { Grade } from 'src/app/models/Grade';
import { Reimbursements } from 'src/app/models/Reimbursements';
import { FormService } from 'src/app/services/form.service';

@Component({
  selector: 'app-eformx',
  templateUrl: './eformx.component.html',
  styleUrls: ['./eformx.component.css']
})
export class EformxComponent implements OnInit {
  grade: string = '';
  formId: string = '';
  formValue: Form = new Form();
  reject: boolean = false;
  constructor(private formServices: FormService, private param: ActivatedRoute, private route:Router,private cookieServices:CookieService) { }

  ngOnInit(): void {
    this.formId = this.param.snapshot.params['id'];
    this.getUserForms(this.formId);

  }

  getUserForms(id: string) {
    this.formServices.getForm(id).subscribe(
      (response) => {
        this.formValue = response;
      }
    );
  }

  submitGrade() {
    let G: Grade = new Grade(this.grade);
    this.formServices.createGrade(G, this.formId).subscribe(
      (response)=>{
        this.route.navigate(['edash'])
      }
    );

  }

  rejection() {
    this.reject = true;
    this.formServices.rejectForm(this.formId, this.reject).subscribe(
      (response) => {
        this.route.navigate(['edash'])
      }
    )
  }

  logout(){
    this.cookieServices.delete('Uid');
    this.route.navigate(['/'])
  }

  createreburse(){
    let R: Reimbursements = new Reimbursements(Number(this.formId),this.formValue.rAmount)
    this.formServices.createReimbursement(R).subscribe(
      (response) =>{
        this.route.navigate(['edash'])
      }
    )
  }
}
