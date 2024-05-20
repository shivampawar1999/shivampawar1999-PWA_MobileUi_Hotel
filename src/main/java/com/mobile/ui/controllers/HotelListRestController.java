package com.mobile.ui.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HotelListRestController {
	
	
	@GetMapping("/hotelDataList")
	public ResponseEntity<String> getHotelData() {
	    String jsonData = "[\n" +
	            "    {\n" +
	            "        \"hotelImage\": \"https://example.com/hotel1.jpg\",\n" +
	            "        \"hotelName\": \"Hotel One\",\n" +
	            "        \"hotelCity\": \"City One\",\n" +
	            "        \"hotelRating\": 4.5,\n" +
	            "        \"hotelAddress\": \"Address One\",\n" +
	            "        \"hotelFacility\": [\"Free Wi-Fi\", \"Swimming Pool\", \"Gym\"],\n" +
	            "        \"roomPrice\": 150\n" +
	            "    },\n" +
	            "    {\n" +
	            "        \"hotelImage\": \"https://example.com/hotel2.jpg\",\n" +
	            "        \"hotelName\": \"Hotel Two\",\n" +
	            "        \"hotelCity\": \"City Two\",\n" +
	            "        \"hotelRating\": 3.8,\n" +
	            "        \"hotelAddress\": \"Address Two\",\n" +
	            "        \"hotelFacility\": [\"Coffee\", \"Car Rental\", \"Parking\"],\n" +
	            "        \"roomPrice\": 120\n" +
	            "    },\n" +
	            "    {\n" +
	            "        \"hotelImage\": \"https://example.com/hotel3.jpg\",\n" +
	            "        \"hotelName\": \"Hotel Three\",\n" +
	            "        \"hotelCity\": \"City Three\",\n" +
	            "        \"hotelRating\": 4.2,\n" +
	            "        \"hotelAddress\": \"Address Three\",\n" +
	            "        \"hotelFacility\": [\"Restaurant\", \"Coffee\", \"Car Rental\"],\n" +
	            "        \"roomPrice\": 180\n" +
	            "    },\n" +
	            "    {\n" +
	            "        \"hotelImage\": \"https://example.com/hotel4.jpg\",\n" +
	            "        \"hotelName\": \"Hotel Four\",\n" +
	            "        \"hotelCity\": \"City Four\",\n" +
	            "        \"hotelRating\": 4.0,\n" +
	            "        \"hotelAddress\": \"Address Four\",\n" +
	            "        \"hotelFacility\": [\"Free Wi-Fi\", \"Swimming Pool\", \"Gym\"],\n" +
	            "        \"roomPrice\": 160\n" +
	            "    },\n" +
	            "    {\n" +
	            "        \"hotelImage\": \"https://example.com/hotel5.jpg\",\n" +
	            "        \"hotelName\": \"Hotel Five\",\n" +
	            "        \"hotelCity\": \"City Five\",\n" +
	            "        \"hotelRating\": 4.7,\n" +
	            "        \"hotelAddress\": \"Address Five\",\n" +
	            "        \"hotelFacility\": [\"Luggage Storage\", \"Car Rental\", \"Room Service\"],\n" +
	            "        \"roomPrice\": 200\n" +
	            "    },\n" +
	            "    {\n" +
	            "        \"hotelImage\": \"https://example.com/hotel6.jpg\",\n" +
	            "        \"hotelName\": \"Hotel Six\",\n" +
	            "        \"hotelCity\": \"City Six\",\n" +
	            "        \"hotelRating\": 3.5,\n" +
	            "        \"hotelAddress\": \"Address Six\",\n" +
	            "        \"hotelFacility\": [\"Bar\", \"Spa\", \"Restaurant\"],\n" +
	            "        \"roomPrice\": 130\n" +
	            "    },\n" +
	            "    {\n" +
	            "        \"hotelImage\": \"https://example.com/hotel7.jpg\",\n" +
	            "        \"hotelName\": \"Hotel Seven\",\n" +
	            "        \"hotelCity\": \"City Seven\",\n" +
	            "        \"hotelRating\": 4.9,\n" +
	            "        \"hotelAddress\": \"Address Seven\",\n" +
	            "        \"hotelFacility\": [\"Coffee\", \"Car Rental\", \"Parking\"],\n" +
	            "        \"roomPrice\": 220\n" +
	            "    },\n" +
	            "    {\n" +
	            "        \"hotelImage\": \"https://example.com/hotel8.jpg\",\n" +
	            "        \"hotelName\": \"Hotel Eight\",\n" +
	            "        \"hotelCity\": \"City Eight\",\n" +
	            "        \"hotelRating\": 3.9,\n" +
	            "        \"hotelAddress\": \"Address Eight\",\n" +
	            "        \"hotelFacility\": [\"Spa\", \"Car Rental\", \"Bar\"],\n" +
	            "        \"roomPrice\": 140\n" +
	            "    },\n" +
	            "    {\n" +
	            "        \"hotelImage\": \"https://example.com/hotel9.jpg\",\n" +
	            "        \"hotelName\": \"Hotel Nine\",\n" +
	            "        \"hotelCity\": \"City Nine\",\n" +
	            "        \"hotelRating\": 4.4,\n" +
	            "        \"hotelAddress\": \"Address Nine\",\n" +
	            "        \"hotelFacility\": [\"Room Service\", \"Coffee\", \"Spa\"],\n" +
	            "        \"roomPrice\": 190\n" +
	            "    },\n" +
	            "    {\n" +
	            "        \"hotelImage\": \"https://example.com/hotel10.jpg\",\n" +
	            "        \"hotelName\": \"Hotel Ten\",\n" +
	            "        \"hotelCity\": \"City Ten\",\n" +
	            "        \"hotelRating\": 4.6,\n" +
	            "        \"hotelAddress\": \"Address Ten\",\n" +
	            "        \"hotelFacility\": [\"Room Service\", \"Swimming Pool\", \"Luggage Storage\"],\n" +
	            "        \"roomPrice\": 170\n" +
	            "    }\n" +
	            "]";

	    return new ResponseEntity<>(jsonData, HttpStatus.OK);
	}


}
