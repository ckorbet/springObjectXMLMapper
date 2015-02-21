package es.steria.springobjectxmlmapper.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CustomerCompany implements Serializable {

	private static final long serialVersionUID = 1L;

	private String companyName;
	private long companyId;
	private boolean companyValid;
	private List<String> deptos;

	public CustomerCompany() {
		super();
		if(this.deptos==null){
			this.deptos = new ArrayList<String>(10);
		}
		this.deptos.add("CONTABILIDAD");
		this.deptos.add("FINANZAS");
		this.deptos.add("MARKETING");
		this.deptos.add("PUBLICIDAD");
		this.deptos.add("INFORMATICA");
		this.deptos.add("COMUNICACIONES");
		this.deptos.add("DIRECCIÓN");
		this.deptos.add("RECURSOS HUMANOS");
		this.deptos.add("LIMPIEZA");
		this.deptos.add("GESTORÍA");
	}

	public CustomerCompany(final String companyName, final long companyId, final boolean companyValid) {
		super();
		this.companyName = companyName;
		this.companyId = companyId;
		this.companyValid = companyValid;
		if(this.deptos==null){
			this.deptos = new ArrayList<String>(10);
		}
		this.deptos.add("CONTABILIDAD");
		this.deptos.add("FINANZAS");
		this.deptos.add("MARKETING");
		this.deptos.add("PUBLICIDAD");
		this.deptos.add("INFORMATICA");
		this.deptos.add("COMUNICACIONES");
		this.deptos.add("DIRECCIÓN");
		this.deptos.add("RECURSOS HUMANOS");
		this.deptos.add("LIMPIEZA");
		this.deptos.add("GESTORÍA");
	}

	public final String getCompanyName() {
		return companyName;
	}

	public final void setCompanyName(final String companyName) {
		this.companyName = companyName;
	}

	public final long getCompanyId() {
		return companyId;
	}

	public final void setCompanyId(final long companyId) {
		this.companyId = companyId;
	}

	public final boolean isCompanyValid() {
		return companyValid;
	}

	public final void setCompanyValid(final boolean companyValid) {
		this.companyValid = companyValid;
	}

	public List<String> getDeptos() {
		return deptos;
	}

	public void setDeptos(final List<String> deptos) {
		this.deptos = deptos;
	}

	@Override
	public String toString() {
		return new StringBuilder().append("CustomerCompany [companyName=").append(companyName)
				                                   .append(", companyId=").append(companyId)
				                                   .append(", companyValid=")
				                                   .append(companyValid).append("]").toString();
	}









}
