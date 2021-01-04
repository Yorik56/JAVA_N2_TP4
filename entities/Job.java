package com.tactfactory.javaniveau2.tps.tp4.entities;

import java.util.HashMap;

public enum Job {

  DEVELOPER("french", "Développeur"),
  MANAGER("french", "Manageur"),
  ACCOUNTING("french", "Comptable"),
  HUMAN_RESOURCES("french", "Ressources humaines");
	
	public final String language;
	public final String value;
	
	public static HashMap <Job,String> jobMap = new HashMap<Job, String>();
	
	private Job(String language, String value) {
		this.language = language;
		this.value = value;
	}
	
	public static void printList() {
		System.out.println("Liste des \"jobs\":");
		for(Job e : values()) {
			System.out.println(e.value);
		}
	}
}
