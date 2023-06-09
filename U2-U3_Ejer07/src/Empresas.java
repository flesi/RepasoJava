
public class Empresas {
	
	private int index;
	private String id;
	private String name;
	private String country;
	private String website;
	private String description;
	private int Founded;
	private String Industry;
	private int numberOfEmployee;
	
	public Empresas(int index, String id, String name, String country, String website, String description, int founded,
			String industry, int numberOfEmployee) {
		super();
		this.index = index;
		this.id = id;
		this.name = name;
		this.country = country;
		this.website = website;
		this.description = description;
		Founded = founded;
		Industry = industry;
		this.numberOfEmployee = numberOfEmployee;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getFounded() {
		return Founded;
	}

	public void setFounded(int founded) {
		Founded = founded;
	}

	public String getIndustry() {
		return Industry;
	}

	public void setIndustry(String industry) {
		Industry = industry;
	}

	public int getNumberOfEmployee() {
		return numberOfEmployee;
	}

	public void setNumberOfEmployee(int numberOfEmployee) {
		this.numberOfEmployee = numberOfEmployee;
	}

	@Override
	public String toString() {
		return "Empresas [index=" + index + ", id=" + id + ", name=" + name + ", country=" + country + ", website="
				+ website + ", description=" + description + ", Founded=" + Founded + ", Industry=" + Industry
				+ ", numberOfEmployee=" + numberOfEmployee + "]";
	}
	
	
	
	

}
