package mad_libs;

import java.util.Scanner;
public class Mad_Libs {

	public static void main(String[] args) {
		//Noun
		// Person
		//Verb
		// Adjective
		
		//Scanner
		Scanner input = new Scanner(System.in);
		
		//Variables
		String adjective1;
		String adjective2;
		String noun1;
		String noun2;
		String plural_noun1;
		String game;
		String plural_noun2;
		String verb_ending_in_ing1;
		String verb_ending_in_ing2;
		
		//Questions / Input
		System.out.println("A vacation is when you take a trip to some (adjective1) place");
		adjective1 = input.nextLine();
		
		System.out.println("with your (adjective2) family");
		adjective2 = input.nextLine();
		
		System.out.println("Usually you go to some place that is near a/an (noun1)");
		noun1 = input.nextLine();
		
		System.out.println("or up on a/an (noun2)");
		noun2 = input.nextLine();
		
		System.out.println("A good vacation place is one where you can ride (plural noun1)");
		plural_noun1 = input.nextLine();
		
		System.out.println("or play (game)");
		game = input.nextLine();
		
		System.out.println("or go hunting for (plural noun2)");
		plural_noun2 = input.nextLine();
		
		System.out.println("I like to spend my time (verb ending in 'ing'1)");
		verb_ending_in_ing1 = input.nextLine();
		
		System.out.println("or (verb ending in 'ing'1)");
		verb_ending_in_ing2 = input.nextLine();

	}

}
