package loginAndRegister;

import loginAndRegister.business.abstracts.UserService;
import loginAndRegister.business.concretes.UserManager;
import loginAndRegister.core.concretes.GoogleRegisterAdapter;
import loginAndRegister.core.concretes.MailConfigurationManager;
import loginAndRegister.dataAccess.concretes.DataUserDao;
import loginAndRegister.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		User user = new User(1,"Ezgi","Aydin", "ezgiaydin@gmail.com","123Ea_");
		UserService userService = new UserManager(new DataUserDao(), new MailConfigurationManager(),
				                  new GoogleRegisterAdapter());
		userService.register(user);
        userService.login(user);
	}

}
