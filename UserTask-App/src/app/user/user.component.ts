import { Component, OnInit } from '@angular/core';
import { User } from './user';
import { UserService } from './service/user.service';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit{
  title= 'Users';
  List= 'Users List';

  UserList: User[];
  private userService: UserService;

  constructor(userService: UserService) {
    this.userService = userService;
  }

  ngOnInit(){
    this.userService.getusers().subscribe(
      users => this.UserList = users
    );
  }

}
