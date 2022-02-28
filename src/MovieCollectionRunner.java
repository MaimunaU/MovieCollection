import java.util.ArrayList;

public class MovieCollectionRunner
{
  public static void main(String[] args)
  {
    MovieCollection movies = new MovieCollection("src//movies_data.csv");
    movies.menu();

  }
}