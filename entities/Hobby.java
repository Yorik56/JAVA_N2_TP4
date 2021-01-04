package com.tactfactory.javaniveau2.tps.tp4.entities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;



public enum Hobby {

	COOKING("french", "Cuisine"), 
	SPORTS("french", "Sport"), 
	SWIMMING("french", "Nage"),
	MOTO_CROSS("french", "Moto Crosse"), 
	BIKING("french", "Velo"), 
	VIDEO_GAMES("french", "Jeux Vidéos"),
	PROGRAMMMING("french", "Programmation");

	public final String language;
	public final String value;

	public static HashMap<Hobby, String> hobbyMap = new HashMap<Hobby, String>();

	private Hobby(String language, String value) {
		this.language = language;
		this.value = value;
	}

	public static Hobby[] getListHobbys() {
		return Hobby.values();
	}

	public static void printList() {
		System.out.println("Liste des \"Hobby\":");
		for (Hobby e : values()) {
			System.out.println(e.value);
		}
	}

	public static Hobby getRandom() {
		Random myRandomInt = new Random();
		int Count = Hobby.values().length;
		int idHobby = myRandomInt.nextInt(Count);
		return Hobby.values()[idHobby];

	}

	public static List<Hobby> getRandoms() {
		List<Hobby> randList = new ArrayList<Hobby>();
		Random myRandomBool = new Random();
		for (Hobby e : values()) {
			if (myRandomBool.nextBoolean()) {
				randList.add(e);
			}
		}
		return randList;
	}

	public static int showUsing(List<User> users, Hobby hobby) {
		return users.stream().filter(x -> x.getHobbies().contains(hobby)).collect(Collectors.toList()).size();
	}

}
