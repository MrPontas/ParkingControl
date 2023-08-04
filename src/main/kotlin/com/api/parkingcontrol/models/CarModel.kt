package com.api.parkingcontrol.models

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.util.*

@Entity
data class CarModel(
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private var id: UUID,

	@Column(nullable = false, length = 70, unique = true)
	private var licensePlate: String,

	@Column(nullable = false, length = 70)
	private var brand: String,

	@Column(nullable = false, length = 70)
	private var model: String,

	@Column(nullable = false, length = 70)
	private var color: String,

	)
