package com.demo.samplekafka;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor

public enum Brand001 {

	OLD_NAVY("3", "ON", "ON", "Old Navy", "US/Mountain"),
	GAP_SPECIALTY("1", "GS", "Gap", "Gap Specialty", "US/Mountain"),
	GAP_OUTLET("4", "GO", "GO", "Gap Outlet", "US/Mountain"),
	BANANA_REPUBLIC("2", "BR", "BR", "Banana Republic", "US/Mountain"),
	BANANA_REPUBLIC_FACTORY_STORE("5", "BRFS", "BRFS", "Banana Republic Factory Store", "US/Mountain");

	private final String brandId;
	private final String brandName;
	private final String brandCode;
	private final String description;
	private final String timeZone;

	private static final String INVALID_BRAND = "Invalid brand abbreviation";

	public static Brand001 fromBrandId(String brandId) {
		for (Brand001 brand : Brand001.values()) {
			if (brand.brandId.equals(brandId)) {
				return brand;
			}
		}
		return null;

	}

	public static String getBrandName(String brandId) {

		for (Brand001 brand : Brand001.values()) {
			if (brand.brandId.equals(brandId)) {
				return brand.getBrandName();

			}
		}
		return null;
	}

	public static String getBrandDescriptios(String brandId) {

		for (Brand001 brand : Brand001.values()) {
			if (brand.brandId.equals(brandId)) {
				return brand.getDescription();
			}
		}
		return null;
	}

	public static String getBrandTimeZone(String brandId) {

		for (Brand001 brand : Brand001.values()) {
			if (brand.brandId.equals(brandId)) {
				return brand.getTimeZone();
			}
		}
		return null;
	}

	public static String getBrandCode(String brandId) {

		for (Brand001 brand : Brand001.values()) {
			if (brand.brandId.equals(brandId)) {
				return brand.getBrandCode();
			}
		}
		return null;
	}

	public static String getBrandId(String brandName) {

		for (Brand001 brand : Brand001.values()) {
			if (brand.brandName.equals(brandName)) {
				return brand.getBrandId();
			}
		}
		return null;
	}
}
