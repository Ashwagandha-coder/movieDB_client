package com.moviedb_client.data.model


data class Certifications (
    val certifications: Map<String, List<Certification>>
)

data class Certification (
    val certification: String,
    val meaning: String,
    val order: Long
)