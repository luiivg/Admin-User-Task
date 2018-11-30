import { Injectable } from '@angular/core';
import { USERLIST } from '../user.json';
import { User } from '../user';
import { Observable, of } from 'rxjs';

@Injectable()
export class UserService {

  constructor() { }

  getusers(): Observable<User[]> {
    return of(USERLIST);
  }
}
