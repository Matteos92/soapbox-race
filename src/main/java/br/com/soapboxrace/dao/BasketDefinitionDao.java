package br.com.soapboxrace.dao;

import java.util.List;

import br.com.soapboxrace.db.SoapboxDao;
import br.com.soapboxrace.jpa.BasketDefinitionEntity;
import br.com.soapboxrace.jpa.ISoapBoxEntity;

public class BasketDefinitionDao extends SoapboxDao {

	@Override
	public BasketDefinitionEntity findById(Long id) {
		BasketDefinitionEntity entity = (BasketDefinitionEntity) super.findById(BasketDefinitionEntity.class, id);
		return entity;
	}

	public BasketDefinitionEntity findByProductId(String productId) {
		BasketDefinitionEntity basketDefinition = new BasketDefinitionEntity();
		basketDefinition.setProductId(productId);
		List<ISoapBoxEntity> baskets = super.find(basketDefinition);
		if (baskets.size() > 0) {
			return (BasketDefinitionEntity) baskets.get(0);
		}
		return null;
	}
}
