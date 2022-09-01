import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { User } from '../models/User';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  constructor(private http: HttpClient) { }

  readonly url = "http://localhost:8080/TRMS/";
  private header = new HttpHeaders({ 'Content-Type': 'application/json' });

  login(user: User): Observable<User> {
    return this.http.post<User>(`${this.url}login`, user,{headers:this.header});
  }

  register(user: User) {
    return this.http.post<User>(`${this.url}register`, user,{headers:this.header});
  }
}
