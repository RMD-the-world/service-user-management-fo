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
public class SellerStageResponse {
	
	private String status; // reg status
	private String message;
	private String stageName;
	
	private Long userId;
	
	private int httpStatus;
	private Integer stageCode;

	private Boolean isJourneyComplate;
	private Boolean isRejected;

	
	private Boolean flag;
	private Date completionDate;
}
