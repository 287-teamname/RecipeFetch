/*
 * Contains all scraped information for each Recipe
 *
 * @author Joshua Grebler
 * @version 3/6/19
 */

import java.util.List;
import java.util.ArrayList;
import org.jsoup.nodes.*;
import org.jsoup.select.*;

public class Recipe
{
    private String name;
    private ArrayList<String> ingredients = new ArrayList<String>();
    

    /**
     * Constructor for objects of class Recipe
     */
    public Recipe(Document doc)
    {
        name = doc.title();
        
        Element pageContent = doc.selectFirst("div.slider-container").selectFirst("div.site-content").selectFirst("div#main-content").selectFirst("div.recipe-container-outer").selectFirst("section.ar_recipe_index");
        
        Elements ingredientLists = pageContent.selectFirst("section.recipe-ingredients").selectFirst("div#polaris-app").select("ul");
        for (Element i : ingredientLists){
            for (Element j : i.select("li")) {
                ingredients.add(j.select("label").first().attr("title"));
            }
        } 
    }
}
