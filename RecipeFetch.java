/**
 * RecipeFetch main class for testing
 *
 * @author Joshua Grebler
 * @version 3/6/19
 */
import org.jsoup.Jsoup;
import org.jsoup.nodes.*;
import java.io.IOException;

public class RecipeFetch
{
    public static void main(String[] args) {
        recipeSearch("nachos");
    }
    
    public static void recipeSearch(String term) {
        String url = String.format("https://www.allrecipes.com/search/results/?wt=%s",term);        
        try {
            Document doc = Jsoup.connect(url).get();
            
            Element first_result, image, link;
            first_result = doc.select(".fixed-recipe-card").first();
            image = first_result.select(".grid-card-image-container").first();
            link = image.select("a").first();
            String recipe_url = link.attr("abs:href");
                Recipe r = new Recipe(Jsoup.connect(recipe_url).get());
        }
        catch (IOException e) {
            System.out.println("error!");
        }   
    }
}
