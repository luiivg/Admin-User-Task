import { Injectable } from '@angular/core';
import { USERLIST } from '../user.json';
import { User } from '../user';
import { Observable, of } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { map } from "rxjs/operators";

@Injectable()
export class UserService {

  private urlEndPoint: string = 'http://localhost:8181/api/users'

  constructor(private http: HttpClient) { }

  getusers(): Observable<User[]> {
    //return of(USERLIST);
    return this.http.get(this.urlEndPoint).pipe(
      map( response => response as User[])
    );
  }
}
