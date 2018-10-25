package com.skcc.payment.event.channel;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface PaymentInputChannel {
	String orderPayFailed = "orderPayFailed";
	String orderCreated = "orderCreated";
 	
	@Input(PaymentInputChannel.orderCreated)
	SubscribableChannel orderCreated();
	@Input(PaymentInputChannel.orderPayFailed)
	SubscribableChannel orderPayFailed();
	
}
