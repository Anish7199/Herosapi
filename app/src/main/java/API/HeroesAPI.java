package API;

import java.util.List;
import java.util.Map;

import model.Model;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface HeroesAPI {

    @GET("heroes")
    Call<List<Model>> getheroes();

    @POST("heroes")
    Call<Void> registerHeroes(@Body Model Mod);

    @FormUrlEncoded
    @POST("heroes")
    Call<Void> addHero(@Field("name") String name,@Field("desc") String desc);


    @FormUrlEncoded
    @POST("heroes")
    Call<Void> addHero(@FieldMap Map<String,String> map);
}
