package sait.mms.managers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import sait.mms.problemdomain.Movie;

public class MovieManagementSystem {
	int duration;
	String title;
	int year;
	
	
	public static String TEXT_FILE = "res\\movies.txt";
	private ArrayList<Movie> movies= new ArrayList<>();
	


	public void loadMovies() throws FileNotFoundException {
		
		File file = new File(TEXT_FILE);
		Scanner load = new Scanner(file);
		
		//Load movies from text file into array list.
		while(load.hasNextLine()) {
			
			String data = load.nextLine();
			String[] columns= data.split(",");
			duration = Integer.parseInt(columns[0]);
			title = columns[1];
			year =Integer.parseInt(columns[2]);
			
			Movie addmovies = new Movie(duration,title,year);
			
			movies.add(addmovies);
		}
	}
		
	

	public void addMovie(int duration, String title, int year) {
		
		
		 if(duration>= 0 && title != "" && year >0) {
			 Movie addMovie = new Movie(duration,title,year);
			 movies.add(addMovie);
			 System.out.println("Added movie to the data file.");
		 }
		 
		 else if(duration<0) {
			 System.out.println("Error: The movie duration should be any number greater than zero.");
		 }
			 
		 else if(year<=0) {
			 System.out.println("Error: The release year should be any number greater than zero.");
		 }
		 else {
			 System.out.println("Error: The movie title should have at least one character.");
		 }
			 
		 }
		
	
		
	

	public void generateMoviesInYear(int year) {
		
	
		System.out.println("Movie List");
		System.out.printf("%s %s %s %n","Duration","Year","Title");
		

		for(Movie movie:movies) {
		
			if(movie.getYear() == year) {
				duration +=  movie.getDuration();
					System.out.println(movie);
					
			}
			
		}
		System.out.println("Total duration:" + duration + "minutes");
			
	}
		
		

	public void generateRandomMovies(int number) {
		
		for(int i=1;i<=number;i++) {
			
		}
		
		
	}

	public void writeMoviesToFile() {
		
		
		
	}

	public void displayMenu() {
			
		while(true) {
		 System.out.println("Movie Management System");
         System.out.println("1	Add New Movie and Save");
         System.out.println("2	Generate List of Movies Released in a Year");
         System.out.println("3	Generate List of Random Movies");
         System.out.print("4	Save & Exit");
		 System.out.println();
		 System.out.println("Enter an option:");
		 
		 Scanner keyboard = new Scanner (System.in);
		
		 int option =keyboard.nextInt();
		 
				if(option==1) {
			
				 System.out.println("Enter duration:");
				 duration= keyboard.nextInt();
				
		         System.out.println("Enter movie title:");
		         title = keyboard.nextLine();
		         keyboard.nextLine();
		         
		         System.out.println("Enter year:");
		         year = keyboard.nextInt();
		         
		        addMovie(duration,title,year);
		         
		        System.out.println("Saving movies...");
		        System.out.println("Added movie to the data file.");
			 }
					
					
				}
			}
		
	}

		
	


