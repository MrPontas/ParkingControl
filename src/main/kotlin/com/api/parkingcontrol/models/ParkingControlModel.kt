package com.api.parkingcontrol.models

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.OneToOne
import jakarta.persistence.PrimaryKeyJoinColumn
import java.io.Serializable
import java.time.LocalDateTime
import java.util.UUID

@Entity
data class ParkingControlModel(
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private var id: UUID,

	@Column(nullable = false, length = 10, unique = true)
	private var parkingSpotNumber: String,

	@Column(nullable = false)
	private var registrationDate: LocalDateTime,

	@OneToOne
	private var car: CarModel,

	@Column(nullable = false, length = 130)
	private var responsibleName: String,

	@Column(nullable = false, length = 30)
	private var apartment: String,

	@Column(nullable = false, length = 30)
	private var block: String
) : Serializable
