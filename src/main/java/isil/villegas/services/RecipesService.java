package isil.villegas.services;

import isil.villegas.models.RecipeResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by kento on 7/8/16.
 */
public interface RecipesService {

    @GET("api/")
    Call<RecipeResponse> listRecipes(@Query("q") String query);
}
