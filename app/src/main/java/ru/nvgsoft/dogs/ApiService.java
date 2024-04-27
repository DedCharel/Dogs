package ru.nvgsoft.dogs;

import io.reactivex.rxjava3.core.Single;
import retrofit2.http.GET;

public interface ApiService {
 // "image/random" - это последняя часть в строке запроса. В Url мы оставляем базовую часть
 // поэтому в ApiFactory мы указали BASE_URL = "https://dog.ceo/api/breeds/"
 // в итоге сложив все мы получаем BASE_URL = "https://dog.ceo/api/breeds/image/random"
    @GET("image/random")
    Single<DogImage> loadDogImage();
}
