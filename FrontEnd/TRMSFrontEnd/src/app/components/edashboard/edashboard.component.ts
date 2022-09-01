import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { CookieService } from 'ngx-cookie-service';
import { Form } from 'src/app/models/Form';
import { FormService } from 'src/app/services/form.service';

@Component({
  selector: 'app-edashboard',
  templateUrl: './edashboard.component.html',
  styleUrls: ['./edashboard.component.css']
})
export class EdashboardComponent implements OnInit {
  employeeId: number = 0;
  constructor(private formServices: FormService, private cookieServices: CookieService,private route:Router) { }

  ngOnInit(): void {
    this.employeeId = Number(this.cookieServices.get('Uid'));
  }

  courseName: string = "";
  date: string = "";
  time: string = "";
  location: string = "";
  description: string = "";
  cost: number = 0;
  grade: string = "";
  eventTypes: string = "";
  justification: string = "";
  mWork: string = "";
  ramount: number = 0;

  setAmount() {
    if (this.eventTypes === 'University Course') {
      this.ramount = this.cost * 0.8;
    } else if (this.eventTypes === 'Seminar') {
      this.ramount = this.cost * 0.6;
    } else if (this.eventTypes === 'CertPrep') {
      this.ramount = this.cost * 0.75;
    } else if (this.eventTypes === 'Certification') {
      this.ramount = this.cost * 1;
    } else if (this.eventTypes === 'Technical Training') {
      this.ramount = this.cost * 0.9;
    } else if (this.eventTypes === 'Other') {
      this.ramount = this.cost * 0.3;
    } else {
      this.cost = 0;
    }
  }

  create() {
    let f: Form = new Form(this.employeeId, this.courseName, this.date, this.time, this.location, this.description, this.cost, this.grade, this.eventTypes, this.justification, this.mWork, this.ramount);
    this.formServices.newForm(f).subscribe(
      (response)=>{
        this.route.navigate(['eformv']);
      }
    );
  }

  logout(){
    this.cookieServices.delete('Uid');
    this.route.navigate(['/'])
  }
  eventType: string[] = ['University Course', 'Seminar', 'CertPrep', 'Certification', 'Technical Training', 'Other'];
}
