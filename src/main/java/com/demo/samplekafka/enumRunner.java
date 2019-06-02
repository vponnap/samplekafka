package com.demo.samplekafka;

public enum enumRunner {


    COMPANY_LEVEL("2", "companyId", "COMPANY");

    private String value;

    private String criteriaName;

    private String levelCode;

    enumRunner(String value, String criteriaName, String levelCode) {
        this.value = value;
        this.criteriaName = criteriaName;
        this.levelCode = levelCode;
    }
}
