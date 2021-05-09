package loginAndRegister.business.concretes;

import loginAndRegister.business.abstracts.UserService;
import loginAndRegister.core.abstracts.MailConfigurationService;
import loginAndRegister.core.abstracts.RegisterGoogleAccount;
import loginAndRegister.dataAccess.abstracts.UserDao;
import loginAndRegister.entities.concretes.User;

public class UserManager implements UserService {

	private UserDao userDao;
	private MailConfigurationService mailConfigurationService;
	private RegisterGoogleAccount registerGoogleAccount;
	
	public UserManager(UserDao userDao, MailConfigurationService mailConfigurationService,RegisterGoogleAccount registerGoogleAccount) {
		this.userDao=userDao;
		this.mailConfigurationService=mailConfigurationService;
		this.registerGoogleAccount=registerGoogleAccount;
	}
	
	@Override
	public void register(User user) {
		
		if(BusinessRules.validatator(user)) {
			userDao.add(user);
			mailConfigurationService.sentMail();
			registerGoogleAccount.registerWithGoogleAccount("Googgle hesabi ile kayit olundu. Isim : ");
		}else {
			System.out.println("Kayit islemi sirasinda hata olustu");
		}
		
	}

	@Override
	public void login(User user) {
		
		if(BusinessRules.validatator(user))
		{
		     System.out.println("Giris basarili");
		}
		
		else
		{
			System.out.println("Hata");
		}
		
	}

}
