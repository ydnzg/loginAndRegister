package loginAndRegister.business.abstracts;

import loginAndRegister.entities.concretes.User;

public interface UserService {

	void register(User user);
	void login(User user);
}
