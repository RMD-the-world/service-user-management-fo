package com.rmd.users.api.model.seller;

import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

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
public class SellerDetailsProxy {

	private Long id;
	
	private Long firstName;

	private Long middelName;
	
	private Long lastName;

	@Temporal(TemporalType.TIMESTAMP)
	private Date birthday;
	
	private Long addharNumber;
	
	private Long userId;

}
