package com.moviedb_client.data.service

import com.moviedb_client.data.model.CertificationsTV
import com.moviedb_client.data.model.CertificationsTVWrapper
import retrofit2.http.GET


interface CertificationService {


    @GET("/certification/movie/list")
    suspend fun getMovieCertification(): CertificationsTV

    @GET("/certification/tv/list")
    suspend fun getTvCertifications(): CertificationsTVWrapper



}