import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { CookieService } from 'ngx-cookie-service';
import { FormService } from 'src/app/services/form.service';

@Component({
  selector: 'app-sdash',
  templateUrl: './sdash.component.html',
  styleUrls: ['./sdash.component.css']
})
export class SdashComponent implements OnInit {
  formData: any[] = [];
  constructor(private formServices: FormService,private cookieServices:CookieService,private route:Router) { }

  ngOnInit(): void {
    this.getAllSupF();
  }

  getAllSupF() {
    this.formServices.getAllSAForm().subscribe(
      (response) =>{
        this.formData = response;
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
