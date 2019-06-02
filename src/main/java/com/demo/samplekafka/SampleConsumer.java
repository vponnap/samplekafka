package com.demo.samplekafka;

import java.util.Arrays;
import java.util.Properties;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;

public class SampleConsumer {


	public static void main(String[] args) {
 
		 String[] topicName = { "TP.DEMANDIMPACT.INBOUND.EVENTS.BR.DEV" };
		 String groupName = "EventsTopicGroup";
		 
		// TODO Auto-generated method stub
		Properties props = new Properties();
		// props.put("bootstrap.servers", "localhost:9092,localhost:9093");

		props.put("bootstrap.servers",
				"wn0-devdik.waqq0sav5qee5crkuqcifcnjtf.dx.internal.cloudapp.net:9092, wn1-devdik.waqq0sav5qee5crkuqcifcnjtf.dx.internal.cloudapp.net:9092,wn2-devdik.waqq0sav5qee5crkuqcifcnjtf.dx.internal.cloudapp.net:9092");
		props.put("group.id", groupName);
		props.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeSerializer");
		props.put("value.deserializer", "org.apache.kafka.common.serialization.StringDeSerializer");

		KafkaConsumer<String, String> consumer = null;

        try {
            consumer = new KafkaConsumer<>(props);
            consumer.subscribe(Arrays.asList(topicName));

            while (true){
                ConsumerRecords<String, String> records = consumer.poll(100);
                for (ConsumerRecord<String, String> record : records){
                    System.out.println("the feed is " + record); 
                consumer.commitAsync();
            }
        }  
        } catch(Exception ex){
            ex.printStackTrace();
        }finally{
            consumer.commitSync();
            consumer.close();
        }
  	
	}	
		
	
}

