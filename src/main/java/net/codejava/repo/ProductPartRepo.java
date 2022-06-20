package net.codejava.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import net.codejava.model.PartNumber;

public interface ProductPartRepo extends JpaRepository<PartNumber, Integer> {


	/*
	 * @Modifying
	 * 
	 * @Query("UPDATE product c SET c.part_number = :part_number, c.part_classification = :part_classification,c.part_quantity = :part_quantity,c.notes = :notes WHERE c.product_item_id = :product_item_id"
	 * ) int updatePart(@Param("product_item_id") int
	 * product_item_id, @Param("part_number") int part_number
	 * , @Param("part_classification") String
	 * part_classification,@Param("part_quantity") int part_quantity,@Param("notes")
	 * String notes);
	 */

}
