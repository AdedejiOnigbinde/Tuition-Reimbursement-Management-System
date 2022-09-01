import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Form } from '../models/Form';
import { Grade } from '../models/Grade';
import { Reimbursements } from '../models/Reimbursements';

@Injectable({
  providedIn: 'root'
})
export class FormService {

  constructor(private http: HttpClient) { }
  readonly url = "http://localhost:8080/TRMS/";
  private header = new HttpHeaders({ 'Content-Type': 'application/json' });

  newForm(form: Form): Observable<Form> {
    return this.http.post<Form>(`${this.url}form`, form, { headers: this.header });
  }

  getForm(id: string): Observable<Form> {
    return this.http.get<Form>(`${this.url}form/${id}`);
  }

  getAllEForm(uid: string): Observable<Form[]> {
    return this.http.get<Form[]>(`${this.url}eform/${uid}`);
  }

  getAllSAForm(): Observable<Form[]> {
    return this.http.get<Form[]>(`${this.url}formSA`);
  }

  getAllHAForm(): Observable<Form[]> {
    return this.http.get<Form[]>(`${this.url}formHA`);
  }

  getAllCAForm(): Observable<Form[]> {
    return this.http.get<Form[]>(`${this.url}formCA`);
  }

  getAllCFAForm(): Observable<Form[]> {
    return this.http.get<Form[]>(`${this.url}formCFA`);
  }

  createGrade(grade: Grade, fId: string): Observable<Grade> {
    return this.http.post<Grade>(`${this.url}grade/${fId}`, grade, { headers: this.header });
  }

  getGrade(fId: string): Observable<Grade> {
    return this.http.get<Grade>(`${this.url}grade/${fId}`);
  }

  rejectForm(fId: string, reject: boolean) {
    const body = { "reject": reject }
    return this.http.put(`${this.url}rform/${fId}`, body, { headers: this.header });
  }

  setSApproval(fId: string, approval: boolean) {
    const body = { "sApproval": approval }
    return this.http.put(`${this.url}formSA/${fId}`, body, { headers: this.header });
  }

  setHApproval(fId: string, approval: boolean) {
    const body = { "hApproval": approval }
    return this.http.put(`${this.url}formHA/${fId}`, body, { headers: this.header });
  }

  setCApproval(fId: string, approval: boolean) {
    const body = { "cApproval": approval }
    return this.http.put(`${this.url}formCA/${fId}`, body, { headers: this.header });
  }

  setCFApproval(fId: string, approval: boolean) {
    const body = { "cFApproval": approval }
    return this.http.put(`${this.url}formCFA/${fId}`, body, { headers: this.header });
  }

  createReimbursement(reimbursement: Reimbursements):Observable<Reimbursements>{
  return this.http.post<Reimbursements>(`${this.url}rform`, reimbursement, { headers: this.header });
}
}
