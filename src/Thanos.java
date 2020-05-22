import java.util.*;

public class Thanos {

    public static void main(String[] args) {

        // TODO 1 : Create an empty heroes list
        ArrayList<Hero> heroes = new ArrayList<>();

        // TODO 2 : Add those heroes to the list
        heroes.add(new Hero("Black Widow", 34));
        heroes.add(new Hero("Captain America",100));
        heroes.add(new Hero("Vision",3));
        heroes.add(new Hero("Iron Man",48));
        heroes.add(new Hero("Scarlet Witch",29));
        heroes.add(new Hero("Thor",1500));
        heroes.add(new Hero("Hulk",49));
        heroes.add(new Hero("Doctor Strange",42));

        //Hero blackWidow = new Hero ("Black Widow", 34);
        //heroes.add(blackWidow);

        System.out.println(herosList(heroes));
        System.out.println("");


        // TODO 3 : It's Thor birthday, now he's 1501
        System.out.println("C'est l'anniversaire de Thor!");
        Hero thorBirthday = new Hero("Thor", 1501);
        heroes.set(5, thorBirthday);

        System.out.println(thorBirthday.getName()+" a " + thorBirthday.getAge() + " ans.");

        //for (Hero hero : heroes) {
        //    if (hero.getName() == "Thor") {
        //        hero.setAge( hero.getAge() + 1 );
        //        System.out.println(hero.getName() + " a " + hero.getAge() + " ans.");
        //    }
        //}

        System.out.println(herosList(heroes));
        System.out.println("");

        // TODO 4 : Shuffle the heroes list
        System.out.println("Le mélange donne la liste suivante :");
        Collections.shuffle(heroes);

        System.out.println(herosList(heroes) + ", sont les héros mélangés.");
        System.out.println("");

        // TODO 5 : Keep only the half of the list
        for (int i = 0 ; i< heroes.size() ; i++) {
          heroes.remove(i);
        }

        // System.out.println(herosList(heroes) + ", sont les héros survivants.");
        // System.out.println("");

        // TODO 6 : Loop throught the list and display the name of the remaining heroes
        for (Hero aliveHero : heroes) {
                System.out.println(aliveHero.getName() + " a survécu au pouvoir de Thanos.");
        }


    }


    //fonction pour afficher la liste des héros recue en paramètre #MERCI JEAN-LOUP
        private static String herosList(ArrayList<Hero> pHeroes) {
            String res = "";
            for (Hero hero : pHeroes) {
                if  (res != "" ) { res += ", "; }
                res += hero.getName() + " à " + hero.getAge() + " an(s)";
        }
        return res;

    }
}