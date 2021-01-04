package com.tactfactory.javaniveau2.tps.tp4;

import java.util.ArrayList;
import java.util.List;

import com.tactfactory.javaniveau2.tps.tp4.entities.Hobby;
import com.tactfactory.javaniveau2.tps.tp4.entities.Job;
import com.tactfactory.javaniveau2.tps.tp4.entities.User;

/**
 *
 * @author tactfactory
 *
 *         - Cr�er un programme qui permet de g�rer l'utilisation des
 *         �num�rations "Hobby" et "Job", attention Tp4.main devra �tre modifi�.
 *         - 1 : Hobby - 1 : La fonction printList() doit permettre d'afficher
 *         tous les "Hobby" disponibles en fran�ais. - 2 : La fonction
 *         getRandom() doit permettre de récupérer un "Hobby" parmis tous les
 *         "Hobby" possibles. - 3 : La fonction getRandoms() doit permettre de
 *         récupérer une liste de "Hobby" parmis tous les "Hobby" possibles
 *         sans avoir deux fois le même "Hobby" pour une même liste. - 4 : La
 *         fonction showUsing() doit permettre de voir le nombre de fois où un
 *         "Hobby" a été utilisé. - Pour ce point il faudrat utiliser la
 *         variable statique de type "Map" mise à disposition dans "Hobby" -
 *         Afin de pouvoir compter les éléments il ne faut plus pouvoir
 *         directement accéder à la liste de "Hobby" d'un utilisateur mais
 *         utiliser des fonctions dédiées à l'ajout et la suppression
 *         d'élément de la liste. - 2 : Job - 1 : La fonction printList() doit
 *         permettre d'afficher tous les "Job" disponibles en français. - 2 :
 *         La fonction getRandom() doit permettre de récupérer un "Job" parmis
 *         tous les "Job" possibles.
 *
 *         - Un exemple de sortie est disponible dans le fichier
 *         "possibleOutput"
 */
public class Tp4 {

	public static void main(String[] args) {
		
		Hobby.printList();
		Job.printList();

		System.out.println("Un hobby random:");
		System.out.println(Hobby.getRandom());

		System.out.println("Une liste de hobby random: ");
		System.out.println(Hobby.getRandoms());

		User u1 = new User();
		u1.setId(1);
		u1.setFirstname("zae");
		u1.setLastname("tre");
		u1.setMainHobby(Hobby.BIKING);
		u1.setJob(Job.ACCOUNTING);
		u1.getHobbies().add(Hobby.SPORTS);
		u1.getHobbies().add(Hobby.VIDEO_GAMES);

		System.out.println(u1);

		List<User> users = new ArrayList<User>();

		for (int i = 2; i < 12; i++) {
			User user = new User();
			user.setId(i);
			user.setFirstname("f" + i);
			user.setLastname("l" + i);
			user.setMainHobby(Hobby.getRandom());
			user.getHobbies().addAll(Hobby.getRandoms());

			users.add(user);
		}

		for (User user : users) {
			System.out.println(user);
		}

		for (Hobby item : Hobby.getListHobbys()) {
			System.out.println(item + " est utilis�  " + Hobby.showUsing(users, item) + " fois. ");
		}

	}

}
