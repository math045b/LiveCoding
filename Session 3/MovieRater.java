import java.util.*;

public class MovieRater {
    public static void main(String[] args) {
        Map<String, List<Double>> movie_reviews = new HashMap<>();
        
        movie_reviews.put("The Odyssey", generate_ratings());
        movie_reviews.put("Alle for to", generate_ratings());
        movie_reviews.put("Elf", generate_ratings());
        
        while (true) {
            System.out.println("Her er vores film: ");
            for (String movie : movie_reviews.keySet()) {
                System.out.println(" - " + movie + " Rating: " + calculate_average_rating(movie_reviews.get(movie))); 
            }
            
            System.out.println("Indtast titlen på en film for at anmelde den!");
            
            Scanner scanner = new Scanner(System.in);
            
            String selected_movie = null;
            while (selected_movie == null) {
                String input = scanner.nextLine();
                if (movie_reviews.containsKey(input)) {
                    selected_movie = input;
    
                } else {
                    System.out.println("Den film har vi ikke, prøv igen!");
                }
            }
            
            System.out.println("Tilføj en rating!");
            double rating = scanner.nextDouble();
            List<Double> ratings = movie_reviews.get(selected_movie);
            ratings.add(rating);
            
            double new_average = calculate_average_rating(ratings);
            
            System.out.println("Ny gennemsnitlig rating: " + new_average);
        }
    }
    public static double calculate_average_rating(List<Double> ratings) {
        if (ratings.size() == 0) {
            return 0.0;
        } else {
            double sum = 0.0;
            for (double film_rating : ratings) {
                sum = sum + film_rating;
            }
            double average = sum / ratings.size();
            return average;
        }
    }
    public static List<Double> generate_ratings() {
        List<Double> ratings = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 300; i++) {
            double random_number = random.nextDouble() * 10;
            ratings.add(random_number);
        }
        return ratings;
    }
}