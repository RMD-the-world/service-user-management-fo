package com.rmd.users.api.enums;

public enum SellerStages {

	SELLER_CREDENTIALS(3, "seller_credentials"), 
	DETAILS_OF_SELLER(4, "details_of_seller"),
	DETAILS_OF_ORGANIZATION(5, "details_of_organization"),
	E_KYC_VERIFICATION(6, "e_kyc_verification"),
	REGISTRATION_COMPLETION(7, "registration_completion");
	
	private final Integer id;
	private final String code;

	SellerStages(int id, String code) {
		this.id = id;
		this.code = code;
	}

	public Integer getId() {
		return id;
	}

	public String getCode() {
		return code;
	}

	public static SellerStages fromId(Integer id) {
		try {
			for (SellerStages sellerStages : SellerStages.values()) {
				if (sellerStages.id.equals(id)) {
					return sellerStages;
				}
			}
		} catch (Exception e) {
			throw new IllegalArgumentException(id != null ? id.toString() : null);
		}
		return null;
	}
	
	public static SellerStages[] getAll() {
		return SellerStages.values();
	}
	
}
