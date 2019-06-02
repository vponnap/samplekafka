package com.demo.samplekafka;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor

public enum enumRunner01 {

        PROMOTION("Promo"),
        SIGN("Sign"),
        DEMAND("Demand"),
        AUR_SHAVE("AUR shave"),
        AUR_SHAVE_MD("AUR Shave MD")
        ;
        private String name;
        
    }


