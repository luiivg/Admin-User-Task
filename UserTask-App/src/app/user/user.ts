import { Dependency } from './dependency';
import { Profile } from './profile';

export class User {
  id: number;
  name: string;
  birthdate: string;
  active: boolean;
  dependency : Dependency;
  profile : Profile;
}
