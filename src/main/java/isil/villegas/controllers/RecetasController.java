/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isil.villegas.controllers;

import isil.villegas.models.RecipeResponse;
import isil.villegas.services.RecipesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import retrofit2.*;

import java.io.IOException;

/**
 *
 * @author Alumno-CT
 */
@Controller
public class RecetasController {
    
    @RequestMapping("/recetas")
    public ModelAndView index() throws IOException {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://www.recipepuppy.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        final RecipesService service = retrofit.create(RecipesService.class);

        Call<RecipeResponse> call = service.listRecipes("omelet");

        Response<RecipeResponse> response = call.execute();

        ModelAndView mav = new ModelAndView("recetas");
        mav.addObject("results", response.body().getResults());
        return mav;

    }
}
