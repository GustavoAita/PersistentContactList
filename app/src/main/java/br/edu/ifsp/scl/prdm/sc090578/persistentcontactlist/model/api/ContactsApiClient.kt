package br.edu.ifsp.scl.prdm.sc090578.persistentcontactlist.model.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ContactsApiClient {
    private const val BASE_URL = "http://10.115.64.69:3000/"

    private val retrofit = Retrofit
        .Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(
            GsonConverterFactory.create()
        )
        .build()

    val contactsApiService: ContactsApiService = retrofit.create(ContactsApiService::class.java)
}