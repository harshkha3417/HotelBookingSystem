package com.Harsh.projects.airBnbApp.strategy;

import com.Harsh.projects.airBnbApp.entity.Inventory;

import java.math.BigDecimal;
public interface PricingStrategy {

    BigDecimal calculatePrice(Inventory inventory);
}
