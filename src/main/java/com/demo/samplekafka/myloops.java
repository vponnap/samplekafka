package com.demo.samplekafka;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class myloops {

	private final static String GAP_SPECIALTY = "GS";

	private static Map<String, String> topicMapping() {
		Map<String, String> bmcTopicMap = new HashMap<>();

//Using Enum

		bmcTopicMap.put(Brand001.getBrandId(GAP_SPECIALTY), "gstopic");
		bmcTopicMap.put("4", "gotopic");
		bmcTopicMap.put("2", "brtopic");
		bmcTopicMap.put("5", "brfstopic");
		bmcTopicMap.put(Brand001.GAP_OUTLET.getBrandId(), "gotopic");

		return bmcTopicMap;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		final String OLD_NAVY = "ON";
		final String GAP_SPECIALTY = "GS";

		int a = 10;
		int b = 10;
		int c = 10;

		System.out.println(" The GO brand is " + Brand001.GAP_OUTLET.getBrandId());

		if (a == b && a == c) {

			System.out.println(" This is false");
		} else {
			System.out.println(" This is true");
		}

		int sum = 0;
		for (int k = 0; k <= 10; k++) {
			sum = sum + k;
			System.out.println(" the sume of numbers" + sum);
		}

		Map<String, String> authorizationResources = new HashMap<String, String>();
		authorizationResources.put("User", "N");
		authorizationResources.put("Admin", "Y");
		authorizationResources.put("OLD_NAVY", "3");
		authorizationResources.put(Brand001.getBrandId(GAP_SPECIALTY), "GS");

		authorizationResources.put(Brand001.getBrandId(OLD_NAVY), "ON");

		System.out.println(authorizationResources.get("User"));
		System.out.println("Y".equals(authorizationResources.get("User")));
		System.out.println("Y".equals(authorizationResources.get("Admin")));
		System.out.println("1".equals(authorizationResources.get("GAP_SPECIALTY")));

		String name = null;

		boolean ismyChoice = (name) == null ? false : true;

		System.out.println(" The flag is " + ismyChoice);

		if (a == b && ismyChoice) {

			System.out.println(" This is true");
		} else {
			System.out.println(" This is false");
		}

// MAP TEST

		String BMC = "4";
		System.out.println(BMC.toUpperCase());

		System.out.println(authorizationResources.get(BMC));

		if ("GS".equalsIgnoreCase(authorizationResources.get(BMC)))

			System.out.println(" this is true");
// MAP TEST

		Map<String, String> dsTopicMap = topicMapping();

		System.out.println(" the value is " + dsTopicMap.get(BMC));
		System.out.println(" the value is " + dsTopicMap.get(BMC));

		Map<Integer, String> ma = new HashMap<>();
		ma.put(1, "LALAJI");
		System.out.println("This is value " + ma.get(1));

		myloops ml = new myloops();
		ml.methodException();

		String market = "EU";

		boolean isEUMarket = false;
		List<String> priceStrategyList = null;

		System.out.println("EU market Indicator before loop " + isEUMarket);

		if (market.equalsIgnoreCase("EU")) {
			isEUMarket = true;
			System.out.println(" This is for EU market");

		}
		System.out.println("EU market Indicator after loop " + isEUMarket);

		System.out.println(" This is Test Runner " + enumRunner.COMPANY_LEVEL.values());

		List<String> priceStretagyEconomicRegionsList = Arrays.asList( );
		List<Integer> numbs = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

		
		String[] priceStartegies = { "32", "33", "34" };

		for (String p : priceStretagyEconomicRegionsList) {
			System.out.println("The array elements are " + priceStretagyEconomicRegionsList.add(p));
		}

		for (Integer n : numbs) {
			System.out.println("The array elements are " + n);
		}

		numbs.forEach(System.out::println);
		System.out.println(enumRunner01.AUR_SHAVE.getName());
			
	}

	private static void methodException() {
		try {
			String str = null;
			str.length();
			int i[] = { 1, 2 };
			int number = i[3];
			System.out.println("this is my method but ending now");
		} catch (NullPointerException ex) {
			ex.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException ex) {
			ex.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}