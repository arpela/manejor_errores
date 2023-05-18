/**
 * 
 */
package uy.com.s4b.vo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class EmployeeVO implements Serializable {

	private static final long serialVersionUID = -5091461080375368579L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer employeeId;

	@NotEmpty(message = "El nombre no puede setar vacio")
	@Column()
	private String firstName;

	@NotEmpty(message = "El nombre no puede estar vacio")
	@Column()
	private String lastName;

	@NotEmpty(message = "email no puede estar vacio")
	@Email(message = "email no esta valido")
	@Column()
	private String email;

}