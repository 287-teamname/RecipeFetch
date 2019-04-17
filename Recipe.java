/*
 * Contains all scraped information for each Recipe
 *
 * @author Joshua Grebler
 * @version 3/20/19
 */

import java.util.ArrayList;
import org.jsoup.nodes.*;
import org.jsoup.select.*;
import System.;

public class Recipe
{
    private String name; //The name of the dish
    private ArrayList<String> ingredients = new ArrayList<String>(); //the list of ingredients in the dish
    private String url;
	private String imageURL;

	// Constructor for objects of class Recipe
    public Recipe(Document doc, String u) // Class constructor takes an ALREADY ACCESSED jsoup doc as its first argument. Queries are not to be made through the constructor
    {
		url = u;
        name = doc.title().replace(" - Allrecipes.com", ""); // assigns dish name and removes trailing website title
        
		//First in the scraping process, we drill down to the level of the actual page content in which we are interested
        Element pageContent = doc.selectFirst("div.slider-container").selectFirst("div.site-content").selectFirst("div#main-content").selectFirst("div.recipe-container-outer").selectFirst("section.ar_recipe_index");
        
		//The ingredients can be split among one or more tables in the "recipe-ingredients" section, so we iterate through all of them
        Elements ingredientLists = pageContent.selectFirst("section.recipe-ingredients").selectFirst("div#polaris-app").select("ul");
 
 
		for (Element i : ingredientLists){
            for (Element j : i.select("li")) {
				//Having found the ingredients, we add each to the recipe object's list
                ingredients.add(j.select("label").first().attr("title"));
            }
        }
		
		imageURL = pageContent.select("div.summary-background").select("div.summaryGroup").select("section.hero-photo").select("div.hero-photo_image").select("div.hero-phoot_wrap").select("a").select("img").attr("src");
	}
	
	//prints the ingredients from the arraylist
	public void printIngredients() {
		for (String i : ingredients) {
			System.out.println(i);
		}
	}
	
	//accessor method for the recipe name
	public String getName() {
		return name;
	}
	
	//accessor method for the ingredients
	public ArrayList<String> getIngredients() {
		return ingredients;
	}
	
	public String getURL() {
		return url;
	}
	
	public String getIngredientString() {
		String s = "";
		for (String i : getIngredients()) {
			s += (i + "\n");
		}
		return s;
	}
	
	public String getImageURL() {
		return imageURL;
	}
}