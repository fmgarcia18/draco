package com.fmgarcia.draco.core.dtos;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CustomerRequestDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3060146898119920545L;

	@NotEmpty
	private String firstName;

	@NotEmpty
	private String lastName;

	@NotEmpty
	private String email;

	@NotEmpty
	private String phone;

}
