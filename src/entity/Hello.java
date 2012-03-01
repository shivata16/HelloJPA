package entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the hello database table.
 * 
 */
@Entity
@Table(name="hello")
public class Hello implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String name;

    public Hello() {
    }

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}