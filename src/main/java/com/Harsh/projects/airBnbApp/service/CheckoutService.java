package com.Harsh.projects.airBnbApp.service;

import com.Harsh.projects.airBnbApp.entity.Booking;

public interface CheckoutService {

    String getCheckoutSession(Booking booking, String successUrl, String failureUrl);

}
