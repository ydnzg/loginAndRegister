package loginAndRegister.core.concretes;

import loginAndRegister.core.abstracts.RegisterGoogleAccount;
import loginAndRegister.googleRegister.GoogleRegisterManager;

public class GoogleRegisterAdapter implements RegisterGoogleAccount{

	@Override
	public void registerWithGoogleAccount(String message) {
		
		GoogleRegisterManager googleRegisterManager = new GoogleRegisterManager();
		googleRegisterManager.register(message);
	}

}
