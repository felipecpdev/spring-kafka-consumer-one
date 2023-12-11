package com.felipecpdev.fcpdevconsumer.listeners;

import com.felipecpdev.fcpdevconsumer.models.TransactionMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
@Slf4j
public class KafkaConsumerListener {

    @KafkaListener(topics = {"transaction-topic"}, groupId = "group-id")
    public void listenerOne(TransactionMessage transactionMessage) {
        log.info("Transaction with id: " + transactionMessage.getTransactionId()
                + ", the status is :" + transactionMessage.getStatus());
    }
}
