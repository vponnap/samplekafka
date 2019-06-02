package com.demo.samplekafka.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AirFeed {

	private String Fname;
	private String Lname;
	private String Country;

}
