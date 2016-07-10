package br.com.soapboxrace.dao.xml;

import br.com.soapboxrace.dao.factory.IUserDao;
import br.com.soapboxrace.jpa.UserEntity;

public class UserDao extends SoapboxDao implements IUserDao {

	@Override
	public UserEntity findById(Long id) {
		UserEntity entity = (UserEntity) super.findById(UserEntity.class, id);
		return entity;
	}

	public UserEntity findByEmail(String email) {
		return null;
	}

	public UserEntity save(UserEntity entity) {
		return (UserEntity) super.save(entity);
	}
}
