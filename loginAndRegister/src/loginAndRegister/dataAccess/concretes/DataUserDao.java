package loginAndRegister.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import loginAndRegister.dataAccess.abstracts.UserDao;
import loginAndRegister.entities.concretes.User;

public class DataUserDao implements UserDao{

	List<User> users = new ArrayList<User>();
	
	@Override
	public void add(User user) {
		users.add(user);
		System.out.println(user.getFirstName() + " Isimli kisi kaydi yapildi");		
	}

	@Override
	public void delete(User user) {
		for(User item:users) {
			if(item.getId()==user.getId()) {
				users.remove(item.getId());
				System.out.println("Kayit silindi");
			}else {
				System.out.println("Kayit silme islemi sirasinda hata olustu");
			}
		}
		
	}

	@Override
	public void update(User user) {
		
		User userUpdate=users.get(user.getId());
		userUpdate.setFirstName(user.getFirstName());
		userUpdate.setLastName(user.getLastName());
		System.out.println("kayit guncellendi");
	}

	@Override
	public User get(int id) {
		for(User user:users) {
			if(user.getId()==id) {
				return user;
			}
		}
		return null;
	}

	@Override
	public List<User> getAll() {
		
		return users;
	}

	@Override
	public User getByMail(String email) {
		for(User user:users) {
			if(user.getEmail()==email) {
				return user;
			}
		}
		return null;
	}

}
