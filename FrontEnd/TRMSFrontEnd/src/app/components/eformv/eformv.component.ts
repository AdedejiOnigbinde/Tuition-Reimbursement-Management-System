import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { CookieService } from 'ngx-cookie-service';
import { FormService } from 'src/app/services/form.service';

@Component({
  selector: 'app-eformv',
  templateUrl: './eformv.component.html',
  styleUrls: ['./eformv.component.css']
})
export class EformvComponent implements OnInit {
formData: any[]= [];
  constructor(private formServices:FormService,private cookieServices:CookieService,private route:Router) { }

  ngOnInit(): void {
        this.getUserForms(this.cookieServices.get('Uid'));
  }

  getUserForms(id:string){
  this.formServices.getAllEForm(id).subscribe(
    (response)=>{
      this.formData = response;
    }
  );
  }

  logout(){
    this.cookieServices.delete('Uid');
    this.route.navigate(['/'])
  }

  displayedColumns: string[] = ['Form Id',"CourseName", 'CourseType', 'Approval','Rejected'];
  dataSource = this.formData;
}
