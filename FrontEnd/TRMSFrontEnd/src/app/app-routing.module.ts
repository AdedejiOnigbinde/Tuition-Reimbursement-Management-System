import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CapprovalComponent } from './components/capproval/capproval.component';
import { CdashComponent } from './components/cdash/cdash.component';
import { CfapprovalComponent } from './components/cfapproval/cfapproval.component';
import { CfgradeapprovalComponent } from './components/cfgradeapproval/cfgradeapproval.component';
import { EdashboardComponent } from './components/edashboard/edashboard.component';
import { EformvComponent } from './components/eformv/eformv.component';
import { EformxComponent } from './components/eformx/eformx.component';
import { HapprovalComponent } from './components/happroval/happroval.component';
import { HdashComponent } from './components/hdash/hdash.component';
import { LandingComponent } from './components/landing/landing.component';
import { RegisterComponent } from './components/register/register.component';
import { SapprovalComponent } from './components/sapproval/sapproval.component';
import { SdashComponent } from './components/sdash/sdash.component';

const routes: Routes = [
  { path: '', component: LandingComponent },
  { path: 'register', component: RegisterComponent },
  {path:'edash', component: EdashboardComponent},
  {path:'eformv', component: EformvComponent},
  {path:'eformx/:id', component:EformxComponent},
  {path:'sdash',component:SdashComponent},
  {path:'hdash',component:HdashComponent},
  {path:'cdash',component:CdashComponent},
  {path:'sapproval/:id',component:SapprovalComponent},
  {path:'happroval/:id',component:HapprovalComponent},
  {path:'capproval/:id',component:CapprovalComponent},
  {path:'cfapproval',component:CfapprovalComponent},
  {path:'cfagrade/:id',component:CfgradeapprovalComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
