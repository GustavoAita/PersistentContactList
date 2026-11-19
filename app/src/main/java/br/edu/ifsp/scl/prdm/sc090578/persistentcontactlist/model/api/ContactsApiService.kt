package br.edu.ifsp.scl.prdm.sc090578.persistentcontactlist.model.api

import br.edu.ifsp.scl.prdm.sc090578.persistentcontactlist.model.Contact
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path

interface ContactsApiService {
    @GET(value = "contacts")
    suspend fun getContacts(): Response<List<Contact>>
    @GET(value = "contacts/{id}")
    fun getContactsById(@Path("id") id: Int): Response<Contact>
    @POST(value = "contacts")
    fun addContact(@Body contact: Contact): Response<Contact>
    @PUT(value = "contacts/{id}")
    fun replaceContact(@Path("id") id: Int, @Body contact: Contact): Response<Contact>
    @DELETE("contacts/{id}")
    fun removeContact(@Path("id") id: Int)
}