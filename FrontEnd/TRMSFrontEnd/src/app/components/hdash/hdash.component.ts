import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { CookieService } from 'ngx-cookie-service';
import { FormService } from 'src/app/services/form.service';

@Component({
  selector: 'app-hdash',
  templateUrl: './hdash.component.html',
  styleUrls: ['./hdash.component.css']
})
export class HdashComponent implements OnInit {
formData: any[] = [];
  constructor(private formServices: FormService,private route:Router,private cookieServices:CookieService) { }

  ngOnInit(): void {
    this.getAllHeadF();
  }

  getAllHeadF() {
    this.formServices.getAllHAForm().subscribe(
      (response)=>{
        this.formData = response
      }
    );
  }

  logout(){
    this.cookieServices.delete('Uid');
    this.route.navigate(['/'])
  }
  
  displayedColumns: string[] = ['Form Id', 'CourseType','CourseName', 'Approval',];
  dataSource = this.formData;

}
