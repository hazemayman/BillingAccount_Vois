package com.mariam.billingaccount.controller;

import com.mariam.billingAccount.api.VoisApi;
import com.mariam.billingAccount.models.Subscriber;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SubscriberController implements VoisApi {

    @Override
    public ResponseEntity<Void> createSubscriber(Subscriber body) {
        return null;
    }

    @Override
    public ResponseEntity<List<Subscriber>> getAllSubscribersByBan(String ban) {
        return null;
    }

    @Override
    public ResponseEntity<List<Subscriber>> getSubscriber(String ban, String subscriber) {
        return null;
    }
}
