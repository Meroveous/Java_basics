package tournament;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Teams {

	String name;
	int ranking;
	
	public Teams(String name, int ranking) {
		this.name = name;
		this.ranking = ranking;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public int getRanking() {
		return ranking;
	}

	public void setRanking(int ranking) {
		this.ranking = ranking;
	}
	
	static ArrayList<String> seeds = new ArrayList<String>();
	static ArrayList<String> match1 = new ArrayList<String>();
	static ArrayList<String> match2 = new ArrayList<String>();
	
	public static void round1() {
		match1.add(seeds.get(0));
		match1.add(seeds.get(3));
	}
	
	public static void round2() {
		match2.add(seeds.get(1));
		match2.add(seeds.get(2));
	}
	
	
	
	public static void userChoiceTeams() {
	      System.out.println("Enter teams, high to low, in order of rankings. Begin with Team 1.");
	      Scanner userInput = new Scanner(System.in);
	      String Team_1 = userInput.nextLine();
	      seeds.add(Team_1);
	      System.out.println("Enter Team 2.");
	      String Team_2 = userInput.nextLine();
	      seeds.add(Team_2);
	      System.out.println("Enter Team 3.");
	      String Team_3 = userInput.nextLine();
	      seeds.add(Team_3);
	      System.out.println("Enter Team 4.");
	      String Team_4 = userInput.nextLine();
	      seeds.add(Team_4);
	      System.out.println("Done.");
	      userChoiceMenu();
	}      
	      
	
	public static void userChoiceMenu() {
	      System.out.println("Menu: Click 1 to enter teams. Click 2 to pull up the list of teams. Click 3 to show tournament matchups. Click 0 to exit the tournament");
	      Scanner userInput = new Scanner(System.in);
	      int menu = userInput.nextInt();
	      if(menu == 1) {
	    	  userChoiceTeams();  
	      }
	      else if(menu == 2) {
	    	  System.out.println(seeds);
	    	  userChoiceMenu();
	      }
	      else if(menu == 3) {
	    	  round1();
	    	  round2();
	    	  System.out.println(match1);
	    	  System.out.println(match2);
	    	  userChoiceMenu();
	      }
	      else if (menu == 0) {
	    	  System.out.println("Laters!!");
	      }
	}
	
	 public static int score() {
	        Random rand = new Random();
	          int scoreOne = rand.nextInt(50);
	          return scoreOne;
	    }
	
	
	
	public static void main(String[] args) {
		userChoiceMenu();
		
	}





}
