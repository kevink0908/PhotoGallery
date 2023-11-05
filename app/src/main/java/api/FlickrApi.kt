package api

import FlickrResponse
import retrofit2.http.GET

private const val API_KEY = "145d5dc4fdff3edb562f0926ad2b359d"

interface FlickrApi {
    @GET(
        "services/rest/?method=flickr.interestingness.getList" +
                "&api_key=$API_KEY" +
                "&format=json" +
                "&nojsoncallback=1" +
                "&extras=url_s"
    )
    suspend fun fetchPhotos(): FlickrResponse
}