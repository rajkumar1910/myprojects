package net.codejava.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Product")
public class Product {

	@Column(name = "product_item_id")
	private int product_item_id;
	@Column(name = "product_name")
	private String product_name;
	@Column(name = "description")
	private String description;
	@Column(name = "valid_from")
	private String valid_from;
	@Column(name = "valid_to")
	private String valid_to;
	@Column(name = "is_bulk")
	private boolean is_bulk;
	/*
	 * @Column(name = "part_number") private int part_number;
	 * 
	 * @Column(name = "part_classification") private String part_classification;
	 * 
	 * @Column(name = "part_quantity") private int part_quantity;
	 * 
	 * @Column(name = "notes") private String notes;
	 */


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getProduct_item_id() {
		return product_item_id;
	}

	public void setProduct_item_id(int product_item_id) {
		this.product_item_id = product_item_id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getValid_from() {
		return valid_from;
	}

	public void setValid_from(String valid_from) {
		//SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
		this.valid_from = valid_from;
	}

	public String getValid_to() {
		return valid_to;
	}

	public void setValid_to(String valid_to) {
		//SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
		this.valid_to = valid_to;
	}

	public boolean isIs_bulk() {
		return is_bulk;
	}

	public void setIs_bulk(boolean is_bulk) {
		this.is_bulk = is_bulk;
	}
	
	
	/*
	 * private int getPart_number() { return part_number; }
	 * 
	 * private void setPart_number(int part_number) { this.part_number =
	 * part_number; }
	 * 
	 * private String getPart_classification() { return part_classification; }
	 * 
	 * private void setPart_classification(String part_classification) {
	 * this.part_classification = part_classification; }
	 * 
	 * private int getPart_quantity() { return part_quantity; }
	 * 
	 * private void setPart_quantity(int part_quantity) { this.part_quantity =
	 * part_quantity; }
	 * 
	 * private String getNotes() { return notes; }
	 * 
	 * private void setNotes(String notes) { this.notes = notes; }
	 * 
	 */

	
	public Product() {
	}

	protected Product(int product_item_id, String product_name, String description, String valid_from, String valid_to, boolean is_bulk, int part_number, String part_classification, int part_quantity, String notes ) {
		super();
		this.product_item_id = product_item_id;
		this.product_name = product_name;
		this.description = description;
		this.valid_from = valid_from;
		this.valid_to = valid_to;
		this.is_bulk = is_bulk;
		/*
		 * this.part_number = part_number; this.part_classification =
		 * part_classification; this.part_quantity = part_quantity; this.notes = notes;
		 */

	}
	
	@Override
	public String toString() {
		return "Tutorial [product_item_id=" + product_item_id + ", product_name=" + product_name + ", desc=" + description + ", valid_from=" + valid_from + ",  valid_from=" + valid_to + ",is_bulk=" + is_bulk + ", part_number=\" + part_number + \", part_classification=\" + part_classification + \", part_quantity=\" + part_quantity + \", notes=\" + notes + \"]";
	}
	

}
