package SearchingAndSortingAlgorithms;

import java.util.ArrayList;
import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		int x=0;
		for(int i = 0; i<eggs.size();i++) {
			if(eggs.get(i).equals("cracked")) {
				x++;
			}
		}
		return x; //<- this needs changing
	}
	public static int countPearls(List<Boolean> oysters) {
		int x=0;
		for(int i = 0; i<oysters.size();i++) {
			if(oysters.get(i)==true) {
				x++;
			}
		}
		return x; //<- this needs changing
	}
	public static double findTallest(List<Double> peeps) {
		double x=0;
		for(int i = 0; i<peeps.size()-1;i++) {
			if(peeps.get(i)>peeps.get(i+1)) {
			x=peeps.get(i);	
			}
			else {
				x=peeps.get(i+1);
			}
			
		}
		return x; //<- this needs changing
	}
	public static String findLongestWord(List<String> words) {
		String x="";
		for(int i = 0; i<words.size()-1;i++) {
			if(words.get(i).length()>x.length()) {
				x=words.get(i);
			}
			else {
				
			}
			}
		return x; //<- this needs changing
	}
	public static boolean containsSOS(List<String> message) {
		boolean x=false;
		for(int i = 0; i<message.size();i++) {
			if(message.get(i).contains("... --- ...")) {
				x=true;
			}
		}
		return x; //<- this needs changing
	}
	public static List<Double> sortScores(List<Double> scores) {
		for(int i =0;i<scores.size();i++) {
			for(int x=0;x<scores.size()-1;x++) {
				if(scores.get(x)>scores.get(x+1)) {
					double tempf=scores.get(x);
					double temps=scores.get(x+1);
					scores.set(x, temps);
					scores.set(x+1, tempf);
				}
			}
		}
	//Add other methods here
		return scores; //<- this needs changing
}
	public static List<String> sortDNA(List<String> dna) {
		for(int i =0;i<dna.size();i++) {
			for(int x=0;x<dna.size()-1;x++) {
				if(dna.get(x).length()>dna.get(x+1).length()) {
					String tempf=dna.get(x);
					String temps=dna.get(x+1);
					dna.set(x, temps);
					dna.set(x+1, tempf);
				}
			}
		}
	//Add other methods here
		return dna; //<- this needs changing
}
	public static List<String> sortWords(List<String> dna) {
		for(int i =0;i<dna.size();i++) {
			for(int x=0;x<dna.size()-1;x++) {
				if(dna.get(x).compareTo(dna.get(x+1))>=0) {
					String tempf=dna.get(x);
					String temps=dna.get(x+1);
					dna.set(x, temps);
					dna.set(x+1, tempf);
				}
			}
		}
		return dna;
}
}