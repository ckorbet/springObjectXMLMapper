package es.steria.springobjectxmlmapper.beans;

import java.io.Serializable;

public class CustomerInfo implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;
	private long id;
	private boolean valid;
	private CustomerCompany company;

	/**
	 * <p>
	 * Crea una instancia por defecto de <code>CustomerInfo</code>
	 * </p>
	 */
	public CustomerInfo(){
		super();
	}

	/**
	 * <p>
	 * Crea una instancia por defecto de <code>CustomerInfo</code>
	 * con todas sus propiedades
	 * </p>
	 * @param name <code>String</code> nombre que se tiene que asignar
	 * @param id <code>long</code> id que se tiene que asignar
	 * @param valid <code>boolean</code> valido que se tiene que asignar
	 */
	public CustomerInfo(final String name, final long id, final boolean valid, final CustomerCompany company) {
		super();
		this.name = name;
		this.id = id;
		this.valid = valid;
		this.company = company;
	}

	public final String getName() {
		return name;
	}

	public final void setName(final String name) {
		this.name = name;
	}

	public final long getId() {
		return id;
	}

	public final void setId(final long id) {
		this.id = id;
	}

	public final boolean isValid() {
		return valid;
	}

	public final void setValid(final boolean valid) {
		this.valid = valid;
	}

	public CustomerCompany getCompany() {
		return company;
	}

	public void setCompany(final CustomerCompany company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return new StringBuilder().append("CustomerInfo [name=").append(name)
											  .append(", id=").append(id)
											  .append(", valid=").append(valid)
											  .append(", company=").append(company).append("]").toString();
	}

}
