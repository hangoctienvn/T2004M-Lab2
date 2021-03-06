package Array;

import java.util.ArrayList;

public class MovieList {
    private ArrayList<String> movieList = new ArrayList<>();

    public void addMovieItem(String item){
        movieList.add(item);
    }

    public void printMovieList(){
        System.out.println("You have" + movieList.size()+ "items in your Movie List");
        for (int i=0; i< movieList.size(); i++){
            System.out.println((i+1) +". " +movieList.get(i));
        }
    }
    public void modifyMovieItem(int position, String newItem){
        movieList.set(position, newItem);
        System.out.println("Movie item " + (position+1) + " has been modified.");
    }

    public void removeMovieItem(int position){
        String theItem = movieList.get(position);
        movieList.remove(position);
        System.out.println("Remove item " + theItem);
    }

    public String findItem(String searchItem){
    //    boolean exist = movieList.contains(searchItem);
        int position = movieList.indexOf(searchItem);
        if(position >=0){
            return movieList.get(position);

        }
        return null;
    }
    public static void Main(String[] args){
        MovieList list = new MovieList();
        list.addMovieItem("Mắt Biếc");
        list.addMovieItem("Vị đắng tình yêu");
        list.addMovieItem("Chị trợ lý của anh");
        list.addMovieItem("Hai phượng");
        list.printMovieList();

        String search = list.findItem("Mắt biếc");
        System.out.println(search);

        list.modifyMovieItem(1,"mắt đen");
        list.printMovieList();

    }
}
