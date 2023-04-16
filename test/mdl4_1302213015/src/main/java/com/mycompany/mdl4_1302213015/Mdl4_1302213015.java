/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mdl4_1302213015;

/**
 *
 * @author glori
 */
public class Mdl4_1302213015 {

     @SuppressWarnings("empty-statement")
     public static void main(String[] args) {
        Movie movie = new Movie("Janda Tua",150);
        movie.printMovieInfo();
        
        Movie[] movies = new Movie[5];
        
        movies[0] = new Movie("info1",150);
        movies[1] = new Movie("info2",100);
        movies[2] = new Movie("info3",90);
        movies[3] = new Movie("info4",10);
        movies[4] = new Movie("info5",50);
        
        MovieTheater film = new MovieTheater();
        film.setMovies(movies);
        
        film.printAllMovieInfo();
        
    }
}
