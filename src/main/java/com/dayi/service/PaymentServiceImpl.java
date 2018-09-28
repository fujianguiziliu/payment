package com.dayi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dayi.entity.Payment;
import com.dayi.mapper.PaymentMapper;
@Service
public class PaymentServiceImpl implements PaymentService {
	
	@Autowired
	PaymentMapper paymentMapper;
	@Override
	public void savePay(Payment payment) {
		paymentMapper.savePay(payment);

	}

}
