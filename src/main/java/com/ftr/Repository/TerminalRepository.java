package com.ftr.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ftr.Entity.TerminalEntity;

@Repository
public interface TerminalRepository extends CrudRepository<TerminalEntity, String>{
	
	public TerminalEntity getByItemType(String itemType);
	
	@Query("SELECT t.harborLocation from TerminalEntity t WHERE t.country= :country and t.status='available'")
	public List<String> getAvailableHarborLocations(@Param("country")String country);

}
