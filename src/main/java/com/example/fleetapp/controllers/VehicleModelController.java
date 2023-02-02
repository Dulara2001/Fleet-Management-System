package com.example.fleetapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleModelController {

	@GetMapping("/vehiclemodls")
	public String getVehicleModels() {
		return "vehicleModel";
	}
}
