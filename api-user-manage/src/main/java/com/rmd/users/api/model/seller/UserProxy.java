package com.rmd.users.api.model.seller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class UserProxy {

	private Integer id;
	
	private String username;
	
	private String password;
	
	private String name;

	private String mobileNumber;
	
	private String email;
	
	private Integer roleId;
	
	
}
