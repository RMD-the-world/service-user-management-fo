package com.rmd.users.api.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserCommonRequest {

	protected Long userId;
	
	protected String username;
	
	protected String otp;
	
}
