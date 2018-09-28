package com.dayi.mapper;

import org.springframework.stereotype.Repository;

import com.dayi.entity.Payment;

@Repository
public interface PaymentMapper {
	public void savePay(Payment payment);
}
