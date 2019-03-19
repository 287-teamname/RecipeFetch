/**
 * RecipeFetch main class for testing the scraper branch
 *
 * @author Joshua Grebler
 * @version 3/19/19
 */
 
 public class RecipeFetch
 {
	 public static void main (String[] args) {
		Recipe pickles = Search.search("Pickles");
		pickles.printIngredients();
	 }
 }