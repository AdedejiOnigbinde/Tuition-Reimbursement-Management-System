import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { CookieService } from 'ngx-cookie-service';
import { User } from 'src/app/models/User';
import { AuthService } from 'src/app/services/auth.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  constructor(private register:AuthService,private cookieServives:CookieService,private route:Router) { }

  ngOnInit(): void {
  }

  userName:string="";
  password:string="";
  employeeTypes:string="";

  signup(){
    let U:User = new User(this.userName,this.password,this.employeeTypes);
    this.register.register(U).subscribe(
      (response)=>{
        this.cookieServives.set('Uid',response.eId.toString());
        if(response.role === 'Employee'){
          this.route.navigate(['edash']);
        }else if(response.role === 'Supervisor'){
          this.route.navigate(['sdash']);
        }else if(response.role === 'Head Of Department'){
          this.route.navigate(['hdash']);
        }else if(response.role === 'Coordinator'){
          this.route.navigate(['cdash']);
        }
      }
    )
  }
  employeeType: string[] = ['Employee','Supervisor','Head Of Department','Coordinator'];
}
