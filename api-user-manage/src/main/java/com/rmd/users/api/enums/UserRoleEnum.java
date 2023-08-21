package com.rmd.users.api.enums;

public enum UserRoleEnum {

	USER(1, "USER"), SUPER_ADMIN(3, "SUPER_ADMIN"), ADMIN(6, "ADMIN"), SELLER(7, "SELLER");

	private final Integer id;
	private final String roleName;

	UserRoleEnum(int id, String roleName) {
		this.id = id;
		this.roleName = roleName;
	}

	public Integer getId() {
		return id;
	}

	public String getRoleName() {
		return roleName;
	}

	public static UserRoleEnum fromId(Integer id) {
		try {
			for (UserRoleEnum role : UserRoleEnum.values()) {
				if (role.id.equals(id)) {
					return role;
				}
			}
		} catch (Exception e) {
			throw new IllegalArgumentException(id != null ? id.toString() : null);
		}
		return null;
	}
	
	
	

}
