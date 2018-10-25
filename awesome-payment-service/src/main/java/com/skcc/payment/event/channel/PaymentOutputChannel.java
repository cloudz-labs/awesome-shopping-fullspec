package com.skcc.payment.event.channel;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface PaymentOutputChannel {
	String PaymentOutput = "PaymentOutput";
	
	@Output(PaymentOutputChannel.PaymentOutput)
	MessageChannel getMessageChannel();
}
