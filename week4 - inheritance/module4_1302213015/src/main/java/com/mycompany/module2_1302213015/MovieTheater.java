/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.module2_1302213015;

/**
 *
 * @author glori
 */
public class MovieTheater {
    Movie[] movies;
    Movie movie;
    public Movie[] getMovies() {
        return movies;
    }

    public void setMovies(Movie[] movies) {
        this.movies = movies;
    }
    public void printAllMovieInfo(){
        System.out.println("Daftar Film dalam theater ini: ");
        for (Movie movie : movies) {
            int i = 1;
            System.out.println("Film #" +i+": "+movie.title+ " dengan durasi " + movie.duration+ " menit");
            movie.printMovieInfo();
        }
    }
}
