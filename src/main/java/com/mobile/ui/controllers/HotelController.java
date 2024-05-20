package com.mobile.ui.controllers;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mobile.ui.model.HotelSearch;
import com.mobile.ui.model.dto.HotelRequestDTO;

@Controller
public class HotelController {
	
	
	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private ObjectMapper objectMapper;
	
	@GetMapping("/hotelSearch")
	public String hotelSearch(Model model) {

		return "hotelSearch";
	}
	

	@PostMapping("/hotelList")
	public String hotelList(@ModelAttribute HotelSearch hotelSearch, Model model) {

		 // Make an HTTP GET request to the hotelDataList API
        String apiUrl = "http://localhost:8091/hotelDataList";
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(apiUrl, String.class);

        // Retrieve the data from the API response
        String hotelData = responseEntity.getBody();

       
        try {
            List<HotelRequestDTO> hotelList = objectMapper.readValue(hotelData, new TypeReference<List<HotelRequestDTO>>() {});
            // Now you have a list of HotelRequestDTO objects
            System.out.println(hotelList);
            model.addAttribute("hotelList", hotelList);
        } catch (JsonProcessingException e) {
            // Handle JSON parsing exception
            System.err.println("Error parsing JSON: " + e.getMessage());
        }

        return "hotelList";

	}

}
