package com.rmd.users.api.model.seller;

import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import com.rmd.users.api.model.AddressProxy;

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
public class OrganizationDetailsProxy {

	protected Long id;

	protected String nameOfOrg;

//	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.TIMESTAMP)
	protected Date stablishDate;

	protected String gstNumber;

	protected Boolean haveAnyOtherBranch;

	protected Long userId;
	
	AddressProxy addressProxy;
	
}
