package loginAndRegister.core.concretes;

import loginAndRegister.core.abstracts.MailConfigurationService;

public class MailConfigurationManager implements MailConfigurationService {

	@Override
	public void sentMail() {
		System.out.println("Hesap dogrulamasi icin maillerinizi kontrol ediniz");
		
	}

}
