import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { CookieService } from 'ngx-cookie-service';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { FormsModule } from '@angular/forms';
import { LandingComponent } from './components/landing/landing.component';
import { HttpClientModule } from '@angular/common/http';
import { RegisterComponent } from './components/register/register.component';
import { EdashboardComponent } from './components/edashboard/edashboard.component';
import { MaterialModule } from './material/material.module';
import { EformvComponent } from './components/eformv/eformv.component';
import { EformxComponent } from './components/eformx/eformx.component';
import { SdashComponent } from './components/sdash/sdash.component';
import { HdashComponent } from './components/hdash/hdash.component';
import { CdashComponent } from './components/cdash/cdash.component';
import { SapprovalComponent } from './components/sapproval/sapproval.component';
import { HapprovalComponent } from './components/happroval/happroval.component';
import { CapprovalComponent } from './components/capproval/capproval.component';
import { CfapprovalComponent } from './components/cfapproval/cfapproval.component';
import { CfgradeapprovalComponent } from './components/cfgradeapproval/cfgradeapproval.component';


@NgModule({
  declarations: [
    AppComponent,
    LandingComponent,
    RegisterComponent,
    EdashboardComponent,
    EformvComponent,
    EformxComponent,
    SdashComponent,
    HdashComponent,
    CdashComponent,
    SapprovalComponent,
    HapprovalComponent,
    CapprovalComponent,
    CfapprovalComponent,
    CfgradeapprovalComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgbModule,
    FormsModule,
    BrowserAnimationsModule,
    MaterialModule,
    HttpClientModule
  ],
  providers: [CookieService],
  bootstrap: [AppComponent]
})
export class AppModule { }
