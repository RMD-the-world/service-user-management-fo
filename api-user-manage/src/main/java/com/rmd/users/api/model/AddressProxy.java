package com.rmd.users.api.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AddressProxy {

	
	private Long id;

	private Long stageCode;

//	@Column(name = "local")
//	private String local;
	
	private String street;
	
	private String stageName;

	private Long cityCode;

	private String cityName;

	private Long areaOrVillageCode;

	private String areaOrVillageName;

	private Long pincode;	
	
}
