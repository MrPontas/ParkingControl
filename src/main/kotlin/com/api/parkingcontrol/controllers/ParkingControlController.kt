package com.api.parkingcontrol.controllers

import com.api.parkingcontrol.models.CarModel
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ParkingControlController {
	@GetMapping("/")
	fun index() {
		var car: CarModel
	}
}