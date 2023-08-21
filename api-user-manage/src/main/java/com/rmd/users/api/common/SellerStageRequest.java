package com.rmd.users.api.common;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class SellerStageRequest {

	private Long userId;
	private String username;
	
	private Integer stageId;

	private String stageName;
	private String status; // reg status
	

}
