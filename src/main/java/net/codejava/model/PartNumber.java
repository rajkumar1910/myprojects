package net.codejava.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PartNumber")
public class PartNumber {
	
	@Column(name = "product_item_id")
	private int product_item_id;
	@Column(name = "equipmentName")
	private String equipmentName;
	@Column(name = "part_number")
	private int part_number;
	@Column(name = "part_classification")
	private String part_classification;
	@Column(name = "part_quantity")
	private int part_quantity;
	@Column(name = "notes")
	private String notes;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getProduct_item_id() {
		return product_item_id;
	}
	public void setProduct_item_id(int product_item_id) {
		this.product_item_id = product_item_id;
	}
	
	public String getEquipmentName() {
		return equipmentName;
	}
	public void setEquipmentName(String equipmentName) {
		this.equipmentName = equipmentName;
	}
	
	public int getPart_number() {
		return part_number;
	}
	public void setPart_number(int part_number) {
		this.part_number = part_number;
	}

	public String getPart_classification() {
		return part_classification;
	}

	public void setPart_classification(String part_classification) {
		this.part_classification = part_classification;
	}

	public int getPart_quantity() {
		return part_quantity;
	}

	public void setPart_quantity(int part_quantity) {
		this.part_quantity = part_quantity;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}
	
	
	
	  protected PartNumber(int product_item_id, String product_name, String
	  description, String valid_from, String valid_to, boolean is_bulk, int
	  part_number, String part_classification, int part_quantity, String notes ) {
		  
	  super();
	  this.product_item_id = product_item_id;
	  this.part_number = part_number;
	  this.part_classification = part_classification;
	  this.part_quantity = part_quantity;
	  this.notes = notes;
	  
	  }
	  
	  @Override public String toString() { return
	  "Tutorial [ part_number=\" + part_number + \", part_classification=\" + part_classification + \", part_quantity=\" + part_quantity + \", notes=\" + notes + \"]"
	  ; }
	 

}
