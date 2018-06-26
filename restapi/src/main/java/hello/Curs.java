package hello;

import org.springframework.data.annotation.Id;

public class Curs {

	@Id private String id;

	private String Name;


	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

}







