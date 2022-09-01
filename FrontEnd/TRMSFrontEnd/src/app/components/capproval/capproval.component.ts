import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Form } from 'src/app/models/Form';
import { FormService } from 'src/app/services/form.service';

@Component({
  selector: 'app-capproval',
  templateUrl: './capproval.component.html',
  styleUrls: ['./capproval.component.css']
})
export class CapprovalComponent implements OnInit {
  formId: string = '';
  sApproval: boolean = false;
  formValue: Form = new Form();
  reject:boolean = false;
  constructor(private formServices: FormService, private param: ActivatedRoute, private route:Router) { }

  ngOnInit(): void {
    const id = this.param.snapshot.params['id'];
    this.getUserForms(id);
    this.formId = id;
  }

  getUserForms(id: string) {
    this.formServices.getForm(id).subscribe(
      (response) =>{
        this.formValue = response;
      }
    );
  }

  setApproval(){
    this.sApproval= true;
    this.formServices.setCApproval(this.formId,this.sApproval).subscribe(
      (response) =>{
        this.route.navigate(['cdash']);
      }
    );
  }

  rejection() {
    this.reject = true;
    this.formServices.rejectForm(this.formId, this.reject).subscribe(
      (response) => {
        this.route.navigate(['cdash'])
      }
    )
  }
}
